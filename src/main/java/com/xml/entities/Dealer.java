package com.xml.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Dealer")
@XmlType(propOrder = { "number", "country", "party", "name", "address" })
public class Dealer {

	private String number;
	private String country;
	private String party;
	private String name;
	private Address address;

	
	@XmlElement(name = "Dealer.Number")
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@XmlElement(name = "Dealer.CountryCode")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@XmlElement(name = "Dealer.PartyId")
	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	@XmlElement(name = "Dealer.Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "Address")
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
