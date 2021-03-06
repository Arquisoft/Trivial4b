package controllers;

import java.net.UnknownHostException;

import java.util.Arrays;
import java.util.List;

import logica.Trivial;
import models.Pregunta;
import models.PreguntaGame;
import models.Respuesta;
import persistence.DBFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.mensajes;
import views.html.resultados;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.util.JSON;

import models.Usuario;

public class TrivialAPI extends Controller {

	private static Trivial trivial = new Trivial(obtenerListaPreguntas());
	private static Usuario usuarioEnSesion;
	
	private static List<Pregunta> obtenerListaPreguntas() {
		return DBFactory.createRemoteDB().cargarPreguntas();
	}
	
	public static Result obtenerPreguntas() {
		String resultJSON = "{\"preguntas\":[";

		DBCursor cursor = ejecutarConsulta(null, "preguntas");

		resultJSON = createJSONArray(resultJSON, cursor);
		
		resultJSON = ocultarRespuestaCorrecta(resultJSON);

		return ok(resultados.render(resultJSON));
	}

	public static Result obtenerPreguntasPorCategoria(String categoria) {
		categoria = checkCategoria(categoria);

		String resultJSON = "{\"preguntas\":[";

		BasicDBObject consulta = new BasicDBObject();
		consulta.put("categoria", categoria);
		String coleccion = "preguntas";

		DBCursor cursor = ejecutarConsulta(consulta, coleccion);

		resultJSON = createJSONArray(resultJSON, cursor);

		resultJSON = ocultarRespuestaCorrecta(resultJSON);
		
		return ok(resultados.render(resultJSON));
	}

	public static Result obtenerPreguntaAleatoria(String categoria) {
		String resultJSON = "";

		categoria = checkCategoria(categoria);

		BasicDBObject consulta = new BasicDBObject();
		consulta.put("categoria", categoria);
		String coleccion = "preguntas";

		DBCursor cursor = ejecutarConsulta(consulta, coleccion);

		int maxIndex = cursor.count() - 1;
		int posRandom = (int) (Math.random() * ((maxIndex - 0) + 1) + 0);

		int i = 0;
		while (cursor.hasNext()) {
			DBObject preguntaJSON = cursor.next();
			if (i == posRandom) {
				resultJSON = preguntaJSON.toString();
				break;
			}
			i++;
		}
		cursor.close();
		
		resultJSON = ocultarRespuestaCorrecta(resultJSON);

		return ok(resultados.render(resultJSON));
	}
	
	private static String ocultarRespuestaCorrecta(String resultJSON) {
		resultJSON = resultJSON.replace(" , \"isCorrecta\" : ", "");
		resultJSON = resultJSON.replace("true", "");
		resultJSON = resultJSON.replace("false", "");
		return resultJSON;
	}

	public static Result comprobarRespuesta(Integer idPregunta,
			Integer nRespuesta) {

		BasicDBObject consulta = new BasicDBObject();
		consulta.put("_id", idPregunta);
		String coleccion = "preguntas";

		DBCursor cursor = ejecutarConsulta(consulta, coleccion);

		int respuestaCorrecta = -1;
		BasicDBObject respuestaElegida = null;
		
		if (cursor.hasNext()) {
			DBObject preguntaJSON = cursor.next();
			BasicDBList respuestas = (BasicDBList) preguntaJSON
					.get("respuestas");
			
			for(int i = 0; i < respuestas.size(); i++)
				if(((BasicDBObject)respuestas.get(i)).getBoolean("isCorrecta"))
					respuestaCorrecta = i;
			
			respuestaElegida = (BasicDBObject) respuestas.get(nRespuesta);
		}
		cursor.close();

		String result = "{\"isCorrecta\":" 
				+ respuestaElegida.get("isCorrecta").toString() + ","
				+ "\"nCorrecta\":" + respuestaCorrecta + "}";

		return ok(resultados.render(result));
	}

