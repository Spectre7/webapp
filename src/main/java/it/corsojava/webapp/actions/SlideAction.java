package it.corsojava.webapp.actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.opensymphony.xwork2.ActionSupport;

import it.corsojava.webapp.domain.Slide;

public class SlideAction extends ActionSupport {
	private List<Slide> slides = null;
	
	private static final long serialVersionUID = 1L;

	public String execute() throws Exception {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("webapp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		TypedQuery<Slide> query = entityManager.createNamedQuery("slides", Slide.class);
		
		slides = query.getResultList();
		
		return SUCCESS;
		
	}

	public List<Slide> getSlides() {
		return slides;
	}

	public void setSlides(List<Slide> slides) {
		this.slides = slides;
	}
}
