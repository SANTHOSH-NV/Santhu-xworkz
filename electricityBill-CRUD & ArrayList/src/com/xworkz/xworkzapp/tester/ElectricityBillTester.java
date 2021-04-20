package com.xworkz.xworkzapp.tester;

import java.awt.List;
import java.util.ArrayList;

import com.xworkz.xworkzapp.dto.ElectricityBillDTO;
import com.xworkz.xworkzapp.service.ElectricityBillService;
import com.xworkz.xworkzapp.service.ElectricityBillServiceImpl;

public class ElectricityBillTester {

	public static void main(String[] args) {

		ElectricityBillDTO dto = new ElectricityBillDTO("ELE1234", 12345, "Venkatesh", "RES", 300, 2);
		ElectricityBillDTO dto1 = new ElectricityBillDTO("ELE15634", 12995, "Santhosh", "RES", 700, 3);
		ElectricityBillDTO dto2 = new ElectricityBillDTO("ELE3334", 15545, "Appu", "RES", 500, 5);
		ElectricityBillDTO dto3 = new ElectricityBillDTO("ELE6634", 13345, "Darshan", "RES", 800, 4);
		
		
		ElectricityBillDTO dto4 = new ElectricityBillDTO("ELE6699", 13399, "Surya", "RES", 1800, 4);
		ElectricityBillDTO dto5 = new ElectricityBillDTO("ELE3322", 13789, "chethan", "RES", 2000, 5);
		ElectricityBillDTO dto6 = new ElectricityBillDTO("ELE1155", 13679, "ali", "RES", 700, 3);

		ElectricityBillService impl = new ElectricityBillServiceImpl();

		impl.validateAddDetails(dto);
		impl.validateAddDetails(dto1);
		impl.validateAddDetails(dto2);
		impl.validateAddDetails(dto3);

		//impl.validateDisplayDetails();

//		impl.validateUpdateCustomerNameUsingCustomerId(13345, "Theertha");
//
//		impl.validateDisplayDetails();
//
//		impl.validateDeleteDetails(dto3);
//		impl.validateDisplayDetails();
		
		
		
		ArrayList list2 = new ArrayList();
		
		list2.add(dto4);
		list2.add(dto5);
		list2.add(dto6);
		
		impl.validateNewDetails(list2);
		
		impl.validateDisplayDetails();
		
		
		
		
	}

}
