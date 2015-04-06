package es.uniovi.asw.trivial;

import java.util.List;

import es.uniovi.asw.trivial.db.DBManager;
import es.uniovi.asw.trivial.game.Grafo;
import es.uniovi.asw.trivial.game.Trivial;
import es.uniovi.asw.trivial.model.pregunta.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	List<Pregunta> preguntas;
	
	public void testCaminosGrafo() {
		Trivial t = new Trivial(preguntas);
		Grafo g = t.getGrafoTablero();
		assert(g.getDestinos(0, 6).contains(6));
		assert(g.getDestinos(0, 6).contains(26));
		assert(g.getDestinos(0, 6).contains(36));
		assert(g.getDestinos(0, 6).contains(39));
		assert(g.getDestinos(0, 6).contains(42));
		
		assert(g.getDestinos(13, 3).contains(10));
		assert(g.getDestinos(13, 3).contains(16));
		
		assert(g.getDestinos(36, 4).contains(6));
		assert(g.getDestinos(36, 4).contains(10));
		assert(g.getDestinos(36, 4).contains(33));
		assert(g.getDestinos(36, 4).contains(39));
		assert(g.getDestinos(36, 4).contains(42));
		
		assert(g.getDestinos(44, 1).contains(34));
		assert(g.getDestinos(44, 1).contains(37));
		assert(g.getDestinos(44, 1).contains(40));
		assert(g.getDestinos(44, 1).contains(43));
		
		assert(!g.getDestinos(36, 4).contains(43));
		assert(!g.getDestinos(36, 4).contains(41));		
	}
	
	

	public void testPreguntas() {
		assert(PreguntaComparator.comparatorCategoria.compare(preguntas.get(0), preguntas.get(1)) == 0);
		assert(preguntas.get(0).getCategoria().equals(preguntas.get(1).getCategoria()));
	}
	
	
	
	
	public void testEstructuraPreguntas() {	
		for (int i = 0; i < preguntas.size(); i++) {
			assert(preguntas.get(0).getEnunciado().length() > 5);
			assertNotNull(preguntas.get(i).getRespuestaCorrecta());
			int respuestasCorrectas = 0;
			for (int j = 0; j < preguntas.get(i).getRespuestas().size(); j++) {
				if (preguntas.get(i).getRespuestas().get(j).isCorrecta()) {
					respuestasCorrectas++;
				}
			}
			// Comprobación que las preguntas son ÚNICA respuesta, comentar esta linea, si existen MULTIRESPUESTA.
			assert(respuestasCorrectas == 1);
		}

	}
	
	
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        DBManager dbManager = new DBManager();
        preguntas = dbManager.cargarPreguntasRemoto();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
