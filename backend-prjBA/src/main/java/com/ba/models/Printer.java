package com.ba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Printer extends Ressource{
	
	
	private String vitesse;
	private String resolution;
	
	
	public Printer() {
		super();
	}

	public Printer(String marque) {
		super(marque);
		
	}
	
	public Printer(String marque, User user) {
		super(marque, user);
	}

	public String getVitesse() {
		return vitesse;
	}
	
	public Printer(String marque, User user, Fournisseur fournisseur, String vitesse, String resolution) {
		super(marque, user, fournisseur);
		this.vitesse = vitesse;
		this.resolution = resolution;
	}
	
	public void setVitesse(String vitesse) {
		this.vitesse = vitesse;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	@Override
	public String toString() {
		return "Printer [vitesse=" + vitesse + ", resolution=" + resolution + "]";
	}
	
	
	
	

	
	
}
