package com.denny.sis.two.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

import java.util.Date;
import java.util.List;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.denny.sis.two.data.Usuario;

/**
 * Managed bean para el control de Titulo.
 * 
 * @jpacheco 
 */
@Model
//@ManagedBean(name = "titleController")
@SessionScoped
public class TitleController implements Serializable {

	private static final long serialVersionUID = 1L; // Serial para el control de versiones de clases.

	// Inyeccion de objetos
	//@Inject
	//private Constantes constantes;
	

	/**
	 * Datos de usuario.
	 */
	private String userName;
	private String userImg;
	
	/**
	 * Datos de fecha y hora.
	 */
	private Date hoy;
	
	/**
	 * Cadena de texto para comprobar.
	 */
	private String titulo; 
	private String stitulo; 
	

	/**
	 * Constructor por defecto
	 */
	public TitleController() {

	}

	/**
	 * Procedimiento de inicialización posterior a la instanciación del objeto.
	 */
	@PostConstruct
	public void inicio() {
		
		//Usuario usuario = new Usuario();
		//usuario.getNombres();
		// Inicializacion de variable cadena
		//constantes.obtenerDato();
		stitulo = "SISTEMA NUMERO DOS";
		hora();

		//titulo=usuario.getApellidos();
		userName ="jpacheco";
		userImg ="/resources/img/user.jpg";

	}
	
	@SuppressWarnings("deprecation")
	public void hora(){
		hoy = new Date();
	}
	 //Native SQL Query
//	 public void listBooks(){
//	 Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//	 session.beginTransaction();
//	 List list = session.createSQLQuery("select * from BookStore").addEntity(Usuario.class).list();
//	 Iterator itr = list.iterator();
//	 while(itr.hasNext()){
//	 Usuario bd = (Usuario)itr.next();
//	 System.out.println(bd);
//	 }
//	 session.getTransaction().commit();
//	 
//	 }
    public void desconectarse(ActionEvent actionEvent){  
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Desconectandose",  "enseguida se borraran los datos temporales.");  
          
        FacesContext.getCurrentInstance().addMessage(null, message);  
    } 

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getStitulo() {
		return stitulo;
	}

	public void setStitulo(String stitulo) {
		this.stitulo = stitulo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	public Date getHoy() {
		return hoy;
	}

	public void setHoy(Date hoy) {
		this.hoy = hoy;
	}
	

}
