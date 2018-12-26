package tn.iset.govsolution.dao;

import java.util.List;

import tn.iset.govsolution.entity.Inscription;

public interface RegistrationDAO {
	public Inscription addInscription(Inscription Inscription);
	public Inscription updateInscription(Inscription Inscription);
	public void deleteInscription(long InscriptionId);
	public Inscription getInscription(long InscriptionId);
	public List<Inscription> getInscriptions();
	public List<Inscription> findByQuery(String query);
	public Inscription accept(long InscriptionId);
	public Inscription refuse(long InscriptionId);

}
