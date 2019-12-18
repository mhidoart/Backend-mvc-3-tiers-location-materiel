package com.ba.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BesoinPrinter extends Besoin implements Serializable {

	public BesoinPrinter() {
		// TODO Auto-generated constructor stub
	}

	private boolean color;
	private boolean scan;
	private String vitesse;

	
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

	
	public BesoinPrinter(Date date, Boolean flag, User user, boolean color, boolean scan, String vitesse) {
		super(date, flag, user);
		this.color = color;
		this.scan = scan;
		this.vitesse = vitesse;
	}

	public BesoinPrinter(Date date, Boolean flag) {
		super(date, flag);
		// TODO Auto-generated constructor stub
	}

	public BesoinPrinter(Date date, Boolean flag, User user) {
		super(date, flag, user);
		// TODO Auto-generated constructor stub
	}

	public BesoinPrinter(User user) {
		super(user);
		// TODO Auto-generated constructor stub
	}

	
	public BesoinPrinter(Date date, Boolean flag, User userBesoin, DemandeOffre demandeOffre) {
		super(date, flag, userBesoin, demandeOffre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BesoinPrinter [color=" + color + ", scan=" + scan + ", vitesse=" + vitesse + "]";
	}
	
	
	
	
	
	

}
