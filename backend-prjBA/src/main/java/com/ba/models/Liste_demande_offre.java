package com.ba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Liste_demande_offre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int id_user;
	private boolean color;
	private boolean scan;
	private String vitesse;
	public Liste_demande_offre() {
		// TODO Auto-generated constructor stub
	}
	public Liste_demande_offre(int id, int id_user, boolean color, boolean scan, String vitesse) {
		super();
		this.id = id;
		this.id_user = id_user;
		this.color = color;
		this.scan = scan;
		this.vitesse = vitesse;
	}
	public Liste_demande_offre(int id_user, boolean color, boolean scan, String vitesse) {
		super();
		this.id_user = id_user;
		this.color = color;
		this.scan = scan;
		this.vitesse = vitesse;
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
	@Override
	public String toString() {
		return "Liste_demande_offre [id=" + id + ", id_user=" + id_user + ", color=" + color + ", scan=" + scan
				+ ", vitesse=" + vitesse + "]";
	}

}
