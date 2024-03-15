package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int ClientID;
	String name;
	
	
	public Client(int clientID, String name) {
		super();
		ClientID = clientID;
		this.name = name;
	}
	public int getClientID() {
		return ClientID;
	}
	public void setClientID(int clientID) {
		ClientID = clientID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
