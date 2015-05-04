package persistence.consultas.impl;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import models.Usuario;
import persistence.consultas.UsuarioFinder;
import persistence.consultas.util.Jpa;

public class UsuarioFinderImpl implements UsuarioFinder {

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
 