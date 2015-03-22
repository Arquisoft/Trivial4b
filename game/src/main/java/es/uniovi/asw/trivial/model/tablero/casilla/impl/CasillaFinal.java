package es.uniovi.asw.trivial.model.tablero.casilla.impl;

import es.uniovi.asw.trivial.game.Trivial;
import es.uniovi.asw.trivial.model.tablero.Action;
import es.uniovi.asw.trivial.model.tablero.Casilla;

public class CasillaFinal implements Casilla{

	public Action usoCasilla() {
		// Hace una pregunta aleatoria de cualquier categoria
		return new Action() {
			public void execute(Trivial trivial) {
				System.out.println("Casilla final");
			}
		};
	}
	
	@Override
	public String toString() {
		return "Casilla final";
	}
	
}
