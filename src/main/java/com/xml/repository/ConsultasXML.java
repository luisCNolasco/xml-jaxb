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

public class ConsultasXML {
	private static File directorio = new File("C:\\Users\\lcarranza\\Documents\\Documentos\\");
	private static String archivos[] = directorio.list();

	public static List<Menu> consultarFecha(String fecha) throws JAXBException{

		List<Menu> listaObjetos = listarMenu();
		List<Menu> filtrarObjetos=new ArrayList<>();
		Menu obj;
		for (int i = 0; i < listaObjetos.size(); i++) {
			obj = listaObjetos.get(i);

			if (LocalDate.parse(obj.getFecha()).isBefore(LocalDate.parse(fecha))) {
				filtrarObjetos.add(obj);
			}
		}
		return filtrarObjetos;
	}

	//Lee los archivos XML y devuelve el Lista en Objetos
	public static List<Menu> listarMenu() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Menu.class);
		List<Menu> listaMenu = new ArrayList<Menu>();

		for (String name : archivos) {
			Unmarshaller unmarshaller = context.createUnmarshaller();

			Menu menu = (Menu) unmarshaller.unmarshal(new File(directorio + "\\" + name));

			listaMenu.add(menu);
		}
		return listaMenu;
	}

}
