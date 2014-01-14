package com.denny.sis.two.controller;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;

import com.denny.sis.two.util.UtilesLocales;


/**
 * Managed bean para el control de Menu
 * 
 * @jpacheco 
 */
@Model
//@ManagedBean(name = "menuController")
@SessionScoped
public class MenuController implements Serializable {

	private static final long serialVersionUID = 1L;

	private String pagina = "";

	public MenuController() {

	}

	@PostConstruct
	public void inicio() {

		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);

		System.out.println("Session creda = " + session);

		// limpiando el cache de la session
//		UtilesLocales.limpiarCache(session);
		this.pagina = "/pages/principal.xhtml";
		
//		if (session != null && session.getAttribute("vistaId") != null) {
//
//			this.pagina = (String) session.getAttribute("vistaId");
//			session.removeAttribute("vistaId");
//
//		} else {
//			// carga vista principal si es que no se cargo la vista a
//			// redireccionar
			this.pagina = "/pages/principal.xhtml";
//			this.pagina = "/pages/paginaPrueba.xhtml";			
//
//		}

		System.out.println("Estoy en el constructo...: " + pagina);

	}

	/**
	 * 
	 * Metodo que maneja los eventos del menu
	 * 
	 * @param event
	 */
	public void eventoMenu(ActionEvent event) {

		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);

		System.out.println("Session creada evento: " + session);
		
		// limpiando el cache de la session
		UtilesLocales.limpiarCache(session);

		Map<String, String> map = FacesContext.getCurrentInstance().getExternalContext()
				.getRequestParameterMap();

		if (map != null) {
			// obteniendo la pagina de la session
//			this.pagina = (String) map.get("pagina");
			this.pagina = "/pages/principal.xhtml";
		} else {
			System.out.println("NULLLLLLLLLLLLLLLLLLL");
		}

		System.out.println("Estoy en el evento para cargar la pagina: "
				+ pagina);

	}

	public String getPagina() {
		return pagina;
	}

	public void setPagina(String pagina) {
		this.pagina = pagina;
	}

}
