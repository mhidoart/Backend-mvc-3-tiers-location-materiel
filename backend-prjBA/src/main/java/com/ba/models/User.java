package com.ba.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User extends Proprietaire {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String userName;
	private String password;
	private String email;
	private int id_dep;
	//les champ SBS
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int id, String userName, String password, String email, int id_dep) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.id_dep = id_dep;
	}
	public User(String userName, String password, String email, int id_dep) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.id_dep = id_dep;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId_dep() {
		return id_dep;
	}
	public void setId_dep(int id_dep) {
		this.id_dep = id_dep;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + ", id_dep="
				+ id_dep + "]";
	}




}
