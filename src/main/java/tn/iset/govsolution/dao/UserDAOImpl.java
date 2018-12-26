package tn.iset.govsolution.dao;

import java.util.List;

import javax.persistence.EntityManager;

import tn.iset.govsolution.config.EMF;
import tn.iset.govsolution.entity.User;


public class UserDAOImpl implements UserDAO{
	
	
	
	public EntityManager entityManager=EMF.createEntityManager();

	
	public User addUser(User User) {
		
		entityManager.persist(User);
		return User;
	}

	
	public User updateUser(User User) {
		entityManager.merge(User);
		return User;
	}

	
	public void deleteUser(long UserId) {
	
		
	}

	public User getUser(long UserId) {
		String sql = "select User from User User where User.id="+UserId;
		try{
			return (User) entityManager.createQuery(sql).getSingleResult();
		}catch(Exception e){
		}
		return null;
	}

	
	public List<User> getUsers() {
		
		return entityManager.createQuery("select User from User User").getResultList();
	}


	@Override
	public User loginUser(String username, String password) {
		String sql = "select User from User User where User.login='"+username+ "' and User.password= '"+password+"'";
		try{
			return (User) entityManager.createQuery(sql).getSingleResult();
		}catch(Exception e){
		}
		return null;
	}

}
