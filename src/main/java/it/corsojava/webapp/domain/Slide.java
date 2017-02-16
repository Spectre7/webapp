package it.corsojava.webapp.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Slide
 *
 */
@Entity
@NamedQuery(query="SELECT s FROM Slide s", name="slides")
public class Slide implements Serializable {
	
	@Id
	private Long id;
	private String title;
	private String body;
	
	@OneToMany
	private List<Tag> tag;
	
	private static final long serialVersionUID = 1L;

	public Slide() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<Tag> getTag() {
		return tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;
	}
	
	
   
}
