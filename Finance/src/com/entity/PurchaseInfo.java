package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurchaseInfo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int PurchaseID;
	int SecurityID;
	int PurchaseDate;
	double PurchasePrice;
	
	
	public PurchaseInfo(int purchaseID, int securityID, int purchaseDate, double purchasePrice) {
		super();
		PurchaseID = purchaseID;
		SecurityID = securityID;
		PurchaseDate = purchaseDate;
		PurchasePrice = purchasePrice;
	}
	public int getPurchaseID() {
		return PurchaseID;
	}
	public void setPurchaseID(int purchaseID) {
		PurchaseID = purchaseID;
	}
	public int getSecurityID() {
		return SecurityID;
	}
	public void setSecurityID(int securityID) {
		SecurityID = securityID;
	}
	public int getPurchaseDate() {
		return PurchaseDate;
	}
	public void setPurchaseDate(int purchaseDate) {
		PurchaseDate = purchaseDate;
	}
	public double getPurchasePrice() {
		return PurchasePrice;
	}
	public void setPurchasePrice(double purchasePrice) {
		PurchasePrice = purchasePrice;
	}
	
	
}
