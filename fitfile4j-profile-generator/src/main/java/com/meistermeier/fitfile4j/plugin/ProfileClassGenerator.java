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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Create enums from Garmin's Profile.xlsx file
 */
public class ProfileClassGenerator {

	/**
	 * Generate enum files MessageName and FieldName from given Profile.xlsx
	 *
	 * @param args sourceDir, outputDirectory, packageName
	 * @throws Exception might fail, nothing gets caught
	 */
	public static void main(String[] args) throws Exception {
		var pcg = new ProfileClassGenerator(args[0], args[1], args[2]);
		pcg.createMessageNameMappings();
//		helper function to create initial SQL
//		pcg.createSql();
	}

	private final String outputDirectory;
	private final String packageName;
	private final ProfileParser profileParser;

	public ProfileClassGenerator(String profileSource, String outputDirectory, String packageName) {
		this.outputDirectory = outputDirectory;
		this.packageName = packageName;
		this.profileParser = new ProfileParser(profileSource);
	}
/*
	void createSql() throws Exception {
		var types = this.profileParser.parseTypes();
		var fieldNames = this.profileParser.parseFieldNames(types.get("MESG_NUM"));
		List<String> createStatements = new ArrayList<>();
		List<String> insertStatements = new ArrayList<>();
		for (Map.Entry<String, ProfileParser.Type> typeEntry : types.entrySet()) {
			String createStatement = "CREATE TABLE " + typeEntry.getKey() +
				"""
					(
						value INT not null,
						value_name varchar not null
					);""";
			createStatements.add(createStatement);
			var entries = typeEntry.getValue().entrySet().stream().map(e -> e.getKey() + ",'" + e.getValue() + "'")
				.toList();
			for (String entry : entries) {
				String insertStatement = "INSERT INTO %s VALUES (%s);".formatted(typeEntry.getKey(), entry);
				insertStatements.add(insertStatement);
			}
		}
		createStatements.forEach(System.out::println);
	}
*/
	void createMessageNameMappings() throws IOException {
		var types = this.profileParser.parseTypes();
		var fieldNames = this.profileParser.parseFieldNames(types.get("MESG_NUM"));
		var typesEnum = createTypes(types, packageName);
		var fieldsEnum = createFieldNames(fieldNames, packageName);
		if (outputDirectory != null && !outputDirectory.isBlank()) {
			var output = Path.of(outputDirectory);
			for (JavaFile javaFile : typesEnum) {
				javaFile.writeTo(output);
			}
			fieldsEnum.writeTo(output);
		} else {
			for (JavaFile javaFile : typesEnum) {
				javaFile.writeTo(System.out);
			}
			fieldsEnum.writeTo(System.out);
		}
	}