	private static String checkCategoria(String categoria) {
		categoria = categoria.replace("%20", " ");

		if (categoria.equalsIgnoreCase("historia"))
			categoria = "Historia";
		else if (categoria.equalsIgnoreCase("espectáculos")
				|| categoria.equalsIgnoreCase("espectaculos"))
			categoria = "Espectáculos";
		else if (categoria.equalsIgnoreCase("ciencias y naturaleza"))
			categoria = "Ciencias y Naturaleza";
		else if (categoria.equalsIgnoreCase("geografía")
				|| categoria.equalsIgnoreCase("geografia"))
			categoria = "Geografía";
		return categoria;
	}

	public static Result obtenerUsuarios() {
		String resultJSON = "{\"usuarios\":[";

		DBCursor cursor = ejecutarConsulta(null, "usuarios");

		resultJSON = createJSONArray(resultJSON, cursor);

		return ok(resultados.render(resultJSON));
	}

	public static Result obtenerUsuario(String usuario) {
		String resultJSON = "{\"usuarios\":[";

		BasicDBObject consulta = new BasicDBObject();
		consulta.put("usuario", usuario);
		String coleccion = "usuarios";

		DBCursor cursor = ejecutarConsulta(consulta, coleccion);
		
		if (cursor.hasNext()) {
			DBObject preguntaJSON = cursor.next();
			resultJSON += preguntaJSON.toString();
		}
		
		resultJSON += "]}";
		
		return ok(resultados.render(resultJSON));
	}

	public static Result guardarUsuario(String usuario, String password) {
		String resultJSON = "{\"resultado\":true}";
		
		try{
			BasicDBObject consulta = new BasicDBObject();
			consulta.put("usuario", usuario);
			String coleccion = "usuarios";

			DBCursor cursor = ejecutarConsulta(consulta, coleccion);
			
			if (cursor.hasNext()) {
				resultJSON = resultJSON.replace("true", "false");
			}
			else{
				DB db = conectar();
				DBCollection colUsuarios = db.getCollection("usuarios");
				
				String usuarioJSON = "{\"usuario\":\""+usuario+"\","+"\"pass\":\""+password+"\"}";
				DBObject jsonObject = (DBObject) JSON.parse(usuarioJSON);
				colUsuarios.insert(jsonObject);
			}
			
		} catch (Exception e){
			resultJSON = resultJSON.replace("true", "false");
		}
		return ok(resultados.render(resultJSON));
	}
	
	
	public static Result getUserSesion(){
		if (usuarioEnSesion != null) {
			String resultJSON = 
					"{"
							+ "\"username\":\"" + usuarioEnSesion.getUsuario()     + "\","
							+ "\"pass\":\""     + usuarioEnSesion.getContrasenia() + "\","
							+ "\"icono\":\""    + usuarioEnSesion.getIcono()       + "\""
					+"}";	
			return ok(resultados.render(resultJSON));	
		} else {
			String resultJSON = "{\"error\":\"No existe ningun usuario en sesion\"}";
			return ok(resultados.render(resultJSON));
		}
		
	}
	
	public static Result validateUser(String usuario, String password){
		String resultJSON = "{\"validacion\":";

		BasicDBObject consulta = new BasicDBObject();
		consulta.put("usuario", usuario);
		String coleccion = "usuarios";

		DBCursor cursor = ejecutarConsulta(consulta, coleccion);
		
		if (cursor.hasNext()) {
			DBObject usuarioJSON = cursor.next();
			String pass = (String) usuarioJSON.get("pass");
			if(pass.equals(password)) {
				resultJSON += "true";
				usuarioEnSesion = new Usuario(usuario, password);
			}	
			else
				resultJSON += "false";
		}
		else{
			resultJSON += "false";
		}
		
		resultJSON += "}";	
		return ok(resultados.render(resultJSON));
	}
	
