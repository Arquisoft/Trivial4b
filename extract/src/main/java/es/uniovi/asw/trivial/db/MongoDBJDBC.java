package es.uniovi.asw.trivial.db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.UnknownHostException;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.util.JSON;

public class MongoDBJDBC {

	/**
	 * Éste metodo se conecta con la base de datos MongoDB, y va insertando uno a uno los objetos JSON
	 * del archivo que se le pase por parametro. El formato del archivo debe ser de un objeto JSON por
	 * cada linea del fichero
	 * @param filePath Archivo con los objetos JSON
	 */
	public static void insert(String filePath) {
		// Conectar con mongodb
		MongoClient mongoClient = null;
		try {
			//mongoClient = new MongoClient("85.152.166.25", 27017);
			mongoClient = new MongoClient( "localhost" );
			//mongoClient = new MongoClient("localhost", 27017);

			// Conectar con nuestra base de datos
			DB db = mongoClient.getDB("trivial");
			System.out.println("Conexion creada con la base de datos");

			BufferedReader br = new BufferedReader(new FileReader(new File(
					filePath)));
			while (br.ready()) {
				boolean yaInsertado = false;
				String json = br.readLine();
				DBObject jsonObjectFichero = (DBObject) JSON.parse(json);

				DBCollection collection = db.getCollection("preguntas");
				if (collection.getCount() > 0) {
					DBCursor cursorDoc = collection.find();
					while (cursorDoc.hasNext()) {
						DBObject jsonObject = cursorDoc.next();
						String enunciadoFichero = (String) jsonObjectFichero
								.get("enunciado");
						String enunciado = (String) jsonObject.get("enunciado");
						if (enunciadoFichero.equalsIgnoreCase(enunciado)) {
							// Ya hay una pregunta igual insertada en la base de datos
							yaInsertado = true;
							break;
						}
					}
					if (!yaInsertado) {
						// Si no está insertada, se inserta
						jsonObjectFichero.put("_id", collection.getCount() + 1);
						collection.insert(jsonObjectFichero);
					}
				} else {
					// Si la base de datos está vacia, se inserta
					jsonObjectFichero.put("_id", collection.getCount() + 1);
					collection.insert(jsonObjectFichero);
				}
			}
			br.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			mongoClient.close();
		}
	}

}
