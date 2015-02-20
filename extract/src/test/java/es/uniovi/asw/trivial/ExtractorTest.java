package es.uniovi.asw.trivial;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

import es.uniovi.asw.trivial.logica.Pregunta;
import es.uniovi.asw.trivial.logica.Respuesta;
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
			List<Respuesta> respuestas = prueba.get(i).getRespuestas();
			for (int j = 0; j < prueba.get(i).getRespuestas().size(); j++) {
					if (respuestas.get(j).isCorrecta()) {
						System.out.println("Respuesta correcta: "
								+ respuestas.get(j).getRespuesta());
					} else
						System.out.println("Respuesta incorrecta:"
								+ respuestas.get(j).getRespuesta());
			}
			System.out.println();
		}
	}

}
