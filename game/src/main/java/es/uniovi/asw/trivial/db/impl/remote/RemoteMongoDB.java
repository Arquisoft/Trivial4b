package es.uniovi.asw.trivial.db.impl.remote;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mongodb.BasicDBList;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

import es.uniovi.asw.trivial.db.RemoteDB;
import es.uniovi.asw.trivial.db.impl.local.persistencia.model.Pregunta;
import es.uniovi.asw.trivial.db.impl.local.persistencia.model.Respuesta;

public class RemoteMongoDB implements RemoteDB {

	/**
	 * Este metodo se conecta con la base de datos remota y obtiene las
	 * preguntas almacenadas, recogiendolas en una List de objetos Pregunta
	 * 
	 * @return List<Pregunta> lista de preguntas cargadas desde la base de datos
	 *         remota
	 */
	public List<Pregunta> cargarPreguntas() {
		List<Pregunta> listaPreguntas = new ArrayList<Pregunta>();
		MongoClient mongoClient = null;
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(new File("userReader.mongouser")));
			String user = "";
			String pass = "";
			while (br.ready()) {
				String linea = br.readLine();
				if (linea.contains("user="))
					user = linea.split("=")[1];
				else if (linea.contains("pass="))
					pass = linea.split("=")[1];
			}
			br.close();

			MongoCredential mongoCredential = MongoCredential
					.createMongoCRCredential(user, "trivial",
							pass.toCharArray());
			mongoClient = new MongoClient(new ServerAddress(
					"ds062797.mongolab.com", 62797),
					Arrays.asList(mongoCredential));

			// Conectar con nuestra base de datos
			DB db = mongoClient.getDB("trivial");
			System.out.println("Conexion creada con la base de datos");

			DBCollection preguntas = db.getCollection("preguntas");
			DBCursor cursor = preguntas.find();
			while (cursor.hasNext()) {

				DBObject preguntaJSON = cursor.next();
				String enunciado = (String) preguntaJSON.get("enunciado");
				String categoria = (String) preguntaJSON.get("categoria");
				BasicDBList respuestas = (BasicDBList) preguntaJSON
						.get("respuestas");

				Pregunta pregunta = new Pregunta(enunciado, categoria);
				for (int i = 0; i < respuestas.size(); i++) {
					DBObject respuestaJSON = (DBObject) respuestas.get(i);
					Respuesta respuesta = new Respuesta(
							(String) respuestaJSON.get("respuesta"),
							(Boolean) respuestaJSON.get("isCorrecta"));
					pregunta.getRespuestas().add(respuesta);
				}

				listaPreguntas.add(pregunta);
			}
			cursor.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (mongoClient != null)
				mongoClient.close();
		}

		return listaPreguntas;
	}

}
