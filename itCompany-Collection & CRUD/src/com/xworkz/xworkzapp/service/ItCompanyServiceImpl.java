package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dao.ItCompanyDAO;
import com.xworkz.xworkzapp.dao.ItCompanyDAOImpl;
import com.xworkz.xworkzapp.dto.ItCompanyDTO;

public class ItCompanyServiceImpl implements ItCompanyService {
	
	ItCompanyDAO dao=new ItCompanyDAOImpl();

	@Override
	public void validateAddDetails(ItCompanyDTO dto) {
		if(dto.getCompanyName()==null || dto.getCompanyName().length()<5) {
			System.out.println("invalid  Name");
		}

	}

	@Override
	public void validateRemoveDetails(ItCompanyDTO dto) {

	}

	@Override
	public void validateUpdateNoOfWorkersByCompanyName(int noOfWorkers, String companyName) {

	}

	@Override
	public void validateDisplayDetails() {

	}

}
