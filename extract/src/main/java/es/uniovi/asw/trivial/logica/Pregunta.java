package es.uniovi.asw.trivial.logica;

public class Pregunta {

	private String enunciado; // Enunciado de la pregunta
	private String categoria; // Categoria de la pregunta
	private Respuesta[] respuestas; // Vector que contiene las respuestas de la
									// pregunta
	private int contadorRespuesta; // Cuenta el numero de respuestas

	/**
	 * Constructor con un parametro de la clase pregunta. Inicializa el vector
	 * de respuestas con un tamaño 4 por defecto.
	 * 
	 * @param enunciado
	 *            es el enunciado de la pregunta.
	 */
	public Pregunta(String enunciado) {
		this.enunciado = enunciado;
		this.respuestas = new Respuesta[4];
	}

	/**
	 * Sobrecarga del constructor de la clase pregunta, añadiendole el parametro
	 * categoria
	 * 
	 * @param enunciado
	 *            es el enunciado de la pregunta
	 * @param categoria
	 *            la categoria de la pregunta
	 */
	public Pregunta(String enunciado, String categoria) {
		this.enunciado = enunciado;
		this.categoria = categoria;
		this.respuestas = new Respuesta[4];
	}

	/**
	 * Metodo que recorre el vector de respuestas y de devuelve la respuesta
	 * correcta.
	 * 
	 * @return respuesta correcta
	 */
	public Respuesta getRespuestaCorrecta() {
		for (int i = 0; i < respuestas.length; i++)
			if (respuestas[i].isCorrecta()) {
				return respuestas[i];
			}
		return null;
	}

	/**
	 * Añade una respuesta a la ultima posicion del vector de respuestas
	 * 
	 * @param respuesta
	 *            la respuesta a añadir
	 */
	public void addRespuesta(Respuesta respuesta) {
		if (contadorRespuesta >= 0 && contadorRespuesta < respuestas.length)
			respuestas[contadorRespuesta] = respuesta;
		contadorRespuesta++;
	}

	/**
	 * Devuelve el enunciado de la pregunta
	 * 
	 * @return enunciado el enunciado de la pregunta
	 */
	public String getEnunciado() {
		return enunciado;
	}

	/**
	 * Devuelve la categoria de la pregunta
	 * 
	 * @return categoria de la pregunta
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * Retorna el vector de respuestas
	 * 
	 * @return vector de respuestas
	 */
	public Respuesta[] getRespuestas() {
		return respuestas;
	}

}
