package com.xml.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "tipo")
@XmlType(propOrder = "definicion")
public class Tipo {

	private String definicion;

	@XmlAttribute(name = "definicion")
	public String getDefinicion() {
		return definicion;
	}

	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}
}
