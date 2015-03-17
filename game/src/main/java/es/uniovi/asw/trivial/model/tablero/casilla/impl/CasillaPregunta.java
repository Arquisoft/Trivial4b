package es.uniovi.asw.trivial.model.tablero.casilla.impl;

import es.uniovi.asw.trivial.game.Trivial;
import es.uniovi.asw.trivial.model.tablero.Action;
import es.uniovi.asw.trivial.model.tablero.Casilla;

public class CasillaPregunta implements Casilla {

	private String categoria;

	public CasillaPregunta(String categoria) {
		this.categoria = categoria;
	}

	public Action usoCasilla() {
		// Se elige una pregunta aleatoria de esa categoria
		return new Action() {
			public void execute(Trivial trivial) {
				trivial.hacerPregunta(categoria);
			}
		};
	}

}
