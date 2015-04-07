package es.uniovi.asw.trivial.db;

import java.util.List;

import es.uniovi.asw.trivial.db.impl.local.persistencia.model.Pregunta;

public interface RemoteDB {

	public List<Pregunta> cargarPreguntas();

}
