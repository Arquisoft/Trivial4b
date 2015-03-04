package es.uniovi.asw.trivial.parser.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import es.uniovi.asw.trivial.logica.Pregunta;
import es.uniovi.asw.trivial.logica.Respuesta;
import es.uniovi.asw.trivial.parser.Parser;

public class ParserGIFT implements Parser{
	
	private String inputFilePath;

	/**
	 * Constructor de la clase ParserGIFT
	 * @param inputFilePath Archivo de entrada con formato GIFT
	 */
	public ParserGIFT(String inputFilePath) {
		this.inputFilePath = inputFilePath;
	}

	/**
	 * Parsea el archivo pasado por parametro al constructor y devuelve una lista con las preguntas
	 */
	@Override
	public List<Pregunta> parse() {
		List<Pregunta> preguntas = new ArrayList<Pregunta>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(inputFilePath)));
			
			String categoria = "";
			String titulo = "";
			List<Respuesta> respuestas = new ArrayList<Respuesta>();
			
			while(br.ready()){
				String linea = br.readLine();
				
				if(linea.contains("$")){
					//Categoria
					categoria = linea.split("$")[0].substring(1, linea.length());
				}
				else if(linea.contains("::")){
					//Titulo
					titulo = linea.split("::")[1];
					respuestas = new ArrayList<Respuesta>();
				}
				else if(linea.contains("{")){
					//Titulo (sin ::)
					titulo = linea.split("\\{")[0];
					respuestas = new ArrayList<Respuesta>();
				}
				else if(linea.contains("~")){
					//Respuesta incorrecta
					Respuesta respuesta = new Respuesta(linea.split("~")[1], false);
					respuestas.add(respuesta);
				}
				else if(linea.contains("=")){
					//Respuesta correcta
					Respuesta respuesta = new Respuesta(linea.split("=")[1], true);
					respuestas.add(respuesta);
				}
				else if(linea.contains("}")){
					//Fin de pregunta
					Pregunta pregunta = new Pregunta(titulo, categoria, respuestas);
					preguntas.add(pregunta);
				}
			}		
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}		
		return preguntas;
	}
	
}
