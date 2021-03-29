package com.xworkz.xworkzapp.dao;

import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.xworkzapp.dto.GarmentsDTO;

public class GarmentsDAOImpl implements GarmentsDAO {
	
	LinkedList<GarmentsDTO> list = new LinkedList<GarmentsDTO>();
	
	@Override
	public void pushDetails(GarmentsDTO dto) {
		list.push(dto);
		System.out.println("Added Successfully");
		
	}

	@Override
	public void removeDetails() {
		list.pop();
		System.out.println("Removed Successfully");

	}

	@Override
	public void display() {
		Iterator<GarmentsDTO> iterator = list.iterator();
		while (iterator.hasNext()) {
			GarmentsDTO garmentsDTO = (GarmentsDTO) iterator.next();
			System.out.println("###########################################################");
			System.out.println("Garments Details; Name: "+garmentsDTO.getGarmentName());
			System.out.println("Location: "+garmentsDTO.getLocation());
			System.out.println("Licence No: "+garmentsDTO.getLicenceNo());
			System.out.println("No Of Workers: "+garmentsDTO.getNoOfWorkers());
			System.out.println("###########################################################");

			
		}

	}

}
