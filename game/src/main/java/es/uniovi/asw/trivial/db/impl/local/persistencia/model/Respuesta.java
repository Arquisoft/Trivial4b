package es.uniovi.asw.trivial.db.impl.local.persistencia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@SuppressWarnings("serial")
@Entity
@Table(name="TRESPUESTAS")
public class Respuesta implements Serializable{
	@Id private Long id;
	private String respuesta;
	private boolean correcta;
	
	public Respuesta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Respuesta(Long id, String respuesta, boolean correcta) {
		super();
		this.id = id;
		this.respuesta = respuesta;
		this.correcta = correcta;
	}
	
	public Respuesta( String respuesta, boolean correcta) {
		this.respuesta = respuesta;
		this.correcta = correcta;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public boolean isCorrecta() {
		return correcta;
	}

	public void setCorrecta(boolean correcta) {
		this.correcta = correcta;
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
		Respuesta other = (Respuesta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
