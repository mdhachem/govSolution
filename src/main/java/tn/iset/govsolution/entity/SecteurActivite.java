package tn.iset.govsolution.entity;



import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "secteurActivite")
public class SecteurActivite extends AbstractPersistable<Long> {
	private static final long serialVersionUID = 1L;

	private String libelleAr;
	private String libelleFr;
	
	
	
	
	public SecteurActivite() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public SecteurActivite(String libelleAr, String libelleFr) {
		super();
		this.libelleAr = libelleAr;
		this.libelleFr = libelleFr;
	}


	public String getLibelleAr() {
		return libelleAr;
	}
	public void setLibelleAr(String libelleAr) {
		this.libelleAr = libelleAr;
	}
	public String getLibelleFr() {
		return libelleFr;
	}
	public void setLibelleFr(String libelleFr) {
		this.libelleFr = libelleFr;
	}

	





}
