package tn.iset.govsolution.entity;



import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Module")
public class Module extends AbstractPersistable<Long> {
	

	 private String libelleAr,libelleFr;
	 private String logo;
	 private String descriptionFr;
	 private String descriptionAr;
	 private String url;
	    
//	   @OneToMany(mappedBy="module",fetch=FetchType.LAZY)
//	   private List<Abonnement> abonnements;

		
//	   @ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//	  	private List<Commande> commandes;
//	   
	   @OneToMany(mappedBy="module",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	  	private List<Role> roles;

		public Module(Long id, String libelleAr, String libelleFr, String url) {
			super(id);
			this.libelleAr = libelleAr;
			this.libelleFr = libelleFr;
			this.url = url;
			
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

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}


	

	
}
