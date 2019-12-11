package com.ba.models;

import java.util.Date;
import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Constat_List {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Date date;
	private int id_fournisseur;
	private Vector<Constat> list;
	public Constat_List(int id, Date date, int id_fournisseur, Vector<Constat> list) {
		super();
		this.id = id;
		this.date = date;
		this.id_fournisseur = id_fournisseur;
		this.list = list;
	}
	public Constat_List(Date date, int id_fournisseur, Vector<Constat> list) {
		super();
		this.date = date;
		this.id_fournisseur = id_fournisseur;
		this.list = list;
	}
	public void add(Constat constat) {
		list.add(constat);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getId_fournisseur() {
		return id_fournisseur;
	}
	public void setId_fournisseur(int id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}
	public Vector<Constat> getList() {
		return list;
	}
	public void setList(Vector<Constat> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Constat_List [id=" + id + ", date=" + date + ", id_fournisseur=" + id_fournisseur + ", list=" + list
				+ "]";
	}



}
