package es.uniovi.asw.trivial.db.impl.local.persistencia.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;



@SuppressWarnings("serial")
@Entity
@Table(name="TUSUARIOS")
public class Usuario implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private String usuario;
	private String contrasenia;
	private String nombre;
	@Transient
	private String color;
	@Transient
	private int casillaActual;
	@Transient
	private String[] quesitos;
	@Transient
	private String icono;
	@OneToMany(mappedBy = "usuario")
	protected Set<UsuariosPartida> partidas= new HashSet<UsuariosPartida>();

	public Set<UsuariosPartida> getPartida() {
		return Collections.unmodifiableSet(partidas);
	}

	public Set<UsuariosPartida> _getPartida() {
		return partidas;
	}	
		
	public Usuario(){
		super();
	}
	
	public Usuario(Long id, String usuario, String contrasenia, String nombre){
		this.id = id;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.color = "";
		this.casillaActual = -1;
		this.quesitos = new String[4];
	}
	
	public void addQuesito(String categoria) {
		if(quesitos == null)
			quesitos = new String[4];
		if(categoria.equalsIgnoreCase("espectáculos"))
			quesitos[0] = categoria;
		else if(categoria.equalsIgnoreCase("ciencia y naturaleza"))
			quesitos[1] = categoria;
		else if(categoria.equalsIgnoreCase("geografía"))
			quesitos[2] = categoria;
		else if(categoria.equalsIgnoreCase("historia"))
			quesitos[3] = categoria;
		
		actualizarIconoQuesitos();
	}
	
	public void actualizarIconoQuesitos(){
		icono = icono.split("_")[0];
		for(String quesito : quesitos){
			icono += "_"+quesito;
		}
		icono += ".png";
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id){
		this.id=id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public void setColor(String colorJugador) {
		this.color = colorJugador;
	}
	public void setCasillaActual(int casillaActual){
		this.casillaActual = casillaActual;
	}
	public int getCasillaActual(){
		return casillaActual;
	}
	public void setIcono(String icono){
		this.icono = icono;
	}
	public String getIcono(){
		return icono;
	}
	public String getContrasenia(){
		return contrasenia;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}