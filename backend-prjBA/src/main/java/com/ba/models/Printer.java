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
	
	
	
	public Printer() {
		super();
	}

	public Printer(String marque) {
		super(marque);
		
	}
	
	public Printer(String marque, User user) {
		super(marque, user);
	}

	public Printer(String marque, User user, boolean color, boolean scan, String vitesse) {
		super(marque, user);
		this.color = color;
		this.scan = scan;
		this.vitesse = vitesse;
	}

	public Printer(String marque, boolean color, boolean scan, String vitesse) {
		super(marque);
		this.color = color;
		this.scan = scan;
		this.vitesse = vitesse;
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
