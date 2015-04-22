package models.casilla.impl;

import logica.Trivial;
import models.casilla.Action;
import models.casilla.Casilla;

public class CasillaFinal implements Casilla{

	public Action usoCasilla() {
		// Hace una pregunta aleatoria de cualquier categoria
		return new Action() {
			public void execute(Trivial trivial) {
				trivial.setCasillaFinal(true);
			}
		};
	}
	
	@Override
	public String toString() {
		return "Casilla final";
	}
	
}
