package es.uniovi.asw.trivial.db.impl.local.persistencia.consultas;

import java.io.IOException;
import java.util.List;

import es.uniovi.asw.trivial.db.impl.local.persistencia.model.Usuario;

public interface UsuarioFinder {
	void save(Usuario usuario) throws IOException;
	void delete(Usuario usuario);
	List<Usuario> findAll();
}
