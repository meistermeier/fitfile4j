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
package com.meistermeier.fitfile4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/**
 * {@link InputStream} wrapper to enable insights into ongoing
 * reading, like current position and actual read bytes.
 *
 * @author Gerrit Meier
 */
class FitFileStream implements Closeable {

	private static final Logger LOGGER = LoggerFactory.getLogger(FitFileStream.class);

	private final InputStream fitFileInputStream;
	private int position = 0;

	FitFileStream(InputStream fitFileInputStream) {
		this.fitFileInputStream = fitFileInputStream;
	}


	int available() throws IOException {
		return fitFileInputStream.available();
	}

	int read() throws IOException {
		LOGGER.trace("reading one byte");
		position += 1;
		return fitFileInputStream.read();
	}

	byte[] readNBytes(int i) throws IOException {
		LOGGER.trace("reading {} bytes", i);
		position += i;
		return fitFileInputStream.readNBytes(i);
	}

	int pos() {
		return position;
	}

	@Override
	public void close() throws IOException {
		fitFileInputStream.close();
	}
}
