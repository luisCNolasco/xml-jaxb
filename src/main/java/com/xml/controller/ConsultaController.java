package com.xml.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xml.entities.Menu;
import com.xml.entities.Recetas;
import com.xml.repository.ConsultasXML;
import com.xml.repository.ConsultasXMLReceta;

import javax.xml.bind.JAXBException;

@RestController
@RequestMapping("consulta")
public class ConsultaController {

	@GetMapping("/saludo")
	public String saludo() {
		return "Saludo";
	}

	@GetMapping("/fecha-consulta/{fecha}")
	public List<Menu> consultarPorFecha(@PathVariable("fecha") String fecha) throws JAXBException {

		List<Menu> listaObjetos = ConsultasXML.consultarFecha(fecha);
		
		return listaObjetos;

	}
	
	@GetMapping("/receta")
	public Recetas listarReceta() throws JAXBException {

		Recetas receta = (Recetas) ConsultasXMLReceta.listarReceta();
		
		return receta;

	}
}
