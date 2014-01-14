package com.denny.sis.two.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

/**
 * Managed bean para el control de Titulo.
 * 
 * @jpacheco 
 */
@Model
//@ManagedBean(name = "titleController")
@SessionScoped
public class MyController implements Serializable {

	private static final long serialVersionUID = 1L; // Serial para el control de versiones de clases.

	// Inyeccion de objetos
	//@Inject
	//private Constantes constantes;
	
	/**
	 * Cadena de texto para comprobar.
	 */
	private String titulo; 

	/**
	 * Constructor por defecto
	 */
	public MyController() {

	}

	/**
	 * Procedimiento de inicialización posterior a la instanciación del objeto.
	 */
	@PostConstruct
	public void inicio() {
		
		// Inicializacion de variable cadena
		//constantes.obtenerDato();
		titulo = "JUAN DANIEL RULES!!!!";

	}

	/** Getters y Setters */
	public String getCadena() {
		return titulo;
	}

	public void setCadena(String cadena) {
		this.titulo = cadena;
	}
	
	

}
