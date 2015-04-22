package models.casilla.impl;

import logica.Trivial;
import models.casilla.Action;
import models.casilla.Casilla;

public class CasillaVuelveATirar implements Casilla{

	public Action usoCasilla() {
		// Permite volver a tirar (nuevo turno)
		return new Action() {
			public void execute(Trivial trivial) {
				trivial.setVuelveATirar(true);
			}
		};
	}
	
	@Override
	public String toString() {
		return "Vuelve a tirar";
	}
	
}
