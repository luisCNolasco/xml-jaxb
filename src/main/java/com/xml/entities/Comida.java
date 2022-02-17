package com.xml.entities;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "comida")
@XmlType(propOrder = {"nombre","precio","descripcion","calorias"})
public class Comida {

	private String nombre;
	private String precio;
	private String descripcion;
	private String calorias;
	
	public Comida() {
	}

	@XmlElement(name = "nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlElement(name = "precio")
	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	@XmlElement(name = "descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@XmlElement(name = "calorias")
	public String getCalorias() {
		return calorias;
	}

	public void setCalorias(String calorias) {
		this.calorias = calorias;
	}

	@Override
	public String toString() {
		return "Comida [nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + ", calorias="
				+ calorias + "]";
	}
	
	
}
