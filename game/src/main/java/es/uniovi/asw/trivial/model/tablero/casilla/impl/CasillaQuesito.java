package es.uniovi.asw.trivial.model.tablero.casilla.impl;

import es.uniovi.asw.trivial.game.Trivial;
import es.uniovi.asw.trivial.model.tablero.Action;
import es.uniovi.asw.trivial.model.tablero.Casilla;

public class CasillaQuesito implements Casilla {

	private String categoria;

	public CasillaQuesito(String categoria) {
		this.categoria = categoria;
	}

	public Action usoCasilla() {
		// Hace una pregunta sobre la categoria del quesito
		return new Action() {
			public void execute(Trivial trivial) {
				trivial.hacerPregunta(categoria, true);
			}
		};
	}

}
