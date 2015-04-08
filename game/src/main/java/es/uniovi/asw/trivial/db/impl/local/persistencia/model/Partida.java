package es.uniovi.asw.trivial.db.impl.local.persistencia.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@SuppressWarnings("serial")
@Entity
@Table(name="TPARTIDA")
public class Partida implements Serializable{
	@Id @GeneratedValue
	private Long id;
	@OneToMany(mappedBy="partida")
	private Set<UsuariosPartida> partidas;
	private Integer puntuacion;
	@OneToOne(mappedBy="partida")
	private Ranking ranking;
	
	public Set<UsuariosPartida> getPartida() {
		return Collections.unmodifiableSet(partidas);
	}

	public Set<UsuariosPartida> _getPartida() {
		return partidas;
	}	
	
	public Partida(){
		super();
	}
	
	public Partida(Long id, Integer puntuacion){
		this.id = id;
		this.puntuacion = puntuacion;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id){
		this.id=id;
	}
	public Integer getPuntuacion(){
		return puntuacion;
	}
	public void setPuntuacion(Integer punt){
		puntuacion = punt;
	}

	public Ranking getRanking() {
		return ranking;
	}

	public void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}
}