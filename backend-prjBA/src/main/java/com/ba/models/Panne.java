package com.ba.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Panne implements Serializable {
	
	@Id @GeneratedValue
	private Integer id;
	@Temporal(TemporalType.DATE)
	private Date datePanne;
	private String typePanne;
	private String frequence;
	private String description;
	
	@ManyToOne
	@JoinColumn
	private Ressource ressource;
	
	@OneToOne
	private Constat constat;

	

	public Constat getConstat() {
		return constat;
	}

	public void setConstat(Constat constat) {
		this.constat = constat;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDatePanne() {
		return datePanne;
	}

	public void setDatePanne(Date datePanne) {
		this.datePanne = datePanne;
	}

	public String getTypePanne() {
		return typePanne;
	}

	public void setTypePanne(String typePanne) {
		this.typePanne = typePanne;
	}

	public String getFrequence() {
		return frequence;
	}

	public void setFrequence(String frequence) {
		this.frequence = frequence;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Ressource getRessource() {
		return ressource;
	}

	public void setRessource(Ressource ressource) {
		this.ressource = ressource;
	}

	public Panne() {
		super();
	}

	public Panne(Date datePanne, String typePanne, String frequence, String description, Ressource ressource) {
		super();
		this.datePanne = datePanne;
		this.typePanne = typePanne;
		this.frequence = frequence;
		this.description = description;
		this.ressource = ressource;
	}

	public Panne(Date datePanne, String typePanne, String frequence, String description, Ressource ressource,
			Constat constat) {
		super();
		this.datePanne = datePanne;
		this.typePanne = typePanne;
		this.frequence = frequence;
		this.description = description;
		this.ressource = ressource;
		this.constat = constat;
	}

	

}
