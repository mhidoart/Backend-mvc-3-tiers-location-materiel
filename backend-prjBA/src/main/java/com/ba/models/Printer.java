package com.ba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Printer extends Ressource{
	
	
	
	private int id_user;
	private boolean color;
	private boolean scan;
	private String vitesse;
	
	public Printer() {
		// TODO Auto-generated constructor stub
	}

	public Printer(int id_user, boolean color, boolean scan, String vitesse) {
		super();
		this.id_user = id_user;
		this.color = color;
		this.scan = scan;
		this.vitesse = vitesse;
	}

	
	public Printer(Integer id, String marque) {
		super(id,marque);
		
		// TODO Auto-generated constructor stub
	}



	public Printer(int id, int id_user, boolean color, boolean scan, String vitesse,String marque) {
		super(id, marque);

		this.id_user = id_user;
		this.color = color;
		this.scan = scan;
		this.vitesse = vitesse;
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
		return "Printer [id=" + getId() + ", id_user=" + id_user + ", color=" + color + ", scan=" + scan + ", vitesse="
				+ vitesse + "]";
	}
	
}
