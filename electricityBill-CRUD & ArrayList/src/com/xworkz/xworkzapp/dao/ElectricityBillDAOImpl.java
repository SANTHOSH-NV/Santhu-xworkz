package com.xworkz.xworkzapp.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.xworkzapp.dto.ElectricityBillDTO;

public class ElectricityBillDAOImpl implements ElectricityBillDAO {

	List list1 = new ArrayList();

	@Override
	public void addDetails(ElectricityBillDTO dto) {
		list1.add(dto);
		System.out.println("added Bill Details Successfully");

	}

	@Override
	public void displayDetails() {
		Iterator iterator = list1.iterator();
		while (iterator.hasNext()) {
			ElectricityBillDTO dto = (ElectricityBillDTO) iterator.next();
			System.out.println("*************************************************************************");
			System.out.println("Electricity Bill Details; CustomerName: " + dto.getCustomerName());
			System.out.println("CustomerId: " + dto.getCustomerId());
			System.out.println("BillNo: " + dto.getBillNo());
			System.out.println("Type: " + dto.getType());
			System.out.println("KW: " + dto.getKw());
			System.out.println("BillAmount: " + dto.getAmount());
			System.out.println("*************************************************************************");

		}

	}

	@Override
	public void updateCustomerNameUsingCustomerId(int customerId, String customerName) {
		Iterator iterator = list1.iterator();
		while (iterator.hasNext()) {
			ElectricityBillDTO ele = (ElectricityBillDTO) iterator.next();
			if (ele.getCustomerId() == customerId) {
				ele.setCustomerName(customerName);
			}

		}

	}

	@Override
	public void deleteDetails(ElectricityBillDTO dto) {
		list1.remove(dto);
		System.out.println("Removed Bill Details Successfully");

	}
	
	

	@Override
	public void newDetails(ArrayList list2) {
		list1.addAll(list2);
		
	}
	
	
}
