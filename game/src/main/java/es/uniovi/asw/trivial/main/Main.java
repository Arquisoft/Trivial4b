package es.uniovi.asw.trivial.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Collections;
import java.util.List;

import org.hsqldb.Server;

import es.uniovi.asw.trivial.db.DBManager;
import es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.PersistenceFactory;
import es.uniovi.asw.trivial.db.impl.local.persistencia.consultas.impl.SimplePersistenceFactory;
import es.uniovi.asw.trivial.db.impl.local.persistencia.model.Pregunta;
import es.uniovi.asw.trivial.db.impl.local.persistencia.model.Respuesta;
import es.uniovi.asw.trivial.game.Trivial;
import es.uniovi.asw.trivial.model.pregunta.PreguntaComparator;
import es.uniovi.asw.trivial.ui.VentanaPrincipal;

public class Main {

	public static void main(String[] args) {
		System.out.println("empieza el main");
		new Main().run();
	}

	public void run() {
		DBManager dbManager = new DBManager();
		List<Pregunta> listaPreguntas = dbManager.cargarPreguntasRemoto();
		
		Collections.sort(listaPreguntas, PreguntaComparator.comparatorCategoria);
		
		/*
		 * Con este codigo se puede iniciar la base de datos automaticamente
		 * pero da problemas con travis porque no encuentra el jar de hsqldb.
		 * 
		 * Hay que añadirlo en las dependencias de maven
		 * 
		try {
			Runtime.getRuntime().exec("cmd /c start execFromJava.bat");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		*/
		Server hsqlServer = null;
		Connection connection = null;
		ResultSet rs = null;
		
		hsqlServer = new Server();
		hsqlServer.setLogWriter(null);
		hsqlServer.setSilent(true);
		hsqlServer.setDatabaseName(0, "trivial4b");
		hsqlServer.setDatabasePath(0, "data/");
		
		hsqlServer.start();

		
		PersistenceFactory pf = new SimplePersistenceFactory();
		for(int i = 0; i < listaPreguntas.size(); i++){
			Pregunta pregunta = listaPreguntas.get(i);
			List<Respuesta> respuestas = pregunta.getRespuestas();			

				pf.createPreguntaSaver().save(pregunta);
			for(Respuesta respuesta: respuestas){
				pf.createRespuestaSaver().save(respuesta);
			}

		}

		Trivial trivial = new Trivial(listaPreguntas);
		VentanaPrincipal vInicio = new VentanaPrincipal(trivial);
		vInicio.setVisible(true);
	}

}
