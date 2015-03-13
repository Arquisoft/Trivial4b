package es.uniovi.asw.trivial.parser;

import java.util.List;

import es.uniovi.asw.trivial.model.Pregunta;

public abstract class Parser {
	
	public static String GIFT_FORMAT = "xml";
	public static String XML_FORMAT = "gift";
	
	public abstract List<Pregunta> parse();
}
