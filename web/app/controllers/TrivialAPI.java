package controllers;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

import logica.Grafo;
import logica.TableroFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.mensajes;
import views.html.preguntas;

import com.mongodb.BasicDBList;
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

		DBCursor cursor = ejecutarConsulta(null, "preguntas");

		resultJSON = createJSONArray(resultJSON, cursor);

		return ok(preguntas.render(resultJSON));
	}

	public static Result obtenerPreguntasPorCategoria(String categoria) {
		categoria = checkCategoria(categoria);
		
		String resultJSON = "{\"preguntas\":[";		

		BasicDBObject consulta = new BasicDBObject();
		consulta.put("categoria", categoria);
		String coleccion = "preguntas";

		DBCursor cursor = ejecutarConsulta(consulta, coleccion);

		resultJSON = createJSONArray(resultJSON, cursor);

		return ok(preguntas.render(resultJSON));
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

		return ok(preguntas.render(resultJSON));
	}

	public static Result comprobarRespuesta(Integer idPregunta, Integer nRespuesta) {
		
		BasicDBObject consulta = new BasicDBObject();
		consulta.put("_id", idPregunta);
		String coleccion = "preguntas";

		DBCursor cursor = ejecutarConsulta(consulta, coleccion);

		BasicDBObject respuestaElegida = null;
		if (cursor.hasNext()) {
			DBObject preguntaJSON = cursor.next();
			BasicDBList respuestas = (BasicDBList) preguntaJSON.get("respuestas");			
			respuestaElegida = (BasicDBObject) respuestas.get(nRespuesta);
		}
		cursor.close();

		return ok(preguntas.render(respuestaElegida.get("isCorrecta").toString()));
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
		return null;
	}

	public static Result obtenerUsuario(String usuario) {
		return null;
	}

	public static Result guardarUsuario(String usuario, String password) {		
		return null;
	} 
	
	public static Result calcularDestinos(Integer actual, Integer tirada){
		Grafo grafo = new Grafo(TableroFactory.createTablero());
		List<Integer> destinos = grafo.getDestinos(actual, tirada);
		
		String result = "[";
		for(Integer destino : destinos)
			result += ""+destino+",";
		result = result.substring(0,result.length()-1);
		result += "]";
		return ok(mensajes.render(result));
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

	private static DBCursor ejecutarConsulta(BasicDBObject consulta,
			String coleccion) {
		DB db = conectar();
		DBCollection colPreguntas = db.getCollection(coleccion);		
		
		DBCursor cursor = null;
		if(consulta!=null)
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
