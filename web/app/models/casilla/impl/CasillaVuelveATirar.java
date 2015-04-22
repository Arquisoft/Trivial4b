package models.casilla.impl;

import models.casilla.Action;
import models.casilla.Casilla;

public class CasillaVuelveATirar implements Casilla{

	public Action usoCasilla() {
		// Permite volver a tirar (nuevo turno)
		return new Action() {
			public void execute() {
			}
		};
	}
	
	@Override
	public String toString() {
		return "Vuelve a tirar";
	}
	
}