	public static Result addQuesito(String categoria){
		categoria = checkCategoria(categoria);
		
		usuarioEnSesion.addQuesito(categoria);
		usuarioEnSesion.actualizarIconoQuesitos();
		
		String resultJSON = "{\"icono\":\""+usuarioEnSesion.getIcono()+"\"}";
		
		return ok(resultados.render(resultJSON));
	}
	
	public static Result getQuesitos(){
		String resultJSON = "{\"todosLosQuesitos\":"+usuarioEnSesion.todosLosQuesitos()+"}";
		return ok(resultados.render(resultJSON));
	}

	public static Result calcularDestinos(Integer actual, Integer tirada) {
		trivial = new Trivial(obtenerListaPreguntas());
		
		List<Integer> destinos = trivial.obtenerDestinos(actual, tirada);

		String result = "{\"posiciones\":[";
		for (Integer destino : destinos)
			result += "{\"posicion\":" + destino + "},";
		result = result.substring(0, result.length() - 1);
		result += "]}";
		return ok(resultados.render(result));
	}
	
	public static Result usarCasilla(Integer nCasilla){
		trivial.usarCasilla(nCasilla);
		
		PreguntaGame pregunta = trivial.getPreguntaActual();
		boolean isCasillaFinal = trivial.isCasillaFinal();
		boolean isVuelveATirar = trivial.isVuelveATirar();
		
		String result = "{";
		String respuestasJSON = "";
		
		if(pregunta != null){
			result += "\"_id\":\""+pregunta.getId()+"\",";
			result += "\"isQuesito\":"+pregunta.isEsQuesito()+",";
			result += "\"enunciado\":\""+pregunta.getEnunciado()+"\",";
			result += "\"categoria\":\""+pregunta.getCategoria()+"\",";
			
			List<Respuesta> respuestas = pregunta.getRespuestas();
			respuestasJSON = "\"respuestas\":[";
			for (Respuesta respuesta : respuestas) {
				respuestasJSON += "{";
				
				respuestasJSON += "\"respuesta\":\""+respuesta.getRespuesta()+"\"";
				
				respuestasJSON += "},";
			}
			respuestasJSON = respuestasJSON.substring(0,respuestasJSON.length()-1)+"]"+",";
		}
		result += respuestasJSON;
		result += "\"isCasillaFinal\":"+isCasillaFinal+",";
		result += "\"isVuelveATirar\":"+isVuelveATirar+"";
		
		result += "}";
		return ok(resultados.render(result));
	}
	
	public static Result tirarDado(){
		return ok(resultados.render("{\"numero\":"+String.valueOf(trivial.lanzarDado())+"}"));
	}

	private static DB conectar() {
		MongoClient mongoClient = null;
		MongoCredential mongoCredential = MongoCredential
				.createMongoCRCredential("trivialuser", "trivial",
						"4btrivialmongouser".toCharArray());
		try {
			mongoClient = new MongoClient(new ServerAddress(
					"ds062797.mongolab.com", 62797),
					Arrays.asList(mongoCredential));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		DB db = mongoClient.getDB("trivial");
		System.out.println("Conexion creada con la base de datos");
		return db;
	}

	private static DBCursor ejecutarConsulta(BasicDBObject consulta,
			String coleccion) {
		DB db = conectar();
		DBCollection colPreguntas = db.getCollection(coleccion);

		DBCursor cursor = null;
		if (consulta != null)
			cursor = colPreguntas.find(consulta);
		else
			cursor = colPreguntas.find();

		return cursor;
	}

	private static String createJSONArray(String resultJSON, DBCursor cursor) {
		while (cursor.hasNext()) {
			DBObject preguntaJSON = cursor.next();
			resultJSON += preguntaJSON.toString() + ",";
		}
		cursor.close();

		resultJSON = resultJSON.substring(0, resultJSON.length() - 1) + "]}";
		return resultJSON;
	}
	
}
