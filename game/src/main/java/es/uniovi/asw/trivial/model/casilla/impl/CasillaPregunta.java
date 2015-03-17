package es.uniovi.asw.trivial.model.casilla.impl;

import es.uniovi.asw.trivial.game.Trivial;
import es.uniovi.asw.trivial.model.Pregunta;
import es.uniovi.asw.trivial.model.casilla.Casilla;

public class CasillaPregunta implements Casilla{

	private Pregunta pregunta;
	
	public CasillaPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}
	
	public void usoCasilla(Trivial trivial) {
		// Hace la pregunta al usuario	
	}
	
}
