package com.xworkz.xworkzapp.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.xworkzapp.dto.ItCompanyDTO;

public class ItCompanyDAOImpl implements ItCompanyDAO {

	List list = new ArrayList();

	@Override
	public void addDetails(ItCompanyDTO dto) {
		list.add(dto);
		System.out.println("Added It Company Details Successfully");
	}

	@Override
	public void removeDetails(ItCompanyDTO dto) {
		list.remove(dto);
		System.out.println("Removed It Company Details Successfully");

	}

	@Override
	public void updateNoOfWorkersByCompanyName(int noOfWorkers, String companyName) {
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			ItCompanyDTO com = (ItCompanyDTO) iterator.next();
			if (com.getCompanyName().equals(companyName)) {
				com.setNoOfWorkers(noOfWorkers);
			}

		}
	}

	@Override
	public void displayDetails() {
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			ItCompanyDTO com = (ItCompanyDTO) iterator.next();
			System.out.println("IT Company Details; Name : " + com.getCompanyName());
			System.out.println("GST No : " + com.getGstNo());
			System.out.println("Location : " + com.getLocation());
			System.out.println("Id : " + com.getCompanyId());
			System.out.println("No Of Workers : " + com.getNoOfWorkers());

		}
	}

}