	private List<JavaFile> createTypes(Map<String, Collection<ProfileParser.Type>> types, String packageNameToUse) {
		var files = new ArrayList<JavaFile>();
		for (Map.Entry<String, Collection<ProfileParser.Type>> type : types.entrySet()) {

			var messageNameEnumBuilder = TypeSpec.enumBuilder(type.getKey())
				.addModifiers(Modifier.PUBLIC);
			var typeContent = type.getValue();
			var longType = false;
			for (ProfileParser.Type content : typeContent) {
				if (content.longType()) {
					longType = true;
				}
				messageNameEnumBuilder.addEnumConstant(
					"_" + content.name().toUpperCase(Locale.ROOT),
					longType
						? TypeSpec.anonymousClassBuilder("$LL, $S", content.value(), content.name()).build()
						: TypeSpec.anonymousClassBuilder("$L, $S", content.value(), content.name()).build()
				);
			}
			if (longType) {
				messageNameEnumBuilder.addField(long.class, "messageNumber", Modifier.PRIVATE, Modifier.FINAL);
			} else {
				messageNameEnumBuilder.addField(int.class, "messageNumber", Modifier.PRIVATE, Modifier.FINAL);
			}
			messageNameEnumBuilder.addField(String.class, "messageName", Modifier.PRIVATE, Modifier.FINAL);
			if (longType) {
				messageNameEnumBuilder.addMethod(MethodSpec.constructorBuilder()
					.addParameter(long.class, "messageNumber")
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
						.addParameter(long.class, "messageNumber")
						.addCode(CodeBlock.builder()
							.add("""
								for (%s name: %s.values()) {
									if (name.messageNumber == messageNumber) {
										return name;
									}
								}
								return null;
								""".formatted(type.getKey(), type.getKey()))
							.build())
						.returns(ClassName.get(packageNameToUse, type.getKey()))
						.build());
			} else {
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
								for (%s name: %s.values()) {
									if (name.messageNumber == messageNumber) {
										return name;
									}
								}
								return null;
								""".formatted(type.getKey(), type.getKey()))
							.build())
						.returns(ClassName.get(packageNameToUse, type.getKey()))
						.build());
			}
			messageNameEnumBuilder
				.addMethod(MethodSpec.methodBuilder("getMessageName")
					.addModifiers(Modifier.PUBLIC)
					.addCode("return this.messageName;")
					.returns(String.class)
					.build());
			var messageNameEnum = messageNameEnumBuilder.build();
			files.add(JavaFile.builder(packageNameToUse, messageNameEnum)
				.skipJavaLangImports(true)
				.addFileComment("auto-generated file from Profile.xlsx")
				.build());
		}

		return files;
	}

	private JavaFile createFieldNames(List<ProfileParser.FieldName> fieldNames, String packageNameToUse) {
		var noEnums = List.of(
			"UINT8",
			"UINT8Z",
			"SINT8",
			"UINT16",
			"UINT16Z",
			"SINT16",
			"UINT32",
			"UINT32Z",
			"SINT32",
			"SINT64",
			"UINT64",
			"STRING",
			"DATE_TIME",
			"BOOL",
			"BYTE",
			"FLOAT32"
			);
		var messageNameEnumBuilder = TypeSpec.enumBuilder("FieldName")
			.addJavadoc("Name of messages to be mapped from their ids")
			.addModifiers(Modifier.PUBLIC);
		for (ProfileParser.FieldName fieldName : fieldNames) {
			var enumType = fieldName.enumType().toUpperCase();
			if (enumType.equals("LOCALTIME_INTO_DAY")) {
				enumType = "UINT32";
			}
			if (noEnums.contains(enumType)) {
				enumType = null;
			}
			messageNameEnumBuilder.addEnumConstant(
				fieldName.name().toUpperCase(Locale.ROOT) + "_" + fieldName.messageNumber(),
				TypeSpec.anonymousClassBuilder("$L, $L, $S, $L", fieldName.messageNumber(), fieldName.fieldNumber(), fieldName.name(), enumType != null ? enumType + ".class" : null
				).build()
			);
		}
		messageNameEnumBuilder.addField(int.class, "messageNumber", Modifier.PRIVATE, Modifier.FINAL);
		messageNameEnumBuilder.addField(int.class, "fieldNumber", Modifier.PRIVATE, Modifier.FINAL);
		messageNameEnumBuilder.addField(String.class, "fieldName", Modifier.PRIVATE, Modifier.FINAL);
		messageNameEnumBuilder.addField(Class.class, "enumType", Modifier.PRIVATE, Modifier.FINAL);
		messageNameEnumBuilder.addMethod(MethodSpec.constructorBuilder()
			.addParameter(int.class, "messageNumber")
			.addParameter(int.class, "fieldNumber")
			.addParameter(String.class, "fieldName")
			.addParameter(Class.class, "enumType")
			.addCode(CodeBlock.builder()
				.add("""
					this.messageNumber = messageNumber;
					this.fieldNumber = fieldNumber;
					this.fieldName = fieldName;
					this.enumType = enumType;
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
		messageNameEnumBuilder
			.addMethod(MethodSpec.methodBuilder("getEnumType")
				.addModifiers(Modifier.PUBLIC)
				.addCode("return this.enumType;")
				.returns(Class.class)
				.build());
		var messageNameEnum = messageNameEnumBuilder.build();
		return JavaFile.builder(packageNameToUse, messageNameEnum)
			.skipJavaLangImports(true)
			.addFileComment("auto-generated file from Profile.xlsx")
			.build();
	}
}
