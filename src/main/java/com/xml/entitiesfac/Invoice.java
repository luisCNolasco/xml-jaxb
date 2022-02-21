package com.xml.entitiesfac;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Invoice")
@XmlType(propOrder = {"uno","dos","tres"})
public class Invoice {

	private String uno;
	private String dos;
	private String tres;

	@XmlElement(name = "UBLVersionID",namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
	public String getUno() {
		return uno;
	}

	public void setUno(String uno) {
		this.uno = uno;
	}

	@XmlElement(name = "ID",namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
	public String getDos() {
		return dos;
	}

	public void setDos(String dos) {
		this.dos = dos;
	}

	@XmlElement(name = "IssueDate",namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
	public String getTres() {
		return tres;
	}

	public void setTres(String tres) {
		this.tres = tres;
	}

}
