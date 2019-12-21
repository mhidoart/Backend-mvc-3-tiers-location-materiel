package com.ba.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BesoinPC extends Besoin implements Serializable {
	public BesoinPC() {
		// TODO Auto-generated constructor stub
	}
	public BesoinPC(Date date, Boolean flag) {
		super(date, flag);
		// TODO Auto-generated constructor stub
	}
	private String cpu;
	private String ram;
	private String stockage;
	private String hardDiskTech;
	
	
	
	public String getHardDiskTech() {
		return hardDiskTech;
	}
	public void setHardDiskTech(String hardDiskTech) {
		this.hardDiskTech = hardDiskTech;
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
	
	
	public BesoinPC(Date date, Boolean flag, User user, String cpu, String ram, String stockage) {
		super(date, flag, user);
		this.cpu = cpu;
		this.ram = ram;
		this.stockage = stockage;
	}
	public BesoinPC(Date date, Boolean flag, User user) {
		super(date, flag, user);
		// TODO Auto-generated constructor stub
	}
	public BesoinPC(User user) {
		super(user);
		// TODO Auto-generated constructor stub
	}
	
	public BesoinPC(Date date, Boolean flag, User userBesoin, DemandeOffre demandeOffre) {
		super(date, flag, userBesoin, demandeOffre);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BesoinPC [cpu=" + cpu + ", ram=" + ram + ", stockage=" + stockage + "]";
	}
	public BesoinPC(Date date, Boolean flag, User user, String cpu, String ram, String stockage, String hardDiskTech) {
		super(date, flag, user);
		this.cpu = cpu;
		this.ram = ram;
		this.stockage = stockage;
		this.hardDiskTech = hardDiskTech;
	}
	


}
