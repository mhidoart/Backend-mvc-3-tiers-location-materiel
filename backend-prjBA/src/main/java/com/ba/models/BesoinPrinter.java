package com.ba.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BesoinPrinter {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private Date date;
	private int id_user;
	private boolean color;
	private boolean scan;
	private String vitesse;
	private boolean valide; //si valide=true alors le besoin  devien une demande d'offre
	public BesoinPrinter() {
		// TODO Auto-generated constructor stub
	}
	public BesoinPrinter(int id, Date date, int id_user, boolean color, boolean scan, String vitesse, boolean valide) {
		super();
		this.id = id;
		this.date = date;
		this.id_user = id_user;
		this.color = color;
		this.scan = scan;
		this.vitesse = vitesse;
		this.valide = valide;
	}
	public BesoinPrinter(Date date, int id_user, boolean color, boolean scan, String vitesse, boolean valide) {
		super();
		this.date = date;
		this.id_user = id_user;
		this.color = color;
		this.scan = scan;
		this.vitesse = vitesse;
		this.valide = valide;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public boolean isColor() {
		return color;
	}
	public void setColor(boolean color) {
		this.color = color;
	}
	public boolean isScan() {
		return scan;
	}
	public void setScan(boolean scan) {
		this.scan = scan;
	}
	public String getVitesse() {
		return vitesse;
	}
	public void setVitesse(String vitesse) {
		this.vitesse = vitesse;
	}
	public boolean isValide() {
		return valide;
	}
	public void setValide(boolean valide) {
		this.valide = valide;
	}
	@Override
	public String toString() {
		return "BesoinPrinter [id=" + id + ", date=" + date + ", id_user=" + id_user + ", color=" + color + ", scan="
				+ scan + ", vitesse=" + vitesse + ", valide=" + valide + "]";
	}
	

}
