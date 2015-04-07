package es.uniovi.asw.trivial.db.impl.local.persistencia.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="TPREGUNTAS")
public class Pregunta implements Serializable{
	@Id private Long id;
	private String pregunta;
	private String categoria;
	
	@OneToMany
	private List<Respuesta> respuestas = new ArrayList<Respuesta>();

	public List<Respuesta> getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(List<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}

	public Pregunta(Long id, String pregunta, String categoria) {
		super();
		this.id = id;
		this.pregunta = pregunta;
		this.categoria = categoria;
	}
	
	public Pregunta(String pregunta, String categoria) {
		this.pregunta = pregunta;
		this.categoria = categoria;
	}

	public Pregunta() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pregunta other = (Pregunta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Respuesta getRespuestaCorrecta() {
		Iterator<Respuesta> it = respuestas.iterator() ;
		while(it.hasNext()){
			Respuesta  r= it.next();
			if(r.isCorrecta()){
				return r;
			}
		}
		return null;
	}
}
