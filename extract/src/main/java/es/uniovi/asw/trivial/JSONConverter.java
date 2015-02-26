package es.uniovi.asw.trivial;

import java.util.List;

import com.google.gson.GsonBuilder;

import es.uniovi.asw.trivial.logica.Pregunta;

public class JSONConverter {
	
	public static String getJSON(List<Pregunta> preguntas){
		return new GsonBuilder().setPrettyPrinting().create().toJson(preguntas);
	}
	
}
