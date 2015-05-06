package models.casilla.impl;

import logica.Trivial;
import models.casilla.Action;
import models.casilla.Casilla;

public class CasillaPregunta implements Casilla {

	private String categoria;

	public CasillaPregunta(String categoria) {
		this.categoria = categoria;
	}

	public Action usoCasilla() {
		// Se elige una pregunta aleatoria de esa categoria
		return new Action() {
			public void execute(Trivial trivial) {
				trivial.hacerPregunta(categoria, false);
				trivial.setCasillaFinal(false);
				trivial.setVuelveATirar(false);
			}
		};
	}

	@Override
	public String toString() {
		return "Pregunta de " + categoria;
	}

}
