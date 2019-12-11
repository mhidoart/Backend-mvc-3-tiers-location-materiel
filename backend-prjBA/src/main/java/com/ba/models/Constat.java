package com.ba.models;

import java.util.Date;

public class Constat {
private Panne panne;
private Date date_constat;
private String description;

	public Constat() {
		// TODO Auto-generated constructor stub
	}

	public Constat(Panne panne, Date date_constat, String description) {
		super();
		this.panne = panne;
		this.date_constat = date_constat;
		this.description = description;
	}

	public Constat(Date date_constat, String description) {
		super();
		this.date_constat = date_constat;
		this.description = description;
	}

	public Panne getPanne() {
		return panne;
	}

	public void setPanne(Panne panne) {
		this.panne = panne;
	}

	public Date getDate_constat() {
		return date_constat;
	}

	public void setDate_constat(Date date_constat) {
		this.date_constat = date_constat;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Constat [panne=" + panne + ", date_constat=" + date_constat + ", description=" + description + "]";
	}

}
