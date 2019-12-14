package com.ba.models;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Role  implements Serializable{

		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String name;
	    @JsonIgnore
	    @ManyToMany(mappedBy = "roles")
	    private List<User> users;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<User> getUsers() {
			return users;
		}
		public void setUsers(List<User> users) {
			this.users = users;
		}
		public Role(Long id, String name, List<User> users) {
			super();
			this.id = id;
			this.name = name;
			this.users = users;
		}
		public Role(Long id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public Role() {
			super();
		}
	    
		
	    
	
	
}
