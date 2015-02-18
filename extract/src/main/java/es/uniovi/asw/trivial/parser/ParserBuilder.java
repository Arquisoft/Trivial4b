package es.uniovi.asw.trivial.parser;

import es.uniovi.asw.trivial.parser.impl.ParserGIFT;
import es.uniovi.asw.trivial.parser.impl.ParserQTI;

public class ParserBuilder {

	public static Parser build(String inputFilePath, String inputFileFormat){
		if(inputFileFormat.equalsIgnoreCase("qti"))
			return new ParserQTI(inputFilePath);		
		else
			return new ParserGIFT(inputFilePath);		
	}
	
}
