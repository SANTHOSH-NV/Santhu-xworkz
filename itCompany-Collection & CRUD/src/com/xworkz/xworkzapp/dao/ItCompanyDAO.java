package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.ItCompanyDTO;

public interface ItCompanyDAO {
	
	public void addDetails(ItCompanyDTO dto);
	
	public void removeDetails(ItCompanyDTO dto);

	public void updateNoOfWorkersByCompanyName(int noOfWorkers, String companyName);

	public void displayDetails();

	
	
	
	
	
}
