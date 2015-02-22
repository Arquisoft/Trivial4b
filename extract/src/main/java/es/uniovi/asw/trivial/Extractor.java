package es.uniovi.asw.trivial;

import java.util.List;

import es.uniovi.asw.trivial.logica.Pregunta;
import es.uniovi.asw.trivial.logica.Respuesta;
import es.uniovi.asw.trivial.parser.ParserBuilder;

public class Extractor {

	public void usage() {
		System.out.println("Welcome to Trivial Extractor");
	}

	public int run(String[] args) {
		if (args.length != 4) {
			usage();
			return 0;
		} else {
			String inputFilePath = args[0];
			String inputFileFormat = args[1];
			List<Pregunta> preguntas = ParserBuilder.build(inputFilePath, inputFileFormat).parse();
			
//			for(Pregunta p : preguntas){
//				System.out.println(p.getEnunciado());
//				List<Respuesta> respuestas = p.getRespuestas();
//				for(int i = 0; i < respuestas.size(); i++)
//					System.out.println("\t"+respuestas.get(i).getRespuesta());
//				
//				System.out.println();
//			}
			
			System.out.println(JSONConverter.getJSON(preguntas));
		}
		return -1;
	}

	public static void main(String[] args) {
		new Extractor().run(args);
	}
}
