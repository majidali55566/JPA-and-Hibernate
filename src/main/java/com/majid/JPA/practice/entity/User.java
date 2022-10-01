package com.majid.JPA.practice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="user_table")
public class User {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String role;
	
	protected User() {
		
	}
	
	public User(String name, String role) {
		this.name = name;
		this.role = role;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	
	

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	
	
	
	
}
