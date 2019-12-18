package com.ba.models;

import java.util.List;
import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Fournisseur extends User  {
	
	private String company;
	private String tel;
	
	@OneToMany(mappedBy="fournisseur",fetch=FetchType.LAZY)
	private List<Offre> offres;
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	
	public List<Offre> getOffres() {
		return offres;
	}

	public void setOffres(List<Offre> offres) {
		this.offres = offres;
	}
	
	
	
	public Fournisseur(Integer id, String nom, String prenom, String email, String pasword, String username,
			boolean enabled, List<Role> roles, String company, String tel, List<Offre> offres) {
		super(id, nom, prenom, email, pasword, username, enabled, roles);
		this.company = company;
		this.tel = tel;
		this.offres = offres;
	}

	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fournisseur(String nom, String prenom, String email, String pasword, String username, boolean enabled,
			List<Ressource> ressources, List<Role> roles) {
		super(nom, prenom, email, pasword, username, enabled, ressources, roles);
	}

	public Fournisseur(String nom, String prenom, String email, String pasword, String login) {
		super(nom, prenom, email, pasword, login);
		
	}
	
	public Fournisseur(String nom, String prenom, String email, String pasword, String username,
			boolean enabled, List<Role> roles, String company, String tel) {
		super(nom, prenom, email, pasword, username, enabled, roles);
		this.company = company;
		this.tel = tel;
	}
	
	public Fournisseur(String nom, String prenom, String email, String pasword, String login,String company, String tel) {
		super(nom, prenom, email, pasword, login);
		this.company = company;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Fournisseur [company=" + company + ", tel=" + tel + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
