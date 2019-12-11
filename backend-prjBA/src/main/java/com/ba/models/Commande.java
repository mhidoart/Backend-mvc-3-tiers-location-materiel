package com.ba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String category; // pc ou imprimant 
	private int id_offre; ///offre du fournisseur 

	private boolean valide; //si true alors on a recu le produit

	public Commande() {
		// TODO Auto-generated constructor stub
	}

	public Commande(int id, String category, int id_offre, boolean valide) {
		super();
		this.id = id;
		this.category = category;
		this.id_offre = id_offre;
		this.valide = valide;
	}

	public Commande(String category, int id_offre, boolean valide) {
		super();
		this.category = category;
		this.id_offre = id_offre;
		this.valide = valide;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getId_offre() {
		return id_offre;
	}

	public void setId_offre(int id_offre) {
		this.id_offre = id_offre;
	}

	public boolean isValide() {
		return valide;
	}

	public void setValide(boolean valide) {
		this.valide = valide;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", category=" + category + ", id_offre=" + id_offre + ", valide=" + valide + "]";
	}

}
