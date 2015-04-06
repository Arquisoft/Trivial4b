package es.uniovi.asw.trivial.db.impl.local.persistencia.consultas;

public interface PersistenceFactory {
	UsuarioFinder createUsuarioFinder();
	PartidaFinder createPartidaFinder();
	
}
