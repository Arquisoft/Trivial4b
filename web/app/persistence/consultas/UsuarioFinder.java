package persistence.consultas;

import java.util.List;

import models.Usuario;

public interface UsuarioFinder {
	void delete(Usuario usuario);
	List<Usuario> findAll();
}
