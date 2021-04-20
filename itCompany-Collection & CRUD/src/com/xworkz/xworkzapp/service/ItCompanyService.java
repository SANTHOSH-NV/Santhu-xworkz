package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dto.ItCompanyDTO;

public interface ItCompanyService {
	
    public void validateAddDetails(ItCompanyDTO dto);
	
	public void validateRemoveDetails(ItCompanyDTO dto);

	public void validateUpdateNoOfWorkersByCompanyName(int noOfWorkers, String companyName);

	public void validateDisplayDetails();

}
