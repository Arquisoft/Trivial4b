package persistence;


public class DBFactory {

	public static RemoteDB createRemoteDB() {
		return new RemoteMongoDB();
	}
	
}
