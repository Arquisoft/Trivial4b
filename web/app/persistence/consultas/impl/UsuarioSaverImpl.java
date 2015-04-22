package persistence.consultas.impl;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import models.Usuario;
import persistence.consultas.UsuarioSaver;
import persistence.consultas.util.Jpa;

public class UsuarioSaverImpl implements UsuarioSaver {

	public void save(Usuario usuario) throws IOException {
		EntityManager em = Jpa.createEntityManager();
		EntityTransaction trx = em.getTransaction();
		try{
			trx.begin();
			Jpa.getManager().merge(usuario);
			trx.commit();
		}catch(PersistenceException e) {
			throw new IOException("Base de datos NO conectada.");
		}
	}

}
