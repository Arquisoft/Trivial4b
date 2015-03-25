package es.uniovi.asw.trivial.db.impl.local.persistencia.consultas;

import es.uniovi.asw.trivial.db.impl.local.persistencia.model.Usuario;

public interface UsuarioFinder {
	void save(Usuario usuario);
	void delete(Usuario usuario);
}
