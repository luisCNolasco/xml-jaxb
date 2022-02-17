package com.xml.entities;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "recetas")
public class Recetas {

	private ArrayList<Receta> recetas = new ArrayList<>();

	@XmlElement(name = "receta")
	public ArrayList<Receta> getRecetas() {
		return recetas;
	}

	public void setRecetas(ArrayList<Receta> recetas) {
		this.recetas = recetas;
	}
	
}
