package com.meistermeier.fitfile4j.cli;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.meistermeier.fitfile4j.FitFile;
import com.meistermeier.fitfile4j.cli.commands.ImageCommand;
import com.meistermeier.fitfile4j.cli.json.FitFileModule;
import picocli.CommandLine;

import java.io.File;
import java.util.concurrent.Callable;

@CommandLine.Command(subcommands = ImageCommand.class)
public class FitFile4j implements Callable<Integer> {

	@CommandLine.Option(names = {"-f", "--file"}, required = true)
	File fitFile;

	@CommandLine.Option(names = {"-j", "--json"})
	boolean jsonExport;

	@CommandLine.Option(names = {"-n", "--names"})
	boolean names;

	@Override
	public Integer call() throws Exception {
		var fitContent = FitFile.from(fitFile);
		if (jsonExport) {
			var objectMapper = new ObjectMapper().registerModule(new FitFileModule(names));
			System.out.println(objectMapper.writeValueAsString(fitContent.messages()));
		}
		return 0;
	}

	public File getFitFile() {
		return fitFile;
	}

	public static void main(String[] args) {
		new CommandLine(new FitFile4j()).execute(args);
	}
}
