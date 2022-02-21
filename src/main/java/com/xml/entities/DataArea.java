package com.xml.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "DataArea")
@XmlType(propOrder = { "companyNumber", "process","gdsArea","criteria"})
public class DataArea {

	private String companyNumber;
	private Process process;
	private GDSArea gdsArea;
	private TransactionCriteria criteria;

	public DataArea() {
	}

	@XmlElement(name = "TransactionCriteria")
	public TransactionCriteria getCriteria() {
		return criteria;
	}

	public void setCriteria(TransactionCriteria criteria) {
		this.criteria = criteria;
	}

	@XmlElement(name = "CompanyNumber")
	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	@XmlElement(name = "Process")
	public Process getProcess() {
		return process;
	}

	public void setProcess(Process process) {
		this.process = process;
	}

	@XmlElement(name = "GDSArea")
	public GDSArea getGdsArea() {
		return gdsArea;
	}

	public void setGdsArea(GDSArea gdsArea) {
		this.gdsArea = gdsArea;
	}

}
