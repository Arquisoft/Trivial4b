package persistence.consultas.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import models.Respuesta;
import persistence.consultas.RespuestaSaver;
import persistence.consultas.util.Jpa;

public class RespuestaSaverImpl implements RespuestaSaver {

	public void save(Respuesta respuesta) {
		EntityManager em = Jpa.createEntityManager();
		EntityTransaction trx = em.getTransaction();
		try{
			trx.begin();
			Jpa.getManager().merge(respuesta);
			trx.commit();
		}catch(PersistenceException e) {
			if(trx.isActive())
				trx.rollback();
		}
	}

}
