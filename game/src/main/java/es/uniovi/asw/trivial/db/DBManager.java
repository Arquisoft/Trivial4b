package es.uniovi.asw.trivial.db;

import java.util.List;

import es.uniovi.asw.trivial.factories.DBFactory;
import es.uniovi.asw.trivial.model.pregunta.Pregunta;

public class DBManager {

	private RemoteDB remoteDB;
	private LocalDB localDB;
	
	public DBManager() {
		this.remoteDB = DBFactory.createRemoteDB();
		this.localDB = DBFactory.createLocalDB();
	}
	
	public List<Pregunta> cargarPreguntasRemoto(){		
		return remoteDB.cargarPreguntas();
	}
	
}
