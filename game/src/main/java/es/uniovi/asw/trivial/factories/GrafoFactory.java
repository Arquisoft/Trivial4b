package es.uniovi.asw.trivial.factories;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import es.uniovi.asw.trivial.model.tablero.Casilla;

public class GrafoFactory {

	public static Graph<Casilla, DefaultEdge> crearGrafo(Casilla[] casillas) {
		int tamTablero1 = 32;
		Graph<Casilla, DefaultEdge> tablero = new SimpleGraph<Casilla, DefaultEdge>(
				DefaultEdge.class);

		for (int i = 0; i < casillas.length; i++)
			tablero.addVertex(casillas[i]);

		
		for (int i = 0; i < tamTablero1; i++)
				tablero.addEdge(casillas[i], casillas[(i + 1)]);
		tablero.addEdge(casillas[tamTablero1 - 1], casillas[0]);

		tablero.addEdge(casillas[0], casillas[32]);
		tablero.addEdge(casillas[32], casillas[33]);
		tablero.addEdge(casillas[33], casillas[34]);

		tablero.addEdge(casillas[8], casillas[35]);
		tablero.addEdge(casillas[35], casillas[36]);
		tablero.addEdge(casillas[36], casillas[37]);

		tablero.addEdge(casillas[16], casillas[38]);
		tablero.addEdge(casillas[38], casillas[39]);
		tablero.addEdge(casillas[39], casillas[40]);

		tablero.addEdge(casillas[24], casillas[41]);
		tablero.addEdge(casillas[41], casillas[42]);
		tablero.addEdge(casillas[42], casillas[43]);

		tablero.addEdge(casillas[44], casillas[34]);
		tablero.addEdge(casillas[44], casillas[37]);
		tablero.addEdge(casillas[44], casillas[40]);
		tablero.addEdge(casillas[44], casillas[43]);

		return tablero;
	}
	
}
