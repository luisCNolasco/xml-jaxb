package com.xml.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "GDSEnv")
@XmlType(propOrder = {"gdsEnv","sourceSystem","dealer"})
public class GDSArea {

	private GDSEnv gdsEnv;
	private String sourceSystem;
	private Dealer dealer;
	
	public GDSArea() {
	}

	@XmlElement(name = "Dealer")
	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	@XmlElement(name = "GDSEnv")
	public GDSEnv getGdsEnv() {
		return gdsEnv;
	}

	public void setGdsEnv(GDSEnv gdsEnv) {
		this.gdsEnv = gdsEnv;
	}

	@XmlElement(name = "SourceSystem")
	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	
	
}
