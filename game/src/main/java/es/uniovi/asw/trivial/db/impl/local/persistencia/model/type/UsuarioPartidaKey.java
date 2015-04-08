package es.uniovi.asw.trivial.db.impl.local.persistencia.model.type;

import java.io.Serializable;


@SuppressWarnings("serial")
public class UsuarioPartidaKey implements Serializable{
	Long usuario;
	Long partida;
	public UsuarioPartidaKey() {
		super();
	}
	public UsuarioPartidaKey(Long usuario, Long partida) {
		super();
		this.usuario = usuario;
		this.partida = partida;
	}
	public Long getUsuario() {
		return usuario;
	}
	public Long getPartida() {
		return partida;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((partida == null) ? 0 : partida.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		UsuarioPartidaKey other = (UsuarioPartidaKey) obj;
		if (partida == null) {
			if (other.partida != null)
				return false;
		} else if (!partida.equals(other.partida))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
}
