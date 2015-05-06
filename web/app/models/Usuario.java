package models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

public class Usuario {

	private Long id;
	private String usuario;
	private String contrasenia;
	private String nombre;
	private boolean privilegiado;

	private String color;
	private int casillaActual;
	private String[] quesitos;
	private String icono;

	public Usuario(String usuario, String contrasenia) {
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.icono = "FichaRo_";
		quesitos = new String[4];
		actualizarIconoQuesitos();
	}

	public Usuario(Long id, String usuario, String contrasenia, String nombre) {
		this.id = id;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.color = "";
		this.casillaActual = -1;
		this.quesitos = new String[4];
		this.privilegiado = false;
	}

	public void addQuesito(String categoria) {
		if (quesitos == null)
			quesitos = new String[4];
		if (categoria.equalsIgnoreCase("espectáculos"))
			quesitos[0] = categoria;
		else if (categoria.equalsIgnoreCase("ciencias y naturaleza"))
			quesitos[1] = categoria;
		else if (categoria.equalsIgnoreCase("geografía"))
			quesitos[2] = categoria;
		else if (categoria.equalsIgnoreCase("historia"))
			quesitos[3] = categoria;

		actualizarIconoQuesitos();
	}

	public void actualizarIconoQuesitos() {
		icono = icono.split("_")[0];
		for (String quesito : quesitos) {
			if (quesito != null)
				icono += "_" + quesito.replace(" ", "");
			else
				icono += "_" + quesito;
		}
		icono += ".png";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public void setCasillaActual(int casillaActual) {
		this.casillaActual = casillaActual;
	}

	public int getCasillaActual() {
		return casillaActual;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public String getIcono() {
		return icono;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public boolean isPrivilegiado() {
		return privilegiado;
	}

	public boolean todosLosQuesitos() {
		for (String string : quesitos)
			if (string == null)
				return false;
		return true;
	}

}