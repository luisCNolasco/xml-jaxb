package com.xml.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Address")
@XmlType(propOrder = { "ad1", "ad2", "ad3", "ad4", "postal" })
public class Address {

	private String ad1;
	private String ad2;
	private String ad3;
	private String ad4;
	private String postal;

	public Address() {
	}

	@XmlElement(name = "Dealer.Address1")
	public String getAd1() {
		return ad1;
	}

	public void setAd1(String ad1) {
		this.ad1 = ad1;
	}

	@XmlElement(name = "Dealer.Address2")
	public String getAd2() {
		return ad2;
	}

	public void setAd2(String ad2) {
		this.ad2 = ad2;
	}

	@XmlElement(name = "Dealer.Address3")
	public String getAd3() {
		return ad3;
	}

	public void setAd3(String ad3) {
		this.ad3 = ad3;
	}

	@XmlElement(name = "Dealer.Address4")
	public String getAd4() {
		return ad4;
	}

	public void setAd4(String ad4) {
		this.ad4 = ad4;
	}

	@XmlElement(name = "Dealer.PostalCode")
	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

}
