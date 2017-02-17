package it.corsojava.webapp.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.opensymphony.xwork2.ActionSupport;

import it.corsojava.webapp.domain.Slide;

public class InsertSlide extends ActionSupport  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5554353505943163772L;
	private String title;
	private String body;
	
	public String execute(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("webapp");
		EntityManager em = emf.createEntityManager();
		
		Slide slide = new Slide();
		slide.setTitle(this.getTitle());
		slide.setBody(this.getBody());
		
		try{
			
		
			em.getTransaction().begin();
			em.persist(slide);
			em.getTransaction().commit();
		} catch(Exception e){
			
			return ERROR;
		}
		
		return SUCCESS;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
}
