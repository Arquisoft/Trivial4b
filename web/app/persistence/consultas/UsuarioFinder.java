package persistence.consultas;

import java.io.IOException;
import java.util.List;

import models.Usuario;

public interface UsuarioFinder {
	void save(Usuario usuario) throws IOException;
	void delete(Usuario usuario);
	List<Usuario> findAll();
}
