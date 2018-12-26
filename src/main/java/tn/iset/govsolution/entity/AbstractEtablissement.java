package tn.iset.govsolution.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEtablissement <PK extends Serializable> {
	@Id @GeneratedValue private PK id;
	
private  String rsFr;
private  String rsAr;
private  String mail;
private  String abrvFr  ;
private  String abrvAr;
private  String tel ;
private  String adresseFr;
private  String adressAr;
private  String villeFr;
private  String villeAr; 
private  String cp; 
private  String observationFr; 
private  String  observationAr;




public AbstractEtablissement() {
	super();
	// TODO Auto-generated constructor stub
}
public AbstractEtablissement(String rsFr, String rsAr, String mail, String abrvFr, String abrvAr, String tel,
		String adresseFr, String adressAr, String villeFr, String villeAr, String cp, String observationFr,
		String observationAr, PK id) {
	super();
	this.rsFr = rsFr;
	this.rsAr = rsAr;
	this.mail = mail;
	this.abrvFr = abrvFr;
	this.abrvAr = abrvAr;
	this.tel = tel;
	this.adresseFr = adresseFr;
	this.adressAr = adressAr;
	this.villeFr = villeFr;
	this.villeAr = villeAr;
	this.cp = cp;
	this.observationFr = observationFr;
	this.observationAr = observationAr;
	this.id = id;
}
public String getRsFr() {
	return rsFr;
}
public void setRsFr(String rsFr) {
	this.rsFr = rsFr;
}
public String getRsAr() {
	return rsAr;
}
public void setRsAr(String rsAr) {
	this.rsAr = rsAr;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getAbrvFr() {
	return abrvFr;
}
public void setAbrvFr(String abrvFr) {
	this.abrvFr = abrvFr;
}
public String getAbrvAr() {
	return abrvAr;
}
public void setAbrvAr(String abrvAr) {
	this.abrvAr = abrvAr;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getAdresseFr() {
	return adresseFr;
}
public void setAdresseFr(String adresseFr) {
	this.adresseFr = adresseFr;
}
public String getAdressAr() {
	return adressAr;
}
public void setAdressAr(String adressAr) {
	this.adressAr = adressAr;
}
public String getVilleFr() {
	return villeFr;
}
public void setVilleFr(String villeFr) {
	this.villeFr = villeFr;
}
public String getVilleAr() {
	return villeAr;
}
public void setVilleAr(String villeAr) {
	this.villeAr = villeAr;
}
public String getCp() {
	return cp;
}
public void setCp(String cp) {
	this.cp = cp;
}
public String getObservationFr() {
	return observationFr;
}
public void setObservationFr(String observationFr) {
	this.observationFr = observationFr;
}
public String getObservationAr() {
	return observationAr;
}
public void setObservationAr(String observationAr) {
	this.observationAr = observationAr;
}
public PK getId() {
	return id;
}
public void setId(PK id) {
	this.id = id;
}




	
}
