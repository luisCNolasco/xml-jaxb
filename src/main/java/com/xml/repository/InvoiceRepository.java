package com.xml.repository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.SchemaFactoryConfigurationError;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;

import com.xml.entities.ProccessOrderData1;
import com.xml.entitiesfac.Invoice;

public class InvoiceRepository {

	public static List<Invoice> listar() throws JAXBException {
		List<Invoice> lista = new ArrayList<Invoice>();
		JAXBContext contexto = JAXBContext.newInstance(Invoice.class);
		Unmarshaller unmarshaller = contexto.createUnmarshaller();

		Invoice pro = (Invoice) unmarshaller
				.unmarshal(new File("C:\\Users\\lcarranza\\Documents\\Documentos2\\documento1-prueba.xml"));
		// convertirAXML();

		lista.add(pro);
		crear();
		return lista;
	}
	
	static void crear() throws JAXBException {
		
		Invoice obj = new Invoice();
		obj.setUno("uno");
		obj.setDos("dos");
		obj.setTres("tres");
		
		JAXBContext contexto2 = JAXBContext.newInstance(Invoice.class);
		Marshaller marshaller = contexto2.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		marshaller.marshal(obj, System.out);
	}

}
