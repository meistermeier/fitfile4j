/*
 * Copyright 2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.meistermeier.fitfile4j.cli.commands;

import com.meistermeier.fitfile4j.FitFile;
import picocli.CommandLine;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Path;
import java.util.concurrent.Callable;

/**
 * Command to generate path images from fit file coordinates
 */
@CommandLine.Command(name = "image")
public class ImageCommand implements Callable<Integer> {

	@CommandLine.Parameters
	File fitFileSource;

	@CommandLine.Option(names = "--size", required = true)
	Integer size;

	@CommandLine.Option(names = "--color", defaultValue = "FF0000")
	String color;

	@Override
	public Integer call() throws Exception {
		createImage(FitFile.from(fitFileSource));
		return 0;
	}

	record Coords(long x, long y) {
	}

	private void createImage(FitFile fitFile) throws Exception {
		var coordinates = fitFile.messages()
			.stream()
			.filter(message -> message.messageNumber() == 20)
			.filter(m -> m.fields().getEntryByFieldDefinitionNumber(0).isPresent()
					&& m.fields().getEntryByFieldDefinitionNumber(1).isPresent())
			.map(m -> new Coords((long) m.fields().getEntryByFieldDefinitionNumber(1).get().value(),
					-(long) m.fields().getEntryByFieldDefinitionNumber(1).get().value()))
			.toList();
		var minX = Long.MAX_VALUE;
		var minY = Long.MAX_VALUE;
		var maxX = Long.MIN_VALUE;
		var maxY = Long.MIN_VALUE;
		for (Coords coordinate : coordinates) {
			if (coordinate.x() < minX) {
				minX = coordinate.x();
			}
			if (coordinate.x() > maxX) {
				maxX = coordinate.x();
			}
			if (coordinate.y() < minY) {
				minY = coordinate.y();
			}
			if (coordinate.y() > maxY) {
				maxY = coordinate.y();
			}
		}
		var xDiff = -minX;
		var yDiff = -minY;

		var imageResolution = size;
		var margin = 25;
		var alpha = 255;
		var rgb = Integer.parseInt(color, 16);
		var xScaleFactor = ((double) (imageResolution - margin * 2) / (maxX + xDiff));
		var yScaleFactor = ((double) (imageResolution - margin * 2) / (maxY + yDiff));
		var image = new BufferedImage(imageResolution, imageResolution, BufferedImage.TYPE_INT_ARGB);
		for (Coords coordinate : coordinates) {
			var xInImageSpace = (int) ((coordinate.x() + xDiff) * xScaleFactor) + margin;
			var yInImageSpace = (int) ((coordinate.y() + yDiff) * yScaleFactor) + margin;
			int resultingColor = rgb + (alpha << 24);
			image.setRGB(xInImageSpace, yInImageSpace, resultingColor);
			image.setRGB(xInImageSpace + 1, yInImageSpace + 1, resultingColor);
			image.setRGB(xInImageSpace - 1, yInImageSpace - 1, resultingColor);

		}

		ImageIO.write(image, "png", Path.of("./test.png").toFile());
	}

}
