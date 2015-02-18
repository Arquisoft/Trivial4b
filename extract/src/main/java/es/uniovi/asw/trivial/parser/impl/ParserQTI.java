package es.uniovi.asw.trivial.parser.impl;

import java.util.List;

import es.uniovi.asw.trivial.model.Question;
import es.uniovi.asw.trivial.parser.Parser;

public class ParserQTI implements Parser{
	
	private String inputFilePath;

	public ParserQTI(String inputFilePath) {
		this.inputFilePath = inputFilePath;
	}

	@Override
	public List<Question> parse() {
		return null;
	}

}
