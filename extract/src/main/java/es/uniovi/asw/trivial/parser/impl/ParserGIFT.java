package es.uniovi.asw.trivial.parser.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import es.uniovi.asw.trivial.logica.Pregunta;
import es.uniovi.asw.trivial.logica.Respuesta;
import es.uniovi.asw.trivial.parser.Parser;

public class ParserGIFT implements Parser{
	
	private String inputFilePath;

	public ParserGIFT(String inputFilePath) {
		this.inputFilePath = inputFilePath;
	}

	@Override
	public List<Pregunta> parse() {
		List<Pregunta> parsed = new ArrayList<Pregunta>();
		FileReader fichero = null;
		String linea = "";
		String[] enunciado = new String[2];
		String[] respuestas = new String[4];
		int indexPregunta = 0;
		BufferedReader lector = null;
		try {
			fichero = new FileReader(inputFilePath);
			lector = new BufferedReader(fichero);
			linea = lector.readLine();
			while (linea != null) {
				enunciado = linea.split("\\?");
				respuestas = enunciado[1].split("\\{| |\\}");
				parsed.add(new Pregunta(enunciado[0] + "?"));
				for (int i = 0; i < respuestas.length; i++) {
					if (respuestas[i].startsWith("~")) { // Si empieza por
															// virgulilla es
															// falso
						parsed.get(indexPregunta)
								.addRespuesta(
										new Respuesta(respuestas[i]
												.substring(1), false));
					} else if (respuestas[i].startsWith("=")) { // Si empieza
																// por =
						// es verdadera
						parsed.get(indexPregunta)
								.addRespuesta(
										new Respuesta(respuestas[i]
												.substring(1), true));
					} else if (respuestas[i].equals("")
							|| respuestas[i].startsWith("//")) {
						continue;
					}
				}
				indexPregunta++;
				linea = lector.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (lector != null)
					lector.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

		}
		return parsed;
	}

}