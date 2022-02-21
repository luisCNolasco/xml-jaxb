package com.xml.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "TransactionCriteria")
@XmlType(propOrder = {"transaction","user","action","parts"})
public class TransactionCriteria {

	private String transaction;
	private String user;
	private String action;
	private PartsOrWorkshop parts;
	
	@XmlElement(name = "TransactionTimestamp")
	public String getTransaction() {
		return transaction;
	}
	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}
	@XmlElement(name = "User")
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@XmlElement(name = "Action")
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	@XmlElement(name = "PartsOrWorkshop")
	public PartsOrWorkshop getParts() {
		return parts;
	}
	public void setParts(PartsOrWorkshop parts) {
		this.parts = parts;
	}
	
	
}








































