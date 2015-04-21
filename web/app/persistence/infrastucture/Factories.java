package persistence.infrastucture;

import persistence.consultas.PersistenceFactory;
import persistence.consultas.impl.SimplePersistenceFactory;


public class Factories {

//public static ServiceFactory services = new SimpleServicesFactory();
	public static PersistenceFactory persistence = new SimplePersistenceFactory();
}
