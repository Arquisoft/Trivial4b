package es.uniovi.asw.trivial.factories;

import es.uniovi.asw.trivial.db.LocalDB;
import es.uniovi.asw.trivial.db.RemoteDB;
import es.uniovi.asw.trivial.db.impl.local.LocalHSQLDB;
import es.uniovi.asw.trivial.db.impl.remote.RemoteMongoDB;

public class DBFactory {

	public static RemoteDB createRemoteDB() {
		return new RemoteMongoDB();
	}

	public static LocalDB createLocalDB() {
		return new LocalHSQLDB();
	}
	
}
