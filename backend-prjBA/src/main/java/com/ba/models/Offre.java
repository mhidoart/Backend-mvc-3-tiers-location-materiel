package com.ba.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Offre implements Serializable{

	@Id @GeneratedValue
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	private Boolean flag;
	
	@ManyToOne
	@JoinColumn
	private DemandeOffre offreFournisseur;
	
	@ManyToOne
	@JoinColumn
	private Fournisseur fournisseur;

	@OneToOne(mappedBy="offre",fetch=FetchType.LAZY)
	private Commande commande;
	
	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

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

	public DemandeOffre getOffreFournisseur() {
		return offreFournisseur;
	}

	public void setOffreFournisseur(DemandeOffre offreFournisseur) {
		this.offreFournisseur = offreFournisseur;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Offre(Date date, Boolean flag, DemandeOffre offreFournisseur, Fournisseur fournisseur) {
		super();
		this.date = date;
		this.flag = flag;
		this.offreFournisseur = offreFournisseur;
		this.fournisseur = fournisseur;
	}

	public Offre(Date date, Boolean flag, Fournisseur fournisseur) {
		super();
		this.date = date;
		this.flag = flag;
		this.fournisseur = fournisseur;
	}

	public Offre() {
		super();
	}

	public Offre(Date date, Boolean flag, DemandeOffre offreFournisseur, Fournisseur fournisseur, Commande commande) {
		super();
		this.date = date;
		this.flag = flag;
		this.offreFournisseur = offreFournisseur;
		this.fournisseur = fournisseur;
		this.commande = commande;
	}

	
	
	
	
	
	
}
