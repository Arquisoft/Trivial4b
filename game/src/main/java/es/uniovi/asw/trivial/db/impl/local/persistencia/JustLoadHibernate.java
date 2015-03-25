package es.uniovi.asw.trivial.db.impl.local.persistencia;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JustLoadHibernate {

	public static void main(String[] args) {
		// Fuerza al mapeador a que se cargen los parámetros de configuración y 
		// se analizen todos los mapeos y si procede se crea la BDD
		
		EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("carworkshop");
		
		emf.close();
		
		System.out.println("--> Si no hay excepciones todo va bien");
		System.out.println("\n\t (O no hay ninguna clase mapeada)");
	}

}
