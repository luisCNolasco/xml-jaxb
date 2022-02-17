package com.xml.entities;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "menu")
public class Menu {

	private String fecha;
	private ArrayList<Comida> menu_almuerzo = new ArrayList<Comida>();

	public Menu() {
	}

	@XmlElementWrapper(name = "menu_almuerzo")
	@XmlElement(name = "comida")
	public ArrayList<Comida> getMenu_almuerzo() {
		return menu_almuerzo;
	}

	public void setMenu_almuerzo(ArrayList<Comida> menu_almuerzo) {
		this.menu_almuerzo = menu_almuerzo;
	}

	@XmlElement(name = "fecha")
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
