package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.GarmentsDTO;

public interface GarmentsDAO {
	
	public void pushDetails(GarmentsDTO dto);
	
	public void removeDetails();
	
	public void display();

}
