package es.uniovi.asw.trivial.parser;

import es.uniovi.asw.trivial.parser.impl.ParserGIFT;
import es.uniovi.asw.trivial.parser.impl.ParserQTI;

public class ParserBuilder {

	/**
	 * Crea el Parser que se pide por parámetro (Parser a formato GIFT por
	 * defecto).
	 * 
	 * @param inputFilePath
	 * @param inputFileFormat
	 * @return
	 */
	public static Parser build(String inputFilePath, String inputFileFormat) {
		Parser p = new ParserGIFT(inputFilePath);

		if (inputFileFormat.equalsIgnoreCase("qti"))
			p = new ParserQTI(inputFilePath);
		else if (inputFileFormat.equalsIgnoreCase("gift"))
			p = new ParserGIFT(inputFilePath);
		return p;
	}

}
