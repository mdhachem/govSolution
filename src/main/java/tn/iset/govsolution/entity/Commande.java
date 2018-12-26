package tn.iset.govsolution.entity;



import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;



@Entity
@Table(name = "commande")
public class Commande extends AbstractPersistable<Long> {

	//@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime dateCommande;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="Commande_modules",joinColumns = {@JoinColumn(name="commande_id", referencedColumnName="id")},
                                 inverseJoinColumns = {@JoinColumn(name="module_id", referencedColumnName="id")})
	private List<Module> modules;
    
@ManyToOne()
private Etablissement etablissement;

	
public Commande(Long id, LocalDateTime dateCommande) {
		super(id);
		this.dateCommande = dateCommande;
	}

	public LocalDateTime getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(LocalDateTime dateCommande) {
		this.dateCommande = dateCommande;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public Etablissement getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(Etablissement etablissement) {
		this.etablissement = etablissement;
	}
	
	
	

	


}
