package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Portfolio {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int PortfolioID;
	int ClientID;
	
	
	public Portfolio(int portfolioID, int clientID) {
		super();
		PortfolioID = portfolioID;
		ClientID = clientID;
	}
	public int getPortfolioID() {
		return PortfolioID;
	}
	public void setPortfolioID(int portfolioID) {
		PortfolioID = portfolioID;
	}
	public int getClientID() {
		return ClientID;
	}
	public void setClientID(int clientID) {
		ClientID = clientID;
	}
	
	
}
