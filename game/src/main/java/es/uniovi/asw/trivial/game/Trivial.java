package es.uniovi.asw.trivial.game;

import java.util.List;

import es.uniovi.asw.trivial.model.Pregunta;
import es.uniovi.asw.trivial.model.casilla.Casilla;

/**
 * En esta clase se concentra la lógica del juego (el tablero, tirar los dados, moverse de posicion...)
 */
public class Trivial {
	
	private List<Pregunta> listaPreguntas;
	/*
		Casilla central = 44 (ultima posicion)
		Calle exterior = 0 -> 31 (desde el quesito izquiedo)
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
	private Casilla[] tablero;
	
	public Trivial(List<Pregunta> listaPreguntas) {
		this.listaPreguntas = listaPreguntas;
		tablero = new Casilla[45];
		cargarTablero();
	}
	
	private void cargarTablero(){
		
	}
	
	public int lanzarDado(){
		return (int) (Math.random() * (6 - 1) + 1);
	}
	
}
