package com.ba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Affectation {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int id;
	private int id_user;
	private String category; 
	///si category pc alors id_product c'est un pc du table PC sinon si category=printer alors id_product est une imprimante
	private int  id_product;
	public Affectation(int id, int id_user, String category, int id_product) {
		super();
		this.id = id;
		this.id_user = id_user;
		this.category = category;
		this.id_product = id_product;
	}
	public Affectation(int id_user, String category, int id_product) {
		super();
		this.id_user = id_user;
		this.category = category;
		this.id_product = id_product;
	}
	public Affectation() {
		super();
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getId_product() {
		return id_product;
	}
	public void setId_product(int id_product) {
		this.id_product = id_product;
	}
	@Override
	public String toString() {
		return "Affectation [id=" + id + ", id_user=" + id_user + ", category=" + category + ", id_product=" + id_product
				+ "]";
	}


}
