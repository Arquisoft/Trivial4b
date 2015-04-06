package es.uniovi.asw.trivial.db.impl.local.persistencia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import es.uniovi.asw.trivial.db.impl.local.persistencia.model.type.UsuarioPartidaKey;

@SuppressWarnings("serial")
@Entity
@Table(name="TUSUARIOSPARTIDA")
@IdClass(UsuarioPartidaKey.class)
public class UsuariosPartida implements Serializable{
	@Id @ManyToOne private Usuario usuario;
	@Id @ManyToOne private Partida partida;
	public UsuariosPartida() {
		super();
	}
	public UsuariosPartida(Usuario usuario, Partida partida) {
		super();
		this.usuario = usuario;
		this.partida = partida;
		
		this.usuario.getPartida().add(this);
		this.partida.getPartida().add(this);
	}
	
	public void unlink() {
		usuario.getPartida().remove(this);
		partida.getPartida().remove(this);

		this.usuario= null;
		this.partida = null;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Partida getPartida() {
		return partida;
	}
	public void setPartida(Partida partida) {
		this.partida = partida;
	}
}
