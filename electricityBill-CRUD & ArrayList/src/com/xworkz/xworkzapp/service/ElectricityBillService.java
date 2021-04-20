package com.xworkz.xworkzapp.service;

import java.util.ArrayList;

import com.xworkz.xworkzapp.dto.ElectricityBillDTO;

public interface ElectricityBillService {
	
	public void validateAddDetails(ElectricityBillDTO dto);
	
	public void validateDisplayDetails();
	
	public void validateUpdateCustomerNameUsingCustomerId(int customerId,String customerName);
	
	public void validateDeleteDetails(ElectricityBillDTO dto);
	
	public void validateNewDetails(ArrayList list);

	
}
