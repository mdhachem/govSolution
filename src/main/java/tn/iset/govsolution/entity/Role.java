package tn.iset.govsolution.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends AbstractPersistable<Long> {

   private static final long serialVersionUID = 1L;

   private String role;
   
  
   @ManyToMany(mappedBy = "roles")
   private Collection<User> users;

   
   
   
   @ManyToOne(fetch=FetchType.LAZY)
   private Module module;

   public String getRole() {
       return role;
   }

   public void setRole(String role) {
       this.role = role;
   }

   public Role() {
   }

   public Role(String role) {
       this.role = role;
   }

}