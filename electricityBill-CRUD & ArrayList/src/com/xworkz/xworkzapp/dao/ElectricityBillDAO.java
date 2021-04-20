package com.xworkz.xworkzapp.dao;

import java.util.ArrayList;

import com.xworkz.xworkzapp.dto.ElectricityBillDTO;

public interface ElectricityBillDAO {

	public void addDetails(ElectricityBillDTO dto);

	public void displayDetails();

	public void updateCustomerNameUsingCustomerId(int customerId, String customerName);

	public void deleteDetails(ElectricityBillDTO dto);

	public void newDetails(ArrayList list);

}
