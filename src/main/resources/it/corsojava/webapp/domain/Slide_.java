package it.corsojava.webapp.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-02-16T15:56:46.810+0100")
@StaticMetamodel(Slide.class)
public class Slide_ {
	public static volatile SingularAttribute<Slide, Long> id;
	public static volatile SingularAttribute<Slide, String> title;
	public static volatile SingularAttribute<Slide, String> body;
	public static volatile ListAttribute<Slide, Tag> tag;
}
