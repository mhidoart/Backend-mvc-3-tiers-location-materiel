package com.ba.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Departement  {
	
	@Id
	@GeneratedValue
	private int id;
	private String nom;
	
	@JsonIgnore
	@OneToMany(mappedBy="departement",fetch=FetchType.LAZY)
	private List<User>users;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Departement(String nom, List<User> users) {
		super();
		this.nom = nom;
		this.users = users;
	}

	public Departement(String nom) {
		super();
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Departement [id=" + id + ", nom=" + nom + ", users=" + users + "]";
	}
	
	
	
	
	


}
