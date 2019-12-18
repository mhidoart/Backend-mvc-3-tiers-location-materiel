package com.ba.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class DemandeOffre implements Serializable{
	
	@Id @GeneratedValue
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	private Boolean flag;
	
	
	@JsonIgnore
	@OneToMany(mappedBy="demandeOffre",fetch=FetchType.LAZY)
	private List<Besoin> besoins;
	
	@JsonIgnore
	@OneToMany(mappedBy="offreFournisseur",fetch=FetchType.LAZY)
	private List<Offre> offres;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public List<Besoin> getBesoins() {
		return besoins;
	}

	public void setBesoins(List<Besoin> besoins) {
		this.besoins = besoins;
	}

	public List<Offre> getOffres() {
		return offres;
	}

	public void setOffres(List<Offre> offres) {
		this.offres = offres;
	}

	public DemandeOffre(Date date, Boolean flag, List<Besoin> besoins, List<Offre> offres) {
		super();
		this.date = date;
		this.flag = flag;
		this.besoins = besoins;
		this.offres = offres;
	}

	public DemandeOffre() {
		super();
	}

	public DemandeOffre(Date date, List<Besoin> besoins, Boolean flag) {
		super();
		this.date = date;
		this.flag = flag;
		this.besoins = besoins;
	}
	public DemandeOffre(Date date, Boolean flag, List<Offre> offres) {
		super();
		this.date = date;
		this.flag = flag;
		this.offres = offres;
	}

	@Override
	public String toString() {
		return "DemandeOffre [id=" + id + ", date=" + date + ", flag=" + flag + ", besoins=" + besoins + ", offres="
				+ offres + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
	
	
	

}
