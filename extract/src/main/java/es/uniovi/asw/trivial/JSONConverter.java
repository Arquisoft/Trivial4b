package es.uniovi.asw.trivial;

import java.util.List;

import com.google.gson.GsonBuilder;

import es.uniovi.asw.trivial.logica.Pregunta;

public class JSONConverter {
	
	/**
	 * Retorna la lista de preguntas en un formato JSON
	 * @param preguntas Lista de Preguntas
	 * @return La lista en formato JSON
	 */
	public static String getJSON(List<Pregunta> preguntas){
		return new GsonBuilder().setPrettyPrinting().create().toJson(preguntas);
	}
	
}
