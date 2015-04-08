package es.uniovi.asw.trivial.factories;

import es.uniovi.asw.trivial.model.tablero.Casilla;
import es.uniovi.asw.trivial.model.tablero.casilla.impl.CasillaFinal;
import es.uniovi.asw.trivial.model.tablero.casilla.impl.CasillaPregunta;
import es.uniovi.asw.trivial.model.tablero.casilla.impl.CasillaQuesito;
import es.uniovi.asw.trivial.model.tablero.casilla.impl.CasillaVuelveATirar;

public class TableroFactory {

	public static Casilla[] createTablero() {
		Casilla[] tablero = new Casilla[45];

		// Esquina inferior izquierda
		tablero[28] = new CasillaVuelveATirar();

		// Calle izquierda
		tablero[29] = new CasillaPregunta("espectáculos");
		tablero[30] = new CasillaPregunta("geografía");
		tablero[31] = new CasillaPregunta("ciencias y naturaleza");

		// Quesito de historia
		tablero[0] = new CasillaQuesito("historia");

		tablero[1] = new CasillaPregunta("ciencias y naturaleza");
		tablero[2] = new CasillaPregunta("espectáculos");
		tablero[3] = new CasillaPregunta("geografía");

		// Esquina superior izquierda
		tablero[4] = new CasillaVuelveATirar();

		// Calle superior
		tablero[5] = new CasillaPregunta("historia");
		tablero[6] = new CasillaPregunta("ciencias y naturaleza");
		tablero[7] = new CasillaPregunta("geografía");

		// Quesito de espectaculos
		tablero[8] = new CasillaQuesito("espectáculos");

		tablero[9] = new CasillaPregunta("geografía");
		tablero[10] = new CasillaPregunta("historia");
		tablero[11] = new CasillaPregunta("ciencias y naturaleza");

		// Esquina superior derecha
		tablero[12] = new CasillaVuelveATirar();

		// Calle derecha
		tablero[13] = new CasillaPregunta("espectáculos");
		tablero[14] = new CasillaPregunta("geografía");
		tablero[15] = new CasillaPregunta("historia");

		// Quesito de ciencias y naturaleza
		tablero[16] = new CasillaQuesito("ciencias y naturaleza");

		tablero[17] = new CasillaPregunta("historia");
		tablero[18] = new CasillaPregunta("espectáculos");
		tablero[19] = new CasillaPregunta("geografía");

		// Esquina inferior derecha
		tablero[20] = new CasillaVuelveATirar();

		// Calle inferior
		tablero[21] = new CasillaPregunta("historia");
		tablero[22] = new CasillaPregunta("ciencias y naturaleza");
		tablero[23] = new CasillaPregunta("espectáculos");

		// Quesito de geografía
		tablero[24] = new CasillaQuesito("geografía");

		tablero[25] = new CasillaPregunta("espectáculos");
		tablero[26] = new CasillaPregunta("historia");
		tablero[27] = new CasillaPregunta("ciencias y naturaleza");

		// Calle central izquierda
		tablero[32] = new CasillaPregunta("ciencias y naturaleza");
		tablero[33] = new CasillaPregunta("espectáculos");
		tablero[34] = new CasillaPregunta("geografía");

		// Calle central superior
		tablero[35] = new CasillaPregunta("geografía");
		tablero[36] = new CasillaPregunta("historia");
		tablero[37] = new CasillaPregunta("ciencias y naturaleza");

		// Calle central derecha
		tablero[38] = new CasillaPregunta("historia");
		tablero[39] = new CasillaPregunta("geografía");
		tablero[40] = new CasillaPregunta("espectáculos");

		// Calle central inferior
		tablero[41] = new CasillaPregunta("espectáculos");
		tablero[42] = new CasillaPregunta("ciencias y naturaleza");
		tablero[43] = new CasillaPregunta("historia");

		// Casilla central (inicial)
		tablero[44] = new CasillaFinal();

		return tablero;
	}

}
