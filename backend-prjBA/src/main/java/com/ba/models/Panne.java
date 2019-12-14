package com.ba.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Panne {
	@Id
	@GeneratedValue
	private Integer id;
	
	@OneToOne
	@JoinColumn
	private Ressource ressource;
	private String typePanne;
	@OneToOne
	@JoinColumn
	private Fournisseur fournisseur;
	private double frequence;
	private Date datePanne;
	private String description;
	public Panne() {
		// TODO Auto-generated constructor stub
	}

	public Ressource getRessource() {
		return ressource;
	}
	public void setRessource(Ressource ressource) {
		this.ressource = ressource;
	}
	public String getTypePanne() {
		return typePanne;
	}
	public void setTypePanne(String typePanne) {
		this.typePanne = typePanne;
	}

	public double getFrequence() {
		return frequence;
	}
	public void setFrequence(double frequence) {
		this.frequence = frequence;
	}
	public Date getDatePanne() {
		return datePanne;
	}
	public void setDatePanne(Date datePanne) {
		this.datePanne = datePanne;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	@Override
	public String toString() {
		return "Panne [id=" + id + ", ressource=" + ressource + ", typePanne=" + typePanne + ", fournisseur="
				+ fournisseur + ", frequence=" + frequence + ", datePanne=" + datePanne + ", description=" + description
				+ "]";
	}

	



	


}
