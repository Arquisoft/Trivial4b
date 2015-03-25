package es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.impl;

import es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.PartidaFinder;
import es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.PersistenceFactory;
import es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.UsuarioFinder;

public class SimplePersistenceFactory implements PersistenceFactory {

	public UsuarioFinder createUsuarioFinder() {
		return new UsuarioFinderImpl();
	}

	public PartidaFinder createPartidaFinder() {
		return new PartidaFinderImpl();
	}

}
