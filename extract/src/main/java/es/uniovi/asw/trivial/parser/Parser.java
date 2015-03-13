package es.uniovi.asw.trivial.parser;

import java.util.List;

import es.uniovi.asw.trivial.model.Pregunta;

public abstract class Parser {
	
	public static String GIFT_FORMAT = "gift";
	public static String XML_FORMAT = "xml";
	
	public abstract List<Pregunta> parse();
}
