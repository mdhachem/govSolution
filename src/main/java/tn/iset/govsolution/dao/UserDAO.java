package tn.iset.govsolution.dao;

import java.util.List;

import tn.iset.govsolution.entity.User;

public interface UserDAO {
	
	public User addUser(User User);
	public User updateUser(User User);
	public void deleteUser(long UserId);
	public User getUser(long UserId);
	public List<User> getUsers();
	public User loginUser(String username,String password);

}
