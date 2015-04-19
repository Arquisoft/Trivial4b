package controllers;

import java.net.UnknownHostException;
import java.util.Arrays;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.preguntas;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

public class TrivialAPI extends Controller {

	public static Result obtenerPreguntas() {
		String resultJSON = "{\"preguntas\":[";

		DBCursor cursor = ejecutarConsulta("preguntas");

		while (cursor.hasNext()) {
			DBObject preguntaJSON = cursor.next();
			resultJSON += preguntaJSON.toString() + ",";
		}
		cursor.close();

		resultJSON = resultJSON.substring(0, resultJSON.length() - 1) + "]}";

		return ok(preguntas.render(resultJSON));
	}

	public static Result obtenerPreguntasPorCategoria(String categoria){
		String resultJSON = "{\"preguntas\":[";
		
		categoria = checkCategoria(categoria);
		
		BasicDBObject consulta = new BasicDBObject();
		consulta.put("categoria", categoria);
		String coleccion = "preguntas";
		
		DBCursor cursor = ejecutarConsulta(consulta, coleccion);
		
		while (cursor.hasNext()) {
			DBObject preguntaJSON = cursor.next();
			resultJSON += preguntaJSON.toString()+",";
		}
		cursor.close();
		
		resultJSON = resultJSON.substring(0, resultJSON.length()-1)+"]}";
		
		return ok(preguntas.render(resultJSON));
	}

	public static Result obtenerPreguntaAleatoria(String categoria){
		String resultJSON = "";		
		
		categoria = checkCategoria(categoria);
		
		BasicDBObject consulta = new BasicDBObject();
		consulta.put("categoria", categoria);
		String coleccion = "preguntas";
		
		DBCursor cursor = ejecutarConsulta(consulta, coleccion);
		
		int maxIndex = cursor.count()-1;
		int posRandom = (int) (Math.random() * ((maxIndex - 0) + 1) + 0);
		
		int i = 0;
		while (cursor.hasNext()) {
			DBObject preguntaJSON = cursor.next();
			if(i==posRandom){ 			
				resultJSON = preguntaJSON.toString();
				break;
			}
			i++;
		}
		cursor.close();
		
		return ok(preguntas.render(resultJSON));
	}

	private static DBCursor ejecutarConsulta(String coleccion) {
		DB db = conectar();
		DBCollection colPreguntas = db.getCollection(coleccion);		
		DBCursor cursor = colPreguntas.find();
		return cursor;
	}
	
	private static DBCursor ejecutarConsulta(BasicDBObject consulta,
			String coleccion) {
		DB db = conectar();
		DBCollection colPreguntas = db.getCollection(coleccion);		
		DBCursor cursor = colPreguntas.find(consulta);
		return cursor;
	}

	private static String checkCategoria(String categoria) {
		categoria = categoria.replace("%20", " ");
		
		if(categoria.equalsIgnoreCase("historia"))
			categoria = "Historia";
		else if(categoria.equalsIgnoreCase("espectáculos") || categoria.equalsIgnoreCase("espectaculos"))
			categoria = "Espectáculos";
		else if(categoria.equalsIgnoreCase("ciencias y naturaleza"))
			categoria = "Ciencias y Naturaleza";
		else if(categoria.equalsIgnoreCase("geografía") || categoria.equalsIgnoreCase("geografia"))
			categoria = "Geografía";
		return categoria;
	}
	
	private static DB conectar() {
		MongoClient mongoClient = null;
		MongoCredential mongoCredential = MongoCredential
				.createMongoCRCredential("trivialuserReadOnly", "trivial",
						"trivialuserReadOnly".toCharArray());
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

}
