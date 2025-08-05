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
import com.meistermeier.fitfile4j.names.FieldName;
import com.meistermeier.fitfile4j.names.MESG_NUM;
import picocli.CommandLine;

import javax.imageio.ImageIO;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.Callable;

/**
 * Command to generate path images from fit file coordinates
 */
@CommandLine.Command(name = "image", description = "Create a track image from a .fit file.")
public class ImageCommand implements Callable<Integer> {

	public static final int RECORD_LATITUDE_FIELD = FieldName.POSITION_LAT_20.getFieldNumber();
	public static final int RECORD_LONGITUDE_FIELD = FieldName.POSITION_LONG_20.getFieldNumber();
	@CommandLine.Parameters(index = "0", description = "source .fit file")
	File fitFileSource;

	@CommandLine.Parameters(index = "1", defaultValue = "output.png", description = "target file", showDefaultValue = CommandLine.Help.Visibility.ALWAYS)
	String targetFile;

	@CommandLine.Option(names = "--size", required = true, description = "image size")
	Integer size;

	@CommandLine.Option(names = "--color", defaultValue = "FF0000", description = "rgb color in hex format", showDefaultValue = CommandLine.Help.Visibility.ALWAYS)
	String color;

	@CommandLine.Option(names = "--border", defaultValue = "false", description = "render border around track")
	Boolean border;

	@Override
	public Integer call() throws Exception {
		createImage(FitFile.from(fitFileSource));
		return 0;
	}

	record RecordEntry(long x, long y) {
	}

	private void createImage(FitFile fitFile) throws Exception {
		var coordinates = fitFile.messages()
			.stream()
			.filter(message -> message.messageNumber() == MESG_NUM._RECORD.getMessageNumber())
			.filter(m ->
					entry(m, RECORD_LATITUDE_FIELD).isPresent()
					&& entry(m, RECORD_LONGITUDE_FIELD).isPresent())
			.map(m -> new RecordEntry(
					(long) (entry(m, RECORD_LONGITUDE_FIELD).get().value()),
					-(long) (entry(m, RECORD_LATITUDE_FIELD).get().value()))
			)
			.toList();
		var minX = Long.MAX_VALUE;
		var minY = Long.MAX_VALUE;
		var maxX = Long.MIN_VALUE;
		var maxY = Long.MIN_VALUE;
		for (RecordEntry coordinate : coordinates) {
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
		// fixed alpha for now
		var alpha = 255;
		var rgb = Integer.parseInt(color, 16);
		var xScaleFactor = ((double) (imageResolution - margin * 2) / (maxX + xDiff));
		var yScaleFactor = ((double) (imageResolution - margin * 2) / (maxY + yDiff));
		var image = new BufferedImage(imageResolution, imageResolution, BufferedImage.TYPE_INT_ARGB);
		int[] xCoords = new int[coordinates.size()];
		int[] yCoords = new int[coordinates.size()];
		for (int i = 0; i < coordinates.size(); i++) {
			RecordEntry coordinate = coordinates.get(i);
			var xInImageSpace = (int) ((coordinate.x() + xDiff) * xScaleFactor) + margin;
			var yInImageSpace = (int) ((coordinate.y() + yDiff) * yScaleFactor) + margin;
			xCoords[i] = xInImageSpace;
			yCoords[i] = yInImageSpace;
		}
		var graphics = image.createGraphics();
		var baseColor = new Color(rgb + (alpha << 24));
		if (border) {
			graphics.setColor(baseColor.darker().darker().darker().darker());
			graphics.setStroke(new BasicStroke(15.0f));
			graphics.drawPolyline(xCoords, yCoords, xCoords.length);

			graphics.setColor(baseColor.darker().darker());
			graphics.setStroke(new BasicStroke(10.0f));
			graphics.drawPolyline(xCoords, yCoords, xCoords.length);
		}
		graphics.setColor(baseColor);
		graphics.setStroke(new BasicStroke(3.0f));
		graphics.drawPolyline(xCoords, yCoords, xCoords.length);

		ImageIO.write(image, "png", Path.of(targetFile).toFile());
	}

	private Optional<FitFile.Entry> entry(FitFile.Message m, int messageNumber) {
		return m.fields().getEntryByFieldDefinitionNumber(messageNumber);
	}

}
