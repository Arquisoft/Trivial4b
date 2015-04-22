package persistence.consultas;

public interface PersistenceFactory {
	UsuarioFinder createUsuarioFinder();
	PartidaFinder createPartidaFinder();
	PreguntaSaver createPreguntaSaver();
	RespuestaSaver createRespuestaSaver();
	UsuarioSaver createUsuarioSaver();
}
