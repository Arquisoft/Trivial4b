package es.uniovi.asw.trivial;

import java.util.List;

import es.uniovi.asw.trivial.logica.Pregunta;
import es.uniovi.asw.trivial.logica.Respuesta;

public class JSONConverter {

	public static String getJSON(List<Pregunta> preguntas){
		String json = "{\"preguntas\":[";
		
		for(int i = 0; i < preguntas.size(); i++){
			json += "{";
			
			json += "\"categoria\":\""+preguntas.get(i).getCategoria()+"\",";
			json += "\"enunciado\":\""+preguntas.get(i).getEnunciado().replace("\"", "'").replace("“", "'")+"\",";
			
			List<Respuesta> respuestas = preguntas.get(i).getRespuestas();
			json += "\"respuestas\":[";
			for (int j = 0; j < respuestas.size(); j++) {
					if(j < respuestas.size()-1)
						json += "{\"respuesta"+(j+1)+"\":\""+respuestas.get(j).getRespuesta()+"\"},";
					else
						json += "{\"respuesta"+(j+1)+"\":\""+respuestas.get(j).getRespuesta()+"\"}";
			}
			json += "],";
			
			json += "\"correcta\":\""+preguntas.get(i).getRespuestaCorrecta().getRespuesta()+"\"";
			
			if(i < preguntas.size()-1)
				json += "},";
			else
				json += "}";
		}
		json += "]}";
		return json;
	}
	
}
