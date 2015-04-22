package persistence.consultas;

import java.io.IOException;

import models.Usuario;

public interface UsuarioSaver {

	void save (Usuario usuario) throws IOException;
	
}
