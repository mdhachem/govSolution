package tn.iset.govsolution.entity;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Inscription")
public class Inscription extends AbstractEtablissement<Long> {

private Date dateDemande;
private boolean resolu;


public Inscription() {
	super();
	// TODO Auto-generated constructor stub
}
public Inscription(String rsFr, String rsAr, String mail, String abrvFr, String abrvAr, String tel, String adresseFr,
		String adressAr, String villeFr, String villeAr, String cp, String observationFr, String observationAr, Long id,
		Date dateDemande, boolean resolu) {
	super(rsFr, rsAr, mail, abrvFr, abrvAr, tel, adresseFr, adressAr, villeFr, villeAr, cp, observationFr,
			observationAr, id);
	this.dateDemande = dateDemande;
	this.resolu = resolu;
}
public Date getDateDemande() {
	return dateDemande;
}
public void setDateDemande(Date dateDemande) {
	this.dateDemande = dateDemande;
}
public boolean isResolu() {
	return resolu;
}
public void setResolu(boolean resolu) {
	this.resolu = resolu;
}




}
