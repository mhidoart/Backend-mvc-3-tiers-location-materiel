package com.ba.models;

import java.util.Date;

public class Panne {
private Ressource ressource;
private String typePanne;
private Proprietaire proprietaire;
private double frequence;
private Date datePanne;
private String description;
	public Panne() {
		// TODO Auto-generated constructor stub
	}
	public Panne(Ressource ressource, String typePanne, Proprietaire proprietaire, double frequence, Date datePanne,
			String description) {
		super();
		this.ressource = ressource;
		this.typePanne = typePanne;
		this.proprietaire = proprietaire;
		this.frequence = frequence;
		this.datePanne = datePanne;
		this.description = description;
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
	public Proprietaire getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
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
	@Override
	public String toString() {
		return "Panne [ressource=" + ressource + ", typePanne=" + typePanne + ", proprietaire=" + proprietaire
				+ ", frequence=" + frequence + ", datePanne=" + datePanne + ", description=" + description + "]";
	}
	

}
