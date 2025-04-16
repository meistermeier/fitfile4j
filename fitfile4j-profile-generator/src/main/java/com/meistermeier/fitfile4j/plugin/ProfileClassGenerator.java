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
package com.meistermeier.fitfile4j.plugin;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Create enums from Garmin's Profile.xlsx file
 */
public class ProfileClassGenerator {

	public static void main(String[] args) throws Exception {
		var pcg = new ProfileClassGenerator(args[0], args[1], args[2]);
		pcg.createMessageNameMappings();
	}

	private final String outputDirectory;
	private final String packageName;
	private final ProfileParser profileParser;

	public ProfileClassGenerator(String profileSource, String outputDirectory, String packageName) {
		this.outputDirectory = outputDirectory;
		this.packageName = packageName;
		this.profileParser = new ProfileParser(profileSource);
	}

	void createMessageNameMappings() throws IOException {
		var messageNames = this.profileParser.parseMessageNames();
		var fieldNames = this.profileParser.parseFieldNames(messageNames);
		var messagesEnum = createMessageNames(messageNames, packageName);
		var fieldsEnum = createFieldNames(fieldNames, packageName);
		if (outputDirectory != null && !outputDirectory.isBlank()) {
			var output = Path.of(outputDirectory);
			messagesEnum.writeTo(output);
			fieldsEnum.writeTo(output);
		} else {
			messagesEnum.writeTo(System.out);
			fieldsEnum.writeTo(System.out);
		}
	}

	private JavaFile createMessageNames(Map<Integer, String> messageNames, String packageNameToUse) {
		var messageNameEnumBuilder = TypeSpec.enumBuilder("MessageName")
			.addJavadoc("Name of messages to be mapped from their ids")
			.addModifiers(Modifier.PUBLIC);
		for (Map.Entry<Integer, String> message : messageNames.entrySet()) {
			messageNameEnumBuilder.addEnumConstant(
				message.getValue().toUpperCase(Locale.ROOT),
				TypeSpec.anonymousClassBuilder("$L, $S", message.getKey(), message.getValue()).build()
			);
		}
		messageNameEnumBuilder.addField(int.class, "messageNumber", Modifier.PRIVATE, Modifier.FINAL);
		messageNameEnumBuilder.addField(String.class, "messageName", Modifier.PRIVATE, Modifier.FINAL);
		messageNameEnumBuilder.addMethod(MethodSpec.constructorBuilder()
			.addParameter(int.class, "messageNumber")
			.addParameter(String.class, "messageName")
			.addCode(CodeBlock.builder()
				.add("""
					this.messageNumber = messageNumber;
					this.messageName = messageName;
					""")
				.build())
			.build());
		messageNameEnumBuilder
			.addMethod(MethodSpec.methodBuilder("findById")
				.addModifiers(Modifier.STATIC, Modifier.PUBLIC)
				.addParameter(int.class, "messageNumber")
				.addCode(CodeBlock.builder()
					.add("""
						for (MessageName name: MessageName.values()) {
							if (name.messageNumber == messageNumber) {
								return name;
							}
						}
						return null;
						""")
					.build())
				.returns(ClassName.get(packageNameToUse, "MessageName"))
				.build());
		messageNameEnumBuilder
			.addMethod(MethodSpec.methodBuilder("getMessageName")
				.addModifiers(Modifier.PUBLIC)
				.addCode("return this.messageName;")
				.returns(String.class)
				.build());
		var messageNameEnum = messageNameEnumBuilder.build();
		return JavaFile.builder(packageNameToUse, messageNameEnum)
			.skipJavaLangImports(true)
			.build();
	}

	private JavaFile createFieldNames(List<ProfileParser.FieldName> fieldNames, String packageNameToUse) {
		var messageNameEnumBuilder = TypeSpec.enumBuilder("FieldName")
			.addJavadoc("Name of messages to be mapped from their ids")
			.addModifiers(Modifier.PUBLIC);
		for (ProfileParser.FieldName fieldName : fieldNames) {
			messageNameEnumBuilder.addEnumConstant(
				fieldName.name().toUpperCase(Locale.ROOT) + "_" + fieldName.messageNumber(),
				TypeSpec.anonymousClassBuilder("$L, $L, $S", fieldName.messageNumber(), fieldName.fieldNumber(), fieldName.name()).build()
			);
		}
		messageNameEnumBuilder.addField(int.class, "messageNumber", Modifier.PRIVATE, Modifier.FINAL);
		messageNameEnumBuilder.addField(int.class, "fieldNumber", Modifier.PRIVATE, Modifier.FINAL);
		messageNameEnumBuilder.addField(String.class, "fieldName", Modifier.PRIVATE, Modifier.FINAL);
		messageNameEnumBuilder.addMethod(MethodSpec.constructorBuilder()
			.addParameter(int.class, "messageNumber")
			.addParameter(int.class, "fieldNumber")
			.addParameter(String.class, "fieldName")
			.addCode(CodeBlock.builder()
				.add("""
					this.messageNumber = messageNumber;
					this.fieldNumber = fieldNumber;
					this.fieldName = fieldName;
					""")
				.build())
			.build());
		messageNameEnumBuilder
			.addMethod(MethodSpec.methodBuilder("findById")
				.addModifiers(Modifier.STATIC, Modifier.PUBLIC)
				.addParameter(int.class, "messageNumber")
				.addParameter(int.class, "fieldNumber")
				.addCode(CodeBlock.builder()
					.add("""
						for (FieldName name: FieldName.values()) {
							if (name.messageNumber == messageNumber && name.fieldNumber == fieldNumber) {
								return name;
							}
						}
						return null;
						""")
					.build())
				.returns(ClassName.get(packageNameToUse, "FieldName"))
				.build());
		messageNameEnumBuilder
			.addMethod(MethodSpec.methodBuilder("getFieldName")
				.addModifiers(Modifier.PUBLIC)
				.addCode("return this.fieldName;")
				.returns(String.class)
				.build());
		var messageNameEnum = messageNameEnumBuilder.build();
		return JavaFile.builder(packageNameToUse, messageNameEnum)
			.skipJavaLangImports(true)
			.build();
	}
}
