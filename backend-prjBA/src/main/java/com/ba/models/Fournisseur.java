package com.ba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Fournisseur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String nom;
	private String email;
	private String tel;
	
	public Fournisseur() {
		// TODO Auto-generated constructor stub
	}

	public Fournisseur(int id, String nom, String email, String tel) {
		super();
		this.id = id;
		this.nom = nom;
		this.email = email;
		this.tel = tel;
	}

	public Fournisseur(String nom, String email, String tel) {
		super();
		this.nom = nom;
		this.email = email;
		this.tel = tel;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Fournisseur [id=" + id + ", nom=" + nom + ", email=" + email + ", tel=" + tel + "]";
	}

}
