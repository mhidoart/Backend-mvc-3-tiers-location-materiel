package com.ba.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Constat implements Serializable{

	@Id @GeneratedValue
	private Integer id;
	@Temporal(TemporalType.DATE)
	private Date date;
	private String description;

	@OneToOne(mappedBy="constat",fetch=FetchType.LAZY)
	private Panne panne;
	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}



	public Panne getPanne() {
		return panne;
	}


	public void setPanne(Panne panne) {
		this.panne = panne;
	}


	public Constat() {
		// TODO Auto-generated constructor stub
	}

	public Constat(Date date, String description, Panne panne) {
		super();
		this.date = date;
		this.description = description;
		this.panne = panne;
	}
	
	


}
