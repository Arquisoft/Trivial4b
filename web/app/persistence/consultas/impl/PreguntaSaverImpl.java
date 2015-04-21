package persistence.consultas.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import models.Pregunta;
import persistence.consultas.PreguntaSaver;
import persistence.consultas.util.Jpa;

public class PreguntaSaverImpl implements PreguntaSaver {

	public void save(Pregunta pregunta) {
		EntityManager em = Jpa.createEntityManager();
		EntityTransaction trx = em.getTransaction();
		try{
			trx.begin();
			Jpa.getManager().merge(pregunta);
			trx.commit();
		}catch(PersistenceException e) {
			if(trx.isActive())
				trx.rollback();
		}
	}

}
