package tn.iset.govsolution.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "users_roles")
@IdClass(Users_Roles.class)
public class Users_Roles implements Serializable {
	
	@Id
	private Long user_id;
	@Id
	private Long role_id;
	
	private int permission;

	public Users_Roles() {
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

	public int getPermission() {
		return permission;
	}

	public void setPermission(int permission) {
		this.permission = permission;
	}
	
	

}
