package models.casilla.impl;

import logica.Trivial;
import models.casilla.Action;
import models.casilla.Casilla;

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
				trivial.setCasillaFinal(false);
				trivial.setVuelveATirar(false);
			}
		};
	}

	@Override
	public String toString() {
		return "Quesito de " + categoria;
	}

}
