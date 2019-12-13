package com.ba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Ressource {

	@Id @GeneratedValue
	private Integer id;
	private int id_user;
	private int id_dep;

	private String marque;

	public Ressource(Integer id, int id_user, int id_dep, String marque) {
		super();
		this.id = id;
		this.id_user = id_user;
		this.id_dep = id_dep;
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

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public int getId_dep() {
		return id_dep;
	}

	public void setId_dep(int id_dep) {
		this.id_dep = id_dep;
	}

}
