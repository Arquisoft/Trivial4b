package es.uniovi.asw.trivial.model.tablero.casilla.impl;

import es.uniovi.asw.trivial.game.Trivial;
import es.uniovi.asw.trivial.model.tablero.Action;
import es.uniovi.asw.trivial.model.tablero.Casilla;

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
