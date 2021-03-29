package com.xworkz.xworkzapp.dto;

public class GarmentsDTO {

	private String garmentName;
	private String location;
	private int licenceNo;
	private int noOfWorkers;

	public GarmentsDTO(String garmentName, String location, int licenceNo, int noOfWorkers) {
		super();
		this.garmentName = garmentName;
		this.location = location;
		this.licenceNo = licenceNo;
		this.noOfWorkers = noOfWorkers;
	}

	public String getGarmentName() {
		return garmentName;
	}

	public void setGarmentName(String garmentName) {
		this.garmentName = garmentName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getLicenceNo() {
		return licenceNo;
	}

	public void setLicenceNo(int licenceNo) {
		this.licenceNo = licenceNo;
	}

	public int getNoOfWorkers() {
		return noOfWorkers;
	}

	public void setNoOfWorkers(int noOfWorkers) {
		this.noOfWorkers = noOfWorkers;
	}

}
