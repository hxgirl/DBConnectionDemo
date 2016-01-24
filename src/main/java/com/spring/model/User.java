package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	private long id;
	private String name;
	private String email;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	public User(long id) {
		super();
		this.id = id;
	}

	public User(String email, String name) {
		super();
		this.email = email;
		this.name = name;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
