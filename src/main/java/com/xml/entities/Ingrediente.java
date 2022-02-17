package com.xml.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ingrediente")
@XmlType(propOrder = {"nombre","cantidad"})
public class Ingrediente {

	private String nombre;
	private String cantidad;
	
	public Ingrediente() {
	}
	
	@XmlAttribute(name = "nombre")
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@XmlAttribute(name = "cantidad")
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
