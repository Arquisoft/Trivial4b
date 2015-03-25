package es.uniovi.asw.trivial.db.impl.local.persistencia.infrastucture;

import es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.PersistenceFactory;
import es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.impl.SimplePersistenceFactory;


public class Factories {

//public static ServiceFactory services = new SimpleServicesFactory();
	public static PersistenceFactory persistence = new SimplePersistenceFactory();
}
