package es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.RespuestaSaver;
import es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.util.Jpa;
import es.uniovi.asw.trivial.db.impl.local.persistencia.model.Respuesta;

public class RespuestaSaverImpl implements RespuestaSaver {

	public void save(Respuesta respuesta) {
		EntityManager em = Jpa.createEntityManager();
		EntityTransaction trx = em.getTransaction();
		try{
			trx.begin();
			Jpa.getManager().persist(respuesta);
			trx.commit();
		}catch(PersistenceException e) {
			if(trx.isActive())
				trx.rollback();
		}
	}

}
