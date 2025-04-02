package com.meistermeier.fitfile4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Gerrit Meier
 */
public class FitFileStream {

	private static final Logger LOGGER = LoggerFactory.getLogger(FitFileStream.class);

	private final InputStream fitFileInputStream;
	private int position = 0;

	public FitFileStream(InputStream fitFileInputStream) {
		this.fitFileInputStream = fitFileInputStream;
	}


	public int available() throws IOException {
		return fitFileInputStream.available();
	}

	public int read() throws IOException {
		LOGGER.trace("reading...");
		position += 1;
		return fitFileInputStream.read();
	}

	public byte[] readNBytes(int i) throws IOException {
		LOGGER.trace("reading {} bytes", i);
		position += i;
		return fitFileInputStream.readNBytes(i);
	}

	public int pos() {
		return position;
	}
}
