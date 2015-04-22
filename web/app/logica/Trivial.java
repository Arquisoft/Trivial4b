package logica;

import java.util.ArrayList;
import java.util.List;

import models.Pregunta;
import models.PreguntaGame;
import models.casilla.Casilla;

/**
 * En esta clase se concentra la lógica del juego (el tablero, tirar los dados, moverse de posicion...)
 */
public class Trivial {
	
	private List<Pregunta> listaPreguntas;
	/*
		Casilla central = 44 (ultima posicion)
		Calle exterior = 0 -> 31 (desde el quesito izquierdo)
		Calle central izquierda = tablero 32 -> 34
		Calle central superior = 35 -> 37
		Calle central derecha = 38 -> 40
		Calle central inferior = 41 -> 43 
	
		Casillas prefijadas:
			1	->	Ciencias y naturaleza
			32	->	Ciencias y naturaleza
			31	->	Ciencias y naturaleza
	
			7	->	Geografia
			35	->	Geografia
			9	->	Geografia
			
			15	->	Historia
			38	->	Historia
			17	->	Historia
	
			23	->	Espectaculos
			41	->	Espectaculos
			25	->	Espectaculos
	
		Quesitos:
			0	->	Quesito de historia
			8	->	Quesito de espectaculos
			16	->	Quesito de ciencias y naturaleza
			24	->	Quesito de geografia
	
		Tira otra vez:
			4, 12, 20, 28
	 */
	private Grafo grafoTablero;
	private Casilla[] tablero;
	
	private PreguntaGame preguntaActual;
	private boolean isVuelveATirar;
	private boolean isCasillaFinal;
	
	public Trivial(List<Pregunta> listaPreguntas) {
		this.listaPreguntas = listaPreguntas;
		tablero = TableroFactory.createTablero();
		grafoTablero = new Grafo(tablero);		
	}
	
	public void usarCasilla(int i){
		tablero[i].usoCasilla().execute(this);
	}
	
	public List<Integer> obtenerDestinos(int casillaActual, int tirada){
		return grafoTablero.getDestinos(casillaActual, tirada);
	}
	
	public int lanzarDado(){
		return (int) (Math.random() * (7 - 1) + 1);
	}
	
	public void hacerPregunta(String categoria, boolean esQuesito){		
		preguntaActual = new PreguntaGame(obtenerPregunta(categoria), esQuesito);
	}
	
	private Pregunta obtenerPregunta(String categoria) {
		List<Pregunta> listaPreguntasCategoria = new ArrayList<Pregunta>();

		for (Pregunta p : listaPreguntas)
			if (p.getCategoria().equalsIgnoreCase(categoria))
				listaPreguntasCategoria.add(p);

		if (listaPreguntasCategoria.size() > 0) {
			int maxIndex = listaPreguntasCategoria.size() - 1;

			int posRandom = (int) (Math.random() * ((maxIndex - 0) + 1) + 0);
			return listaPreguntasCategoria.get(posRandom);
		} else {
			return null;
		}
	}
	
	public PreguntaGame getPreguntaActual() {
		return preguntaActual;
	}
	
	public Grafo getGrafoTablero() {
		return grafoTablero;
	}

	public void setVuelveATirar(boolean isVuelveATirar) {
		this.isVuelveATirar = isVuelveATirar;
	}

	public boolean isCasillaFinal() {
		return this.isCasillaFinal;
	}

	public boolean isVuelveATirar() {
		return this.isVuelveATirar;
	}

	public void setCasillaFinal(boolean isCasillaFinal) {
		this.isCasillaFinal = isCasillaFinal;
	}

}
