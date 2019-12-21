package com.ba.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BesoinPrinter extends Besoin implements Serializable {


	private boolean color;
	private String resolution;
	
	
	public BesoinPrinter(Date date, Boolean flag, User user, boolean color, String resolution) {
		super(date, flag, user);
		this.color = color;
		this.resolution = resolution;
	}

	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}


	public BesoinPrinter(Date date, Boolean flag) {
		super(date, flag);
		
	}

	public BesoinPrinter(Date date, Boolean flag, User user) {
		super(date, flag, user);
		
	}

	public BesoinPrinter(User user) {
		super(user);
		
	}
	
	public BesoinPrinter(Date date, Boolean flag, User userBesoin, DemandeOffre demandeOffre) {
		super(date, flag, userBesoin, demandeOffre);
		
	}

	
	
	
	
	
	
	

}
