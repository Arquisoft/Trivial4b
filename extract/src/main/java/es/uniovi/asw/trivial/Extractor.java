
package es.uniovi.asw.trivial;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import es.uniovi.asw.trivial.db.MongoDBJDBC;
import es.uniovi.asw.trivial.logica.Pregunta;
import es.uniovi.asw.trivial.logica.Respuesta;
import es.uniovi.asw.trivial.parser.ParserBuilder;

public class Extractor {

	public static void main(String[] args) {
		new Extractor().run(args);
	}

	public int run(String[] args) {
		if (args.length != 3) {
			System.out.println("Incorrect number of params");
			usage();
			return 0;
		} else {
			System.out.println("Welcome to Trivial Extractor");
			String inputFilePath = args[0];
			String inputFileFormat = args[1];
			String outputFile = args[2];
	
			List<Pregunta> preguntas = ParserBuilder.build(inputFilePath,
					inputFileFormat).parse();
	
			imprimirPreguntas(preguntas);
	
			String jsonResult = JSONConverter.getJSON(preguntas);
			System.out.println(jsonResult);
			
			crearArchivoJSON(outputFile, jsonResult);
			
			MongoDBJDBC.insert(outputFile);
			
			System.out.println("Insercción realizada con éxito");
		}
		return -1;
	}

	public void usage() {
		System.out.println("Usage:\n\t java -jar extractor [INPUT_FILE] [FORMAT_INPUT_FILE] [OUTPUT_FILE] [FORMAT_OUTPUT_FILE]");
		System.out.println("\nAdmitted formats:\n\t*GIFT\n\t*XML");
		System.out.println("\n*All parameters are required*");
	}

	private void imprimirPreguntas(List<Pregunta> preguntas) {
		for (Pregunta p : preguntas) {
			System.out.println(p.getEnunciado());
			List<Respuesta> respuestas = p.getRespuestas();
			for (int i = 0; i < respuestas.size(); i++)
				System.out.println("\t" + respuestas.get(i).getRespuesta());

			System.out.println();
		}
	}

	private void crearArchivoJSON(String outputFile, String jsonResult) {
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(new File(
					outputFile)));
			bw.write(jsonResult);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
