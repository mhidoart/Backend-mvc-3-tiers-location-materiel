package com.ba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Departement extends Proprietaire {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nom;
	public Departement() {
		// TODO Auto-generated constructor stub
	}
	public Departement(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public Departement( String nom) {
		super();
		this.nom = nom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Departement [id=" + id + ", nom=" + nom + "]";
	}


}
