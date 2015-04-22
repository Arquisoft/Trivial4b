package persistence;

import java.util.List;

import models.Pregunta;

public interface RemoteDB {

	public List<Pregunta> cargarPreguntas();

}
