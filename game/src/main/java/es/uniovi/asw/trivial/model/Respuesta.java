package es.uniovi.asw.trivial.model;

public class Respuesta {

	private String respuesta; // La respuesta
	private boolean isCorrecta; // Booleano que nos dirá si es correcta o no

	/**
	 * Constructor de la clase respuesta con dos parametros
	 * 
	 * @param respuesta
	 *            la respuesta como tal
	 * @param isCorrecta
	 *            determina si la respuesta es correcta o no
	 */
	public Respuesta(String respuesta, boolean isCorrecta) {
		this.respuesta = respuesta;
		this.isCorrecta = isCorrecta;
	}

	/**
	 * Devuelve la respuesta
	 * 
	 * @return respuesta de una pregunta
	 */
	public String getRespuesta() {
		return respuesta;
	}

	/**
	 * Devuelve el atributo isCorrecta
	 * 
	 * @return true si es correcta / false si no lo es
	 */
	public boolean isCorrecta() {
		return isCorrecta;
	}

}
