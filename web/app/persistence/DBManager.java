package persistence;

import java.util.List;

import models.Pregunta;

public class DBManager {

	private RemoteDB remoteDB;
	
	public DBManager() {
		this.remoteDB = DBFactory.createRemoteDB();
	}
	
	public List<Pregunta> cargarPreguntasRemoto(){		
		return remoteDB.cargarPreguntas();
	}
	
}
