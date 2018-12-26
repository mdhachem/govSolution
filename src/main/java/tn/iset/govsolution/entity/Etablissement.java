package tn.iset.govsolution.entity;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javax.persistence.ForeignKey;
import javax.persistence.Inheritance;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "etablissement")
public class Etablissement extends AbstractEtablissement <Long> {
private boolean isActive;
//@Temporal(TemporalType.TIMESTAMP)
private LocalDateTime dateCreation;

 @OneToMany(mappedBy="etablissement")
 private List<Abonnement> abonnements;

@OneToMany(mappedBy="etablissement",fetch=FetchType.LAZY,cascade= {CascadeType.ALL})
private List<Commande> commandes;

@ManyToOne()
private SecteurActivite secteur;

public Etablissement(String rsFr, String rsAr, String mail, String abrvFr, String abrvAr, String tel, String adresseFr,
		String adressAr, String villeFr, String villeAr, String cp, String observationFr, String observationAr, Long id,
		boolean isActive, LocalDateTime dateCreation) {
	super(rsFr, rsAr, mail, abrvFr, abrvAr, tel, adresseFr, adressAr, villeFr, villeAr, cp, observationFr,
			observationAr, id);
	this.isActive = isActive;
	this.dateCreation = dateCreation;
}

public boolean isActive() {
	return isActive;
}

public void setActive(boolean isActive) {
	this.isActive = isActive;
}

public LocalDateTime getDateCreation() {
	return dateCreation;
}

public void setDateCreation(LocalDateTime dateCreation) {
	this.dateCreation = dateCreation;
}


public SecteurActivite getSecteur() {
	return secteur;
}

public void setSecteur(SecteurActivite secteur) {
	this.secteur = secteur;
}


}

