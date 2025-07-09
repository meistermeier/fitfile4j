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
package com.meistermeier.fitfile4j.test;

import ch.qos.logback.classic.Level;
import com.meistermeier.fitfile4j.FitFile;
import com.meistermeier.fitfile4j.names.FieldName;
import com.meistermeier.fitfile4j.names.MESG_NUM;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class FitFileTest {

	// used for debugging
	static {
		var logger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
		logger.setLevel(Level.WARN);
	}

	FitFile fitFile;

	{
		try {
			fitFile = FitFile.from(FitFileTest.class.getResourceAsStream("/raw_run.fit"));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Test
	void shouldLoadAFitFile() {
		assertThat(fitFile).isNotNull();
	}

	@Test
	void resolvesMessagesCorrectly() {
		var messages = fitFile.messages();
		assertThat(messages.size()).isEqualTo(3611);
	}

	@Test
	void canAccessFieldCorrectly() {
		var productField = fitFile.getEntry(FieldName.PRODUCT_0);
		assertThat(productField.getFirst().field().fieldDefinitionNumber()).isEqualTo(2);
		assertThat(productField.getFirst().value()).isEqualTo(3077);
	}

	@Test
	void canAccessMultipleFieldsOfAMessageCorrectly() {
		var recordCoordinates = fitFile.getEntries(FieldName.POSITION_LAT_20, FieldName.POSITION_LONG_20);
		assertThat(recordCoordinates.size()).isEqualTo(303);
		assertThat(recordCoordinates.get(0).size()).isEqualTo(2);
	}

	@Test
	void canAccessMultipleFieldsOfMultipleMessageCorrectly() {
		var recordCoordinates = fitFile.getEntries(FieldName.POSITION_LAT_20, FieldName.POSITION_LONG_20,
				FieldName.PRODUCT_0);
		assertThat(recordCoordinates.size()).isEqualTo(304);
		assertThat(recordCoordinates.get(0).size()).isEqualTo(1);
		assertThat(recordCoordinates.get(1).size()).isEqualTo(2);
	}

	@Test
	void canAccessSpecificMessage() {
		var fileIdMessages = fitFile.getMessages(MESG_NUM._FILE_ID);
		assertThat(fileIdMessages).hasSize(1);
		assertThat(fileIdMessages.get(0).messageNumber()).isEqualTo(0);
	}

	@Test
	void multipleMessagesAreOrderedByTheirMessageNumber() {
		var messages = fitFile.getMessages(MESG_NUM._ACTIVITY, MESG_NUM._FILE_ID);
		assertThat(messages).hasSize(2);
		assertThat(messages.get(0).messageNumber()).isEqualTo(0);
		assertThat(messages.get(1).messageNumber()).isEqualTo(34);
	}

	@Test
	void messagesAreStillSortedByTimestamp() {
		var recordMessages = fitFile.getMessages(MESG_NUM._RECORD);
		var firstTimestamp = (Long) recordMessages.getFirst()
			.fields()
			.getEntryByFieldDefinitionNumber(FieldName.TIMESTAMP_20.getFieldNumber())
			.get()
			.value();
		var lastTimestamp = (Long) recordMessages.getLast()
			.fields()
			.getEntryByFieldDefinitionNumber(FieldName.TIMESTAMP_20.getFieldNumber())
			.get()
			.value();
		assertThat(firstTimestamp).isLessThan(lastTimestamp);
	}

}
