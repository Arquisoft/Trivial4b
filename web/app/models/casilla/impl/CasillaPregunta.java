package models.casilla.impl;

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
			public void execute() {
			}
		};
	}

	@Override
	public String toString() {
		return "Pregunta de " + categoria;
	}

}
