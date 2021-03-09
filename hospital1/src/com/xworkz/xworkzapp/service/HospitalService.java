package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dto.HospitalDTO;

public interface HospitalService {

	public boolean checkAddingDetails(HospitalDTO dto);

	public void checkDisplayDetails();

	public void checkUpdatingDetails(String licenceNo, String founderName);
	
	public void checkDeleteDetails(String licenceNo);
	
	public void chekDisplayDetailsUsingParameter(String name,String founder );

}
