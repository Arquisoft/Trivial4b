package es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.PreguntaSaver;
import es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.util.Jpa;
import es.uniovi.asw.trivial.db.impl.local.persistencia.model.Pregunta;

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
