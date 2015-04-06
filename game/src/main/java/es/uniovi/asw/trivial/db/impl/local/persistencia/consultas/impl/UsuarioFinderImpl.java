package es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.impl;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

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
	
	
	
	public List<Usuario> findAll() {
		EntityManager em = Jpa.createEntityManager();
		EntityTransaction trx = em.getTransaction();
		// Contexto persistencia abierto
		try {
			trx.begin();
		} catch (PersistenceException e) {
			try {
				throw new IOException("Base de datos NO conectada.");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		try {
			trx.commit();
			return Jpa.getManager().createNamedQuery("Usuario.findAll", Usuario.class).getResultList();		
		} catch (Exception e) {
			if (trx.isActive())
				trx.rollback();
		} finally {
			if (em.isOpen())
				em.close();
		} // Contexto persistencia cerrado.
		return null;
		
	}
	
	
		
		
		
	

}
 