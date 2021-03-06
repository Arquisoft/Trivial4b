package logica;

import java.util.ArrayList;
import java.util.List;

import models.casilla.Casilla;

import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.DefaultEdge;

public class Grafo {
	
	private Casilla[] casillas;
	private Graph<Casilla, DefaultEdge> grafo;
	
	public Grafo(Casilla[] casillas) {
		this.casillas = casillas;
		grafo = GrafoFactory.crearGrafo(casillas);
	}

	public List<Integer> getDestinos(int inicio, int tirada){
		List<Integer> destinos = new ArrayList<Integer>();
		for (int i = 0; i < casillas.length; i++) {
			DijkstraShortestPath<Casilla, DefaultEdge> dijkstra = new DijkstraShortestPath<Casilla, DefaultEdge>(
					grafo, casillas[inicio], casillas[i]);
			GraphPath<Casilla, DefaultEdge> path = dijkstra.getPath();
			if (path.getWeight() == tirada)
				destinos.add(i);
		}
		return destinos;
	}
	
}
