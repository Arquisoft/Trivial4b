import com.mongodb.MongoClient;
import com.mongodb.DB;
import com.mongodb.DBCollection;

public class MongoDBJDBC {
	public static void main(String args[]) {
		try {
			// Conectar con mongodb
			MongoClient mongoClient = new MongoClient("localhost", 27017);
			// Conectar con nuestra base de datos
			DB db = mongoClient.getDB("trivial");
			System.out.println("Conexion creada con la base de datos");
			DBCollection coll = db.getCollection("preguntas");
			System.out.println(coll.find()); 
			db.command("mongoimport --db trivial --collection preguntas --file preguntas.json");
			System.out.println(coll.count());
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
	}
}
