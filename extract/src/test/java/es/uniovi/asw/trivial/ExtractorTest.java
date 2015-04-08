package es.uniovi.asw.trivial;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import es.uniovi.asw.trivial.main.Extractor;
import es.uniovi.asw.trivial.model.Pregunta;
import es.uniovi.asw.trivial.model.Respuesta;
import es.uniovi.asw.trivial.parser.ParserBuilder;
import es.uniovi.asw.trivial.serializer.JSONSerializer;

public class ExtractorTest {
	int numPreguntasGift = 82;

	@Test
	public void emptyExtractor() {
		String args[] = {};
		Extractor ext = new Extractor();
		assertThat(ext.run(args)).isEqualTo(0);
	}

	@Test
	public void probandoLectura() {
		List<Pregunta> prueba = ParserBuilder.build("preguntas.gift", "gift")
				.parse();
		assertThat(prueba.size()).isEqualTo(numPreguntasGift);
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
			System.out.println(JSONSerializer.getJSON(prueba));
		}

	}

	@Test
	public void estructuraPreguntas() {
		List<Pregunta> preguntas = ParserBuilder
				.build("preguntas.gift", "gift").parse();
		for (int i = 0; i < preguntas.size(); i++) {
			assertThat(preguntas.get(0).getEnunciado().length()).isGreaterThan(
					5);
			Assert.assertNotNull(preguntas.get(i).getRespuestaCorrecta());
			int respuestasCorrectas = 0;
			for (int j = 0; j < preguntas.get(i).getRespuestas().size(); j++) {
				if (preguntas.get(i).getRespuestas().get(j).isCorrecta()) {
					respuestasCorrectas++;
				}
			}
			assertThat(respuestasCorrectas).isEqualTo(1);
		}

	}
	@Test
	public void respuestaCorrectaXML() {
		List<Pregunta> preguntas = ParserBuilder
				.build("preguntas.xml", "xml").parse();
		for (int i = 0; i < preguntas.size(); i++) {
			Assert.assertNotNull(preguntas.get(i).getRespuestaCorrecta());
			int cont = 0;
			for (int j = 0; j < preguntas.get(i).getRespuestas().size(); j++) {
				if (preguntas.get(i).getRespuestas().get(j).isCorrecta()) {
					cont++;
				}
				if(i == 0){
					Assert.assertEquals(preguntas.get(i).getRespuestaCorrecta().getRespuesta(), "cuatro");
				}
			}
			assertThat(cont).isEqualTo(1);
		}
	}

}
