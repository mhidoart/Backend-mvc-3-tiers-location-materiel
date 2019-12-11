package com.ba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class FournisseurOffre_pc {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int id_user;
	private String cpu;
	private String ram;
	private String stockage;
	private double price;
	
	private boolean commande;// si commande = true alors l'offre devien une commande
	
	public FournisseurOffre_pc() {
		// TODO Auto-generated constructor stub
	}

	
	public FournisseurOffre_pc(int id, int id_user, String cpu, String ram, String stockage, double price,
			boolean commande) {
		super();
		this.id = id;
		this.id_user = id_user;
		this.cpu = cpu;
		this.ram = ram;
		this.stockage = stockage;
		this.price = price;
		this.commande = commande;
	}


	public boolean isCommande() {
		return commande;
	}


	public void setCommande(boolean commande) {
		this.commande = commande;
	}


	public FournisseurOffre_pc(int id_user, String cpu, String ram, String stockage, double price, boolean commande) {
		super();
		this.id_user = id_user;
		this.cpu = cpu;
		this.ram = ram;
		this.stockage = stockage;
		this.price = price;
		this.commande = commande;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getStockage() {
		return stockage;
	}

	public void setStockage(String stockage) {
		this.stockage = stockage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "FournisseurOffre_pc [id=" + id + ", id_user=" + id_user + ", cpu=" + cpu + ", ram=" + ram
				+ ", stockage=" + stockage + ", price=" + price + ", commande=" + commande + "]";
	}

	

}
