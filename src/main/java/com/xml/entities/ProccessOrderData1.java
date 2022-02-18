package com.xml.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "ProcessOrderData1")
public class ProccessOrderData1 {

	private DataArea dataArea;

	public ProccessOrderData1() {
	}

	@XmlElement(name = "DataArea")
	public DataArea getDataArea() {
		return dataArea;
	}

	public void setDataArea(DataArea dataArea) {
		this.dataArea = dataArea;
	}


}
