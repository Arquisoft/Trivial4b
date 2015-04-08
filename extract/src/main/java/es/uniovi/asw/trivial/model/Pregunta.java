package es.uniovi.asw.trivial.model;

import java.util.ArrayList;
import java.util.List;

public class Pregunta {

	private String enunciado; // Enunciado de la pregunta
	private String categoria; // Categoria de la pregunta
	private List<Respuesta> respuestas; // Vector que contiene las respuestas de la
									// pregunta

	/**
	 * Constructor con un parametro de la clase pregunta. Inicializa el vector
	 * de respuestas con un tamaño 4 por defecto.
	 * 
	 * @param enunciado
	 *            es el enunciado de la pregunta.
	 */
	public Pregunta(String enunciado) {
		this.enunciado = enunciado;
		this.respuestas = new ArrayList<Respuesta>();
	}

	/**
	 * Constructor con un parametro de la clase pregunta. Inicializa el vector
	 * de respuestas con un tamaño 4 por defecto.
	 * 
	 * @param enunciado
	 *            es el enunciado de la pregunta.
	 *            
	 * @param respuestas
	 * 			respuestas de la pregunta
	 */
	public Pregunta(String enunciado, List<Respuesta> respuestas) {
		this.enunciado = enunciado;
		this.respuestas = respuestas;
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
		this.respuestas = new ArrayList<Respuesta>();
	}
	
	/**
	 * Sobrecarga del constructor de la clase pregunta, añadiendole los parametros
	 * categoria y respuestas
	 * 
	 * @param enunciado
	 * 				es el enunciado de la pregunta
	 * @param categoria
	 * 				la categoria de la pregunta
	 * @param respuestas
	 * 				respuestas de la pregunta
	 */
	public Pregunta(String enunciado, String categoria, List<Respuesta> respuestas) {
		this.enunciado = enunciado;
		this.categoria = categoria;
		this.respuestas = respuestas;
	}

	/**
	 * Metodo que recorre el vector de respuestas y de devuelve la respuesta
	 * correcta.
	 * 
	 * @return respuesta correcta
	 */
	public Respuesta getRespuestaCorrecta() {
		for (int i = 0; i < respuestas.size(); i++)
			if (respuestas.get(i).isCorrecta()) {
				return respuestas.get(i);
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
		respuestas.add(respuesta);
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
	public List<Respuesta> getRespuestas() {
		return respuestas;
	}

}
