package tn.iset.govsolution.entity;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "user")
public class User extends AbstractPersistable<Long>{


   private static final long serialVersionUID = 1L;

   private String firstName;
   private String lastName;
   private String email;
   private String login;
   private String password;
   private boolean enabled;
   private boolean tokenExpired;
   

   @ManyToMany
   @JoinTable( 
       name = "users_roles", 
       joinColumns = @JoinColumn(
         name = "user_id", referencedColumnName = "id"), 
       inverseJoinColumns = @JoinColumn(
         name = "role_id", referencedColumnName = "id")) 
   private List<Role> roles;


   public void setPassword(String password) {
       this.password = password;
   }



   


   public String getLogin() {
	return login;
}






public void setLogin(String login) {
	this.login = login;
}






public String getFirstName() {
	return firstName;
}






public void setFirstName(String firstName) {
	this.firstName = firstName;
}






public String getLastName() {
	return lastName;
}






public void setLastName(String lastName) {
	this.lastName = lastName;
}






public String getEmail() {
	return email;
}






public void setEmail(String email) {
	this.email = email;
}






public boolean isEnabled() {
	return enabled;
}






public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}






public boolean isTokenExpired() {
	return tokenExpired;
}






public void setTokenExpired(boolean tokenExpired) {
	this.tokenExpired = tokenExpired;
}






public List<Role> getRoles() {
	return roles;
}






public void setRoles(List<Role> roles) {
	this.roles = roles;
}






public static long getSerialversionuid() {
	return serialVersionUID;
}






public String getPassword() {
	return password;
}






public User() {
       super();
   }
   
   
}
