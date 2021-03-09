package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.HospitalDTO;

public interface HospitalDAO {

	public void addDetails(HospitalDTO dto);

	public void displayDetails();

	public void updateDetails(String licenceNo, String founderName);
	
	public void deleteDetails(String licenceNo);
	
	public void displayDetailsUsigparam(String name, String founderName);
}
