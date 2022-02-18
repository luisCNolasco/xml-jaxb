package com.xml.entities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "recetas")
public class Recetas {

	private ArrayList<Receta> recetas = new ArrayList<>();

	
	public ArrayList<Receta> getRecetas() {
		return recetas;
	}
	
	@XmlElement(name="receta")
	public void setRecetas(ArrayList<Receta> recetas) {
		this.recetas = recetas;
	}
	
}
