package models.casilla.impl;

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
			public void execute() {
			}
		};
	}

	@Override
	public String toString() {
		return "Quesito de " + categoria;
	}

}
