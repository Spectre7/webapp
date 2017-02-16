package it.corsojava.webapp.domain;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Tag
 *
 */
@Entity
public class Tag implements Serializable {

	@Id
	private Long id;
	private String name;
	private static final long serialVersionUID = 1L;

	public Tag() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
