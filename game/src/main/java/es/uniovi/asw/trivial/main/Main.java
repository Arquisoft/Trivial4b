package es.uniovi.asw.trivial.main;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Collections;
import java.util.List;

import javax.persistence.PersistenceException;

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
		new Main().run();
		/*
		Properties props = new Properties();
        props.setProperty("log4j.rootLogger", "DEBUG, R");
        props.setProperty("log4j.appender.R.layout", "org.apache.log4j.PatternLayout");
        props.setProperty("log4j.appender.R.layout.ConversionPattern", "%p-> %m%n");
        props.setProperty("log4j.appender.R", "org.apache.log4j.FileAppender");
        props.setProperty("log4j.appender.R.File", "app.log");
        PropertyConfigurator.configure(props);
        */
		//BasicConfigurator.configure();
	}

	public void run() {
		// Se debe conectar a la base de datos para extraer las preguntas y las
		// respuestas
		
		// Una vez obtenidas las debe parsear de JSON a objetos Pregunta y
		// Respuesta
		DBManager dbManager = new DBManager();
		List<Pregunta> listaPreguntas = dbManager.cargarPreguntasRemoto();
		
		Collections.sort(listaPreguntas, PreguntaComparator.comparatorCategoria);
		
		PersistenceFactory pf = new SimplePersistenceFactory();
		for(int i = 0; i < listaPreguntas.size(); i++){
			Pregunta pregunta = listaPreguntas.get(i);
			List<Respuesta> respuestas = pregunta.getRespuestas();			

				pf.createPreguntaSaver().save(pregunta);
			for(Respuesta respuesta: respuestas){
				pf.createRespuestaSaver().save(respuesta);
			}

		}

		// Se deben guardar las preguntas y las respuestas en la base de datos
		// local

		// Se preguntará al usuario el numero de jugadores que van a jugar

		// Se debe inicializar el tablero
		Trivial trivial = new Trivial(listaPreguntas);
		VentanaPrincipal vInicio = new VentanaPrincipal(trivial);
		vInicio.setVisible(true);
		

		// Cuando este inicializado se deben crear los objetos Jugador y se
		// deben "colocar" en el tablero en la posicion de salida

		// Llegados a este punto las preguntas ya estan cargadas, el tablero
		// incicializado y los jugadores posicionados, empieza el juego

		// Debe haber un Dado que permita al Jugador avanzar lanzando tiradas de
		// numeros aleatorios

		// En cuanto el dado saque un numero, el Jugador debe elegir, teniendo
		// en cuenta el numero que ha salido del dado, hacia que casilla avanzar

		// Cuando elija se comprobará que tipo de pregunta corresponde dicha
		// Casilla

		// Cuando se sepa la categoria se buscara de forma aleatoria, en la base
		// de datos previamente cargada, una pregunta cuya categoria corresponda

		// Una vez elegida la pregunta se le mostrará al usuario junto con sus
		// respectivas respuestas

		// Cuando el usuario elija una respuesta se comprobará si es la correcta

		// Si acierta se le dará un quesito de la categoria correspondiente a la
		// pregunta y se le permitirá volver a tirar

		// Si falla el turno pasa al siguiente jugador

		// Cuando un jugador consiga el ultimo de los quesitos que le faltan
		// podrá ir a la casilla central
		
		// Una vez alli se le hace una pregunta, si la acierta gana
		
		// ¿Y si no acierta?

	}

}
