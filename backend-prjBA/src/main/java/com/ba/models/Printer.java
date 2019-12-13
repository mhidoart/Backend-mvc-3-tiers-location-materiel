package com.ba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Printer extends Ressource{

	private boolean color;
	private boolean scan;
	private String vitesse;
	
	public Printer(Integer id, int id_user, int id_dep, String marque, boolean color, boolean scan, String vitesse) {
		super(id, id_user, id_dep, marque);
		this.color = color;
		this.scan = scan;
		this.vitesse = vitesse;
	}

	public Printer() {
		// TODO Auto-generated constructor stub
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
		return "Printer [color=" + color + ", scan=" + scan + ", vitesse=" + vitesse + "]";
	}

	
	
}
