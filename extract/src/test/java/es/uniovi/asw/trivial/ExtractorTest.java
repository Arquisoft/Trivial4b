package es.uniovi.asw.trivial;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.UnknownHostException;
import java.util.List;

import org.eclipse.jetty.util.ajax.JSON;
import org.junit.Assert;
import org.junit.Test;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.util.*;

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
		List<Pregunta> prueba = ParserBuilder.build("preguntas.gift", "gift")
				.parse();
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
			System.out.println(JSONConverter.getJSON(prueba));
		}
		
	
		
	}

	@Test
	public void soloUnaRespuestaCorrecta() {
		List<Pregunta> preguntas = ParserBuilder
				.build("preguntas.gift", "gift").parse();
		for (int i = 0; i < preguntas.size(); i++) {
			Assert.assertNotNull(preguntas.get(i).getRespuestaCorrecta());
			int cont = 0;
			for (int j = 0; j < preguntas.get(i).getRespuestas().size(); j++) {
				if (preguntas.get(i).getRespuestas().get(j).isCorrecta()) {
					cont++;
				}
			}
			assertThat(cont).isEqualTo(1);
		}
	}

}
