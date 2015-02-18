package es.uniovi.asw.trivial;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

import es.uniovi.asw.trivial.logica.Pregunta;
import es.uniovi.asw.trivial.parser.ParserBuilder;

public class ExtractorTest {

	@Test
	public void emptyExtractor() {
		String args[] = {};
		Extractor ext = new Extractor();
		assertThat(ext.run(args)).isEqualTo(0);
	}

	@Test
	public void probandoLectura() {
		List<Pregunta> prueba = ParserBuilder.build("preguntas.gift", "gift").parse();
		assertThat(prueba.size()).isEqualTo(6);
		for (int i = 0; i < prueba.size(); i++) {
			System.out.println("Pregunta: " + i + "\t"
					+ prueba.get(i).getEnunciado());
			for (int j = 0; j < prueba.get(i).getRespuestas().length; j++) {
				if (prueba.get(i).getRespuestas()[j] != null) {
					if (prueba.get(i).getRespuestas()[j].isCorrecta()) {
						System.out.println("Respuesta correcta: "
								+ prueba.get(i).getRespuestas()[j]
										.getRespuesta());
					} else
						System.out.println("Respuesta incorrecta:"
								+ prueba.get(i).getRespuestas()[j]
										.getRespuesta());
				}
			}
			System.out.println();
		}
	}

}
