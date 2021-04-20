package com.xworkz.xworkzapp.dto;

public class ItCompanyDTO {

	private String companyName;
	private String gstNo;
	private int companyId;
	private int noOfWorkers;
	private String location;

	public ItCompanyDTO(String companyName, String gstNo, int companyId, int noOfWorkers, String location) {
		super();
		this.companyName = companyName;
		this.gstNo = gstNo;
		this.companyId = companyId;
		this.noOfWorkers = noOfWorkers;
		this.location = location;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public int getNoOfWorkers() {
		return noOfWorkers;
	}

	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
