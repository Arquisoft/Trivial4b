package models.casilla.impl;

import models.casilla.Action;
import models.casilla.Casilla;

public class CasillaFinal implements Casilla{

	public Action usoCasilla() {
		// Hace una pregunta aleatoria de cualquier categoria
		return new Action() {
			public void execute() {
			}
		};
	}
	
	@Override
	public String toString() {
		return "Casilla final";
	}
	
}
