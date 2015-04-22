package persistence.consultas.impl;

import persistence.consultas.PartidaFinder;
import persistence.consultas.PersistenceFactory;
import persistence.consultas.PreguntaSaver;
import persistence.consultas.RespuestaSaver;
import persistence.consultas.UsuarioFinder;
import persistence.consultas.UsuarioSaver;

public class SimplePersistenceFactory implements PersistenceFactory {

	public UsuarioFinder createUsuarioFinder() {
		return new UsuarioFinderImpl();
	}

	public PartidaFinder createPartidaFinder() {
		return new PartidaFinderImpl();
	}
	
	public PreguntaSaver createPreguntaSaver(){
		return new PreguntaSaverImpl();
	}
	
	public RespuestaSaver createRespuestaSaver(){
		return new RespuestaSaverImpl();
	}
	
	public UsuarioSaver createUsuarioSaver(){
		return new UsuarioSaverImpl();
	}
	
}
