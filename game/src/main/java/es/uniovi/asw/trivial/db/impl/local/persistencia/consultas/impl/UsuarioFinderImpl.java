package es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.impl;

import es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.UsuarioFinder;
import es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.util.Jpa;
import es.uniovi.asw.trivial.db.impl.local.persistencia.model.Usuario;

public class UsuarioFinderImpl implements UsuarioFinder {
	
	public void save(Usuario usuario) {
		Jpa.getManager().merge(usuario);
	}

	public void delete(Usuario usuario) {
		Jpa.getManager().remove(usuario);	
		
	}

}
 