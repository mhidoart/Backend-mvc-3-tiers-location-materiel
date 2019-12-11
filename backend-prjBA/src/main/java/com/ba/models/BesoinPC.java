package com.ba.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BesoinPC {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int id_user;
	private Date date;
	private String cpu;
	private String ram;
	private String stockage;
	private boolean valide;
	public BesoinPC() {
		// TODO Auto-generated constructor stub
	}
	public BesoinPC(int id_user, Date date, String cpu, String ram, String stockage, boolean valide) {
		super();
		this.id_user = id_user;
		this.date = date;
		this.cpu = cpu;
		this.ram = ram;
		this.stockage = stockage;
		this.valide = valide;
	}
	public BesoinPC(int id, int id_user, Date date, String cpu, String ram, String stockage, boolean valide) {
		super();
		this.id = id;
		this.id_user = id_user;
		this.date = date;
		this.cpu = cpu;
		this.ram = ram;
		this.stockage = stockage;
		this.valide = valide;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isValide() {
		return valide;
	}
	public void setValide(boolean valide) {
		this.valide = valide;
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
		return "BesoinPC [id=" + id + ", id_user=" + id_user + ", cpu=" + cpu + ", ram=" + ram + ", stockage="
				+ stockage + "]";
	}


}
