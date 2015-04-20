package models;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@SuppressWarnings("serial")
@Entity
@Table(name="TRANKING")
public class Ranking implements Serializable{
	@Id private Long id;
	@OneToOne @JoinColumn(name="PARTIDA_ID")
	private Partida partida;
	@OneToMany
	private Set<Pregunta> pregunta = new HashSet<Pregunta>();
	
	public Ranking() {
		super();
	}
	public Ranking(Long id, Partida partida) {
		super();
		this.id = id;
		this.partida = partida;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Partida getPartida() {
		return partida;
	}
	public void setPartida(Partida partida) {
		this.partida = partida;
	}
	
	public Set<Pregunta> getPreguntas() {
		return Collections.unmodifiableSet(pregunta);
	}

	public Set<Pregunta> _getPreguntas() {
		return pregunta;
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
		Ranking other = (Ranking) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
