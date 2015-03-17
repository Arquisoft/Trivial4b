package es.uniovi.asw.trivial.model;

import java.util.Comparator;

public class PreguntaComparator {

	public static Comparator<Pregunta> comparatorCategoria = new Comparator<Pregunta>() {
		public int compare(Pregunta o1, Pregunta o2) {
			return o1.getCategoria().toUpperCase()
					.compareTo(o2.getCategoria().toUpperCase());
		}
	};

}
