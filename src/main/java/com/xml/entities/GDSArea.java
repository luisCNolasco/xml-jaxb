package com.xml.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GDSEnv")
public class GDSArea {

	private GDSEnv gdsEnv;
	
	public GDSArea() {
	}

	@XmlElement(name = "GDSEnv")
	public GDSEnv getGdsEnv() {
		return gdsEnv;
	}

	public void setGdsEnv(GDSEnv gdsEnv) {
		this.gdsEnv = gdsEnv;
	}
	
	
}
