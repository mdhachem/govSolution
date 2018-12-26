package tn.iset.govsolution.entity;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.IdClass;


public class User_Role_Id implements Serializable {
	
	
	private Long user_id;
	
	private Long role_id;

	public User_Role_Id() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Long getRole_id() {
		return role_id;
	}

	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}
	
	

}
