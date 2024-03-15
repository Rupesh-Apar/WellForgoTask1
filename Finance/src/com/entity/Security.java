package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Security {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int SecurityID;
	String name;
	String Category;
	
	
	public Security(int securityID, String name, String category) {
		super();
		SecurityID = securityID;
		this.name = name;
		Category = category;
	}
	public int getSecurityID() {
		return SecurityID;
	}
	public void setSecurityID(int securityID) {
		SecurityID = securityID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	
	
}
