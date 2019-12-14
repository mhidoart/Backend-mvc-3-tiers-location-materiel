package com.ba.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class User implements Serializable {

	@Id @GeneratedValue
	private Integer id;
	private String nom;
	private String prenom;
	private String email;
	private String pasword;
	private String username;
	@Column(columnDefinition = "boolean default true")
	private boolean enabled;
	
	@JsonIgnore
	@OneToMany(mappedBy="user",fetch=FetchType.LAZY)
	private List<Ressource>ressources;
	
	@ManyToOne
	@JoinColumn
	private Departement departement;
	
	
	
	public User(Integer id, String nom, String prenom, String email, String pasword, String username, boolean enabled, List<Role> roles) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.pasword = pasword;
		this.username = username;
		this.enabled = enabled;
		this.roles = roles;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	
	@ManyToMany
    @JoinTable( 
        name = "users_roles", 
        joinColumns = @JoinColumn(
          name = "user_id", referencedColumnName = "id"), 
        inverseJoinColumns = @JoinColumn(
          name = "role_id", referencedColumnName = "id")) 
    private List<Role> roles;

	


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPernom() {
		return prenom;
	}
	public void setPernom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	
	

	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	public User() {
		super();
	}
	public User(String nom, String prenom, String email, String pasword, String login) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.pasword = pasword;
		
	}
	
	public List<Ressource> getRessources() {
		return ressources;
	}
	public void setRessources(List<Ressource> ressources) {
		this.ressources = ressources;
	}
	
	
	public User(String nom, String prenom, String email, String pasword, String username, boolean enabled,
			List<Ressource> ressources, List<Role> roles) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.pasword = pasword;
		this.username = username;
		this.enabled = enabled;
		this.ressources = ressources;
		this.roles = roles;
	}
	
	
	

	public User(String nom, String prenom, String email, String pasword, String username, boolean enabled,
			List<Role> roles) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.pasword = pasword;
		this.username = username;
		this.enabled = enabled;
		this.roles = roles;
	}
	
	
	public User(String nom, String prenom, String email, String pasword, String username, boolean enabled,
			List<Ressource> ressources, Departement departement, List<Role> roles) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.pasword = pasword;
		this.username = username;
		this.enabled = enabled;
		this.ressources = ressources;
		this.departement = departement;
		this.roles = roles;
	}
	
	public User(String nom, String prenom, String email, String pasword, String username, boolean enabled,
			List<Ressource> ressources, Departement departement) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.pasword = pasword;
		this.username = username;
		this.enabled = enabled;
		this.ressources = ressources;
		this.departement = departement;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", pasword=" + pasword
				+ ", username=" + username + ", enabled=" + enabled + ", roles=" + roles + "]";
	}

	
	

	

}
