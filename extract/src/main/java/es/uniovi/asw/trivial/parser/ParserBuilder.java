package es.uniovi.asw.trivial.parser;

import es.uniovi.asw.trivial.parser.impl.ParserGIFT;
import es.uniovi.asw.trivial.parser.impl.ParserXML;

public class ParserBuilder {

	/**
	* Crea el Parser que se pide por parámetro (Parser a formato GIFT por
	* defecto).
	* 
	* @param inputFilePath Fichero a parsear
	* @param inputFileFormat Formato del fichero a parsear
	* @return Retorna un parser del tipo especificado por parametro
	*/
	public static Parser build(String inputFilePath, String inputFileFormat) {
		Parser p = new ParserGIFT(inputFilePath);

		if (inputFileFormat.equalsIgnoreCase("xml"))
			p = new ParserXML(inputFilePath);
		else if (inputFileFormat.equalsIgnoreCase("gift"))
			p = new ParserGIFT(inputFilePath);
		return p;
	}

}
