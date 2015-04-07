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
		EntityManager em = Jpa.createEntityManager();
		EntityTransaction trx = em.getTransaction();
		try{
			trx.begin();
			Jpa.getManager().merge(usuario);
			trx.commit();
		}catch(PersistenceException e) {
			try {
				throw new IOException("Base de datos NO conectada.");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
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
			return Jpa.getManager()
					.createNamedQuery("Usuario.findAll", Usuario.class)
					.getResultList();

		} catch (PersistenceException e) {
			try {
				throw new IOException("Base de datos NO conectada.");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		return null;

	}
	
	
		
		
		
	

}
 