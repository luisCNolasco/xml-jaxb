package com.xml.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "GDSEnv")
@XmlType(propOrder = {"release","template","xsd"})
public class GDSEnv {
	private String release;
	private String template;
	private String xsd;
	
	public GDSEnv() {
	}

	@XmlAttribute(name = "release")
	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	@XmlAttribute(name = "template")
	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	@XmlAttribute(name = "xsd")
	public String getXsd() {
		return xsd;
	}

	public void setXsd(String xsd) {
		this.xsd = xsd;
	}
	
	
}
