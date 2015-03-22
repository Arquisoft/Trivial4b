package es.uniovi.asw.trivial.model.pregunta;

public class PreguntaGame {

	private Pregunta pregunta;
	private boolean esQuesito;
	
	public PreguntaGame(Pregunta pregunta, boolean esQuesito) {
		this.pregunta = pregunta;
		this.esQuesito = esQuesito;
	}

	public Pregunta getPregunta() {
		return pregunta;
	}

	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}

	public boolean isEsQuesito() {
		return esQuesito;
	}

	public void setEsQuesito(boolean esQuesito) {
		this.esQuesito = esQuesito;
	}
	
}
