package com.meistermeier.fitfile4j.cli.commands;

import com.meistermeier.fitfile4j.FitFile;
import com.meistermeier.fitfile4j.cli.FitFile4j;
import picocli.CommandLine;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.nio.file.Path;
import java.util.concurrent.Callable;

@CommandLine.Command(name = "image")
public class ImageCommand implements Callable<Integer> {

	@CommandLine.ParentCommand
	FitFile4j parent;

	@CommandLine.Option(names = "--size")
	Integer size;

	@CommandLine.Option(names = "--color", defaultValue = "FF0000")
	String color;

	@Override
	public Integer call() throws Exception {
		createPicture(FitFile.from(parent.getFitFile()));
		return 0;
	}

	record Coords(long x, long y) {
	}

	private void createPicture(FitFile fitFile) throws Exception {
		var coordinates = fitFile.messages().stream().filter(message -> message.messageNumber() == 20)
			.filter(m -> m.fields().get(new FitFile.Field(null, 0, false)) != null)
			.map(m -> new Coords((long) m.fields().get(new FitFile.Field(null, 1, false)), -(long) m.fields().get(new FitFile.Field(null, 0, false))))
			.toList();
		var minX = Long.MAX_VALUE;
		var minY = Long.MAX_VALUE;
		var maxX = Long.MIN_VALUE;
		var maxY = Long.MIN_VALUE;
		for (
			Coords coordinate : coordinates) {
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
			int color = rgb + (alpha << 24);
			image.setRGB(xInImageSpace, yInImageSpace, color);
			image.setRGB(xInImageSpace + 1, yInImageSpace + 1, color);
			image.setRGB(xInImageSpace - 1, yInImageSpace - 1, color);

		}

		ImageIO.write(image, "png", Path.of("./test.png").toFile());
	}
}
