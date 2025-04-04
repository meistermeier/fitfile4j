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
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.dhatim.fastexcel.reader.CellType;
import org.dhatim.fastexcel.reader.ReadableWorkbook;
import org.dhatim.fastexcel.reader.Row;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Maven plugin to generate classes from .fit SDK definition
 */
@Mojo(name = "generate")
public class FitFile4jMojo extends AbstractMojo {

	private static final String MESSAGE_NUMBER_KEY = "mesg_num";


	@Parameter(name = "profileSource", required = true)
	private String profileSource;
	@Parameter(name = "outputDirectory", required = true)
	private String outputDirectory;
	@Parameter(name = "packageName")
	private String packageName;

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		createMessageNameMappings();
	}

	void createMessageNameMappings() throws MojoExecutionException {
		var output = Path.of(outputDirectory);
		Map<Integer, String> messageNames = new HashMap<>();
		String packageNameToUse = packageName != null && !packageName.isBlank()
			? packageName
			: "com.meistermeier.fitfile4j.names";
		try (var workbook = new ReadableWorkbook(new File(profileSource))) {
			workbook.findSheet("Types")
				.ifPresent(wb -> {
					try {
						boolean startFound = false;
						for (Row row : wb.read()) {
							String cellValue = row.getCell(0).asString();
							if (MESSAGE_NUMBER_KEY.equals(cellValue)) {
								startFound = true;
							} else if (!cellValue.isBlank() && !messageNames.isEmpty()) {
								break;
							} else if (startFound && row.getCell(3).getType().equals(CellType.NUMBER)) {
								messageNames.put(row.getCell(3).asNumber().intValue(), row.getCellText(2));
							}
						}
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
				});
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
			messageNameEnumBuilder.addField(String.class, "fieldName", Modifier.PRIVATE, Modifier.FINAL);
			messageNameEnumBuilder.addMethod(MethodSpec.constructorBuilder()
				.addParameter(int.class, "messageNumber")
				.addParameter(String.class, "fieldName")
				.addCode(CodeBlock.builder()
					.add("""
						this.messageNumber = messageNumber;
						this.fieldName = fieldName;
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
				.addMethod(MethodSpec.methodBuilder("getFieldName")
					.addModifiers(Modifier.PUBLIC)
					.addCode("return this.fieldName;")
					.returns(String.class)
					.build());
			var messageNameEnum = messageNameEnumBuilder.build();
			JavaFile.builder(packageNameToUse, messageNameEnum)
				.skipJavaLangImports(true)
				.build().writeTo(output);
		} catch (IOException e) {
			throw new MojoExecutionException(e);
		}
	}
}
