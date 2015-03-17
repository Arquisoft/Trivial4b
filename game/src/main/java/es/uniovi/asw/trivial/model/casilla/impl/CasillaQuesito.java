package es.uniovi.asw.trivial.model.casilla.impl;

import es.uniovi.asw.trivial.game.Trivial;
import es.uniovi.asw.trivial.model.casilla.Casilla;

public class CasillaQuesito implements Casilla{

	private String categoria;
	
	public CasillaQuesito(String categoria) {
		this.categoria = categoria;
	}
	
	public void usoCasilla(Trivial trivial) {
		// Hace una pregunta sobre la categoria del quesito
	}

}
