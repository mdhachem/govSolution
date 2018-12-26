package tn.iset.govsolution.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import tn.iset.govsolution.config.EMF;
import tn.iset.govsolution.entity.Inscription;

public class RegistrationDAOImpl implements RegistrationDAO {
	
	public EntityManager entityManager=EMF.createEntityManager();

	@Override
	public Inscription addInscription(Inscription Inscription) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inscription updateInscription(Inscription Inscription) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInscription(long InscriptionId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Inscription getInscription(long InscriptionId) {
			Inscription p = entityManager.find(Inscription.class, InscriptionId);
			return p;

	}

	@Override
	public List<Inscription> getInscriptions() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("select ins from Inscription ins").getResultList();
	}

	@Override
	public List<Inscription> findByQuery(String query) {
		// TODO Auto-generated method stub
		return entityManager.createQuery(query).getResultList();
	}

	@Override
	public Inscription accept(long InscriptionId) {
		Inscription ins = entityManager.find(Inscription.class, InscriptionId);
		ins.setResolu(true);
		EntityTransaction transaction = entityManager.getTransaction();
		/* Démarrer la transaction */ 
		transaction.begin();
		try {
			entityManager.merge(ins);
			transaction.commit();
		}catch(Exception e) {
			/* Annuler la transaction en cas d'exception */
			transaction.rollback();
			e.printStackTrace();
		}
		Inscription p = entityManager.find(Inscription.class, InscriptionId);
		return p;
		
	}

	@Override
	public Inscription refuse(long InscriptionId) {
		Inscription ins = entityManager.find(Inscription.class, InscriptionId);
		ins.setResolu(false);
		EntityTransaction transaction = entityManager.getTransaction();
		/* Démarrer la transaction */ 
		transaction.begin();
		try {
			entityManager.merge(ins);
			transaction.commit();
		}catch(Exception e) {
			/* Annuler la transaction en cas d'exception */
			transaction.rollback();
			e.printStackTrace();
		}
		Inscription p = entityManager.find(Inscription.class, InscriptionId);
		return p;
	}

}
