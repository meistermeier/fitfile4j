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
