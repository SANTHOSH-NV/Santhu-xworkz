package com.xworkz.xworkzapp.dto;

public class HospitalDTO {

	private String licenceNo;
	private String hospitalName;
	private String location;
	private String founderName;
	private String specialization;
	private String phoneNo;

	public HospitalDTO(String licenceNo, String hospitalName, String location, String founderName,
			String specialization, String phoneNo) {
		super();
		this.licenceNo = licenceNo;
		this.hospitalName = hospitalName;
		this.location = location;
		this.founderName = founderName;
		this.specialization = specialization;
		this.phoneNo = phoneNo;
	}

	public String getLicenceNo() {
		return licenceNo;
	}

	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFounderName() {
		return founderName;
	}

	public void setFounderName(String founderName) {
		this.founderName = founderName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
