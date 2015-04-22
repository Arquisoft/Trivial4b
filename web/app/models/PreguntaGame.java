package models;

import java.util.List;

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
	
	public String getEnunciado(){
		return pregunta.getPregunta();
	}
	
	public String getCategoria(){
		return pregunta.getCategoria();
	}
	
	public Long getId(){
		return pregunta.getId();
	}
	
	public Respuesta getRespuestaCorrecta(){
		return pregunta.getRespuestaCorrecta();
	}

	public List<Respuesta> getRespuestas(){
		return pregunta.getRespuestas();
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
