package com.ba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PC extends Ressource{
	
	private String ram;
	private String cpu;
	private String stockage;
	
	
	
	public PC() {
		super();
	}

	public PC(String marque) {
		super(marque);
		
	}
	
	public PC(String marque, User user) {
		super(marque, user);
	}

	public PC(String marque, User user, String ram, String cpu, String stockage) {
		super(marque, user);
		this.ram = ram;
		this.cpu = cpu;
		this.stockage = stockage;
	}

	public PC(String marque, String ram, String cpu, String stockage) {
		super(marque);
		this.ram = ram;
		this.cpu = cpu;
		this.stockage = stockage;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getStockage() {
		return stockage;
	}

	public void setStockage(String stockage) {
		this.stockage = stockage;
	}

	

	

	
	

	
	
}
