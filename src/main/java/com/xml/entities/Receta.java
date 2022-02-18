package com.xml.entities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "receta")
@XmlType(propOrder = { "tipo","dificultad", "nombre", "ingredientes", "calorias","pasos", "tiempo",
		"elaboracion" })
public class Receta {

	private Tipo tipo;
	private String dificultad;
	private String nombre;
	private ArrayList<Ingrediente> ingredientes;
	private String calorias;
	private String tiempo;
	private String elaboracion;
	private ArrayList<Paso> pasos;

	public Receta() {
	}

	@XmlElementWrapper(name = "pasos")
	@XmlElement(name = "paso")
	public ArrayList<Paso> getPasos() {
		return pasos;
	}

	public void setPasos(ArrayList<Paso> pasos) {
		this.pasos = pasos;
	}

	@XmlElement(name = "tipo")
	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	@XmlElement(name = "nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlElementWrapper(name = "ingredientes")
	@XmlElement(name = "ingrediente")
	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getCalorias() {
		return calorias;
	}

	public void setCalorias(String calorias) {
		this.calorias = calorias;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	public String getElaboracion() {
		return elaboracion;
	}

	public void setElaboracion(String elaboracion) {
		this.elaboracion = elaboracion;
	}

}
