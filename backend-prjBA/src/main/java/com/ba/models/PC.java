package com.ba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PC extends Ressource {
	
	private int id_user;
	private String cpu;
	private String ram;
	private String stockage;
	
	public PC(int id, int id_user, String cpu, String ram, String stockage,String marque) {
		super(id, marque);
		this.id_user = id_user;
		this.cpu = cpu;
		this.ram = ram;
		this.stockage = stockage;
	}
	public PC(int id_user, String cpu, String ram, String stockage,String marque) {
		super(-1, marque);
		this.id_user = id_user;
		this.cpu = cpu;
		this.ram = ram;
		this.stockage = stockage;
	}
	
	public PC(Integer id, String marque) {
		super(id, marque);
		// TODO Auto-generated constructor stub
	}

	public PC() {
		super();
	}
	public PC(PC pc) {
		super(pc.getId(),pc.getMarque());
		this.id_user = pc.id_user;
		this.cpu = pc.cpu;
		this.ram = pc.ram;
		this.stockage = pc.stockage;
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
	
	@Override
	public String toString() {
		return "PC [id=" + getId() + ", id_user=" + id_user + ", cpu=" + cpu + ", ram=" + ram + ", stockage=" + stockage
				+ "]";
	}
	
}
