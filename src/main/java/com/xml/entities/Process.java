package com.xml.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Process")
@XmlType(propOrder = {"confirm","acknowledge"})
public class Process {

	private String confirm;
	private String acknowledge;
	
	public Process() {
	}

	@XmlAttribute(name = "confirm")
	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

	@XmlAttribute(name = "acknowledge")
	public String getAcknowledge() {
		return acknowledge;
	}

	public void setAcknowledge(String acknowledge) {
		this.acknowledge = acknowledge;
	}
	
	
}
