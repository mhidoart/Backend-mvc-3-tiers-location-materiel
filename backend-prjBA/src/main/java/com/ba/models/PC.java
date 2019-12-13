package com.ba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PC extends Ressource {
	
	private String cpu;
	private String ram;
	private String stockage;
	
	
	
	public PC(Integer id, int id_user, int id_dep, String marque, String cpu, String ram, String stockage) {
		super(id, id_user, id_dep, marque);
		this.cpu = cpu;
		this.ram = ram;
		this.stockage = stockage;
	}



	public PC() {
		super();
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

	@Override
	public String toString() {
		return "PC [cpu=" + cpu + ", ram=" + ram + ", stockage=" + stockage + "]";
	}
	
	
	
}
