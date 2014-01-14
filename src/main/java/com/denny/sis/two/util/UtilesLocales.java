package com.denny.sis.two.util;

import javax.servlet.http.HttpSession;

/**
 * 
 * Clase que permite manejar los utiles de la aplicaciones locales
 * 
 * @author jpacheco
 * 
 */
public class UtilesLocales {

	/**
	 * 
	 * Metodo que permite limpiar los bena del tipo session
	 * 
	 * @param session
	 */
	public static void limpiarCache(HttpSession session) {

		session.removeAttribute("primeTestBean");
		session.removeAttribute("categoriaPuestoBean");
		session.removeAttribute("clavesBean");

	}

}
