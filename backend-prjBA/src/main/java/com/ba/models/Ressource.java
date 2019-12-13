package com.ba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Ressource {

	@Id @GeneratedValue
	private Integer id;
	private String marque;
	public Ressource(Integer id, String marque) {
		super();
		this.id = id;
		this.marque = marque;
	}

	public Ressource() {
		// TODO Auto-generated constructor stub
	}

	public Ressource(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

}
