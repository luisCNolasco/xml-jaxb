package com.xml.repository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.xml.entities.DataArea;
import com.xml.entities.GDSArea;
import com.xml.entities.GDSEnv;
import com.xml.entities.Ingrediente;
import com.xml.entities.Paso;
import com.xml.entities.ProccessOrderData1;
import com.xml.entities.Process;
import com.xml.entities.Receta;
import com.xml.entities.Recetas;
import com.xml.entities.Tipo;

public class ConsultasXMLReceta {
	 private static String rutaArchivo = "C:\\Users\\lcarranza\\Documents\\Documentos2\\receta.xml";

	// Lee los archivos XML y devuelve el Lista en Objetos
	public static Recetas listarRecetas() throws JAXBException {
	
		JAXBContext contexto = JAXBContext.newInstance(Recetas.class);
		Unmarshaller unmarshaller = contexto.createUnmarshaller();

		Recetas receta = (Recetas) unmarshaller.unmarshal(new File(rutaArchivo));

		convertirAXML();
		
		return receta;

	}
	
	public static ProccessOrderData1 datos() throws JAXBException {
		
		JAXBContext contexto = JAXBContext.newInstance(ProccessOrderData1.class);
		Unmarshaller unmarshaller = contexto.createUnmarshaller();

		ProccessOrderData1 pro = (ProccessOrderData1) unmarshaller.unmarshal(new File("C:\\Users\\lcarranza\\Documents\\Documentos2\\prueba.xml"));
		//convertirAXML();
		con();
		return pro;

	}
	
	static void con() throws JAXBException {
		GDSEnv gdsEnv = new GDSEnv();
		gdsEnv.setRelease("3.5.2");
		gdsEnv.setTemplate("OrderDataPE.tpl");
		gdsEnv.setXsd("order.xsd");
		
		GDSArea gdsArea = new GDSArea();
		gdsArea.setGdsEnv(gdsEnv);
		
		Process process = new Process();
		process.setAcknowledge("Always");
		process.setConfirm("Always");
		
		DataArea dataArea = new DataArea();
		dataArea.setCompanyNumber("001");
		dataArea.setGdsArea(gdsArea);
		dataArea.setProcess(process);
		
		
		
		ProccessOrderData1 obj = new ProccessOrderData1();
		obj.setDataArea(dataArea);
		
		JAXBContext contexto2 = JAXBContext.newInstance(ProccessOrderData1.class);
		Marshaller marshaller = contexto2.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION, "Order Data 1.xsd");
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		marshaller.marshal(obj, System.out);
		
	}

	static void convertirAXML() throws JAXBException {
		ArrayList<Ingrediente> in = new ArrayList<>();
		Recetas obj = new Recetas();
		ArrayList<Paso> pasos = new ArrayList<>();
		ArrayList<Receta> rs = new ArrayList<>();

		Tipo t = new Tipo();
		t.setDefinicion("definicion");

		Paso p = new Paso();
		p.setOrden("1");
		p.setDescripcion("");

		Paso pp = new Paso();
		pp.setOrden("2");
		pp.setDescripcion("Mezclar el cola-cao ");

		pasos.add(p);
		pasos.add(p);
		pasos.add(p);
		pasos.add(pp);
		pasos.add(pp);
		pasos.add(pp);

		Ingrediente i = new Ingrediente();
		i.setNombre("nombre prueba");
		i.setCantidad("99");

		in.add(i);
		in.add(i);
		in.add(i);
		in.add(i);
		in.add(i);

		Receta r = new Receta();
		r.setTipo(t);
		r.setDificultad("dificultad");
		r.setNombre("nombre");
		r.setCalorias("calorias");
		r.setTiempo("tiempo");
		r.setElaboracion("elaboracion");
		r.setIngredientes(in);
		r.setPasos(pasos);

		rs.add(r);
		rs.add(r);
		
		obj.setRecetas(rs);

		JAXBContext contexto = JAXBContext.newInstance(Recetas.class);
		Marshaller marshaller = contexto.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		marshaller.marshal(obj, System.out);
	}
}








