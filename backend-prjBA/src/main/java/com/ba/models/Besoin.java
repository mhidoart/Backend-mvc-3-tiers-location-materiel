package com.ba.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Besoin  implements Serializable{
	
	@Id @GeneratedValue
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	private Boolean flag;
	
	@ManyToOne
	@JoinColumn
	private User userBesoin;
	
	@ManyToOne
	@JoinColumn
	private DemandeOffre demandeOffre;

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

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public User getUserBesoin() {
		return userBesoin;
	}

	public void setUserBesoin(User user) {
		this.userBesoin = user;
	}

	
	public DemandeOffre getDemandeOffre() {
		return demandeOffre;
	}

	public void setDemandeOffre(DemandeOffre demandeOffre) {
		this.demandeOffre = demandeOffre;
	}

	public Besoin(Date date, Boolean flag, User user) {
		super();
		this.date = date;
		this.flag = flag;
		this.userBesoin = user;
	}

	public Besoin(Date date, Boolean flag) {
		super();
		this.date = date;
		this.flag = flag;
	}

	public Besoin(User user) {
		super();
		this.userBesoin = user;
	}

	
	public Besoin(Date date, Boolean flag, User userBesoin, DemandeOffre demandeOffre) {
		super();
		this.date = date;
		this.flag = flag;
		this.userBesoin = userBesoin;
		this.demandeOffre = demandeOffre;
	}

	
	@Override
	public String toString() {
		return "Besoin [id=" + id + ", date=" + date + ", flag=" + flag + ", user=" + userBesoin + "]";
	}

	public Besoin() {
		super();
	}
	
	
	
	
	

}
