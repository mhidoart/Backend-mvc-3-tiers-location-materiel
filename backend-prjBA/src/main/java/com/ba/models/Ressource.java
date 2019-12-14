package com.ba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ressource {

	@Id @GeneratedValue
	private Integer id;
	private String marque;
	
	@ManyToOne
	@JoinColumn
	private User user;
	
	@ManyToOne
	@JoinColumn
	private Fournisseur fournisseur;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	
	

	public Ressource(String marque, User user, Fournisseur fournisseur) {
		super();
		this.marque = marque;
		this.user = user;
		this.fournisseur = fournisseur;
	}

	
	public Ressource(String marque, Fournisseur fournisseur) {
		super();
		this.marque = marque;
		this.fournisseur = fournisseur;
	}

	public Ressource(String marque, User user) {
		super();
		this.marque = marque;
		this.user = user;
	}

	
	public Ressource(String marque) {
		super();
		this.marque = marque;
	}

	
	
	public Ressource() {
		super();
	}

	@Override
	public String toString() {
		return "Ressource [id=" + id + ", marque=" + marque + ", user=" + user + "]";
	}
	
	
	
	
	
	

}
