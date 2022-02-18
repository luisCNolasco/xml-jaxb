package com.xml.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "descripcion")
@XmlType(propOrder = { "orden" })
public class Paso {

	private String orden;
	private String descripcion;

	public Paso() {
	}

	@XmlAttribute(name = "orden")
	public String getOrden() {
		return orden;
	}

	@XmlValue
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}
}
