package com.xml.repository;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.xml.entities.Comida;
import com.xml.entities.Menu;
import com.xml.entities.Recetas;

public class ConsultasXMLReceta {
	private static String rutaArchivo = "C:\\Users\\lcarranza\\Documents\\Documentos\\receta.xml";

	// Lee los archivos XML y devuelve el Lista en Objetos
	public static Recetas listarReceta() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Recetas.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		
		
		Recetas recetas = (Recetas) unmarshaller.unmarshal(new File(rutaArchivo));
		

		return recetas;
	}

}
