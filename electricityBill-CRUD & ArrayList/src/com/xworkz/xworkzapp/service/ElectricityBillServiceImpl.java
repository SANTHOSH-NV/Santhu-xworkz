package com.xworkz.xworkzapp.service;

import java.util.ArrayList;

import com.xworkz.xworkzapp.custom.InvalidAmount;
import com.xworkz.xworkzapp.custom.InvalidBillNumber;
import com.xworkz.xworkzapp.custom.InvalidCustomerId;
import com.xworkz.xworkzapp.custom.InvalidCustomerName;
import com.xworkz.xworkzapp.custom.InvalidElectricityMeterType;
import com.xworkz.xworkzapp.custom.InvalidKw;
import com.xworkz.xworkzapp.dao.ElectricityBillDAO;
import com.xworkz.xworkzapp.dao.ElectricityBillDAOImpl;
import com.xworkz.xworkzapp.dto.ElectricityBillDTO;

public class ElectricityBillServiceImpl implements ElectricityBillService {

	ElectricityBillDAO dao = new ElectricityBillDAOImpl();

	@Override
	public void validateAddDetails(ElectricityBillDTO dto) {
		try {
		if (dto.getCustomerName() == null || dto.getCustomerName().length() < 3) {
			throw new InvalidCustomerName("Invalid Customer Name");
		}
		if (dto.getCustomerId() == 0 || dto.getCustomerId() < 8) {
			throw new InvalidCustomerId("Invalid Customer Id");
		}
		if (dto.getBillNo() == null || !dto.getBillNo().startsWith("ELE")) {
			throw new InvalidBillNumber("Invalid  Bill Num");
		}
		if (dto.getType() == null || !dto.getType().startsWith("RES")) {
			throw new InvalidElectricityMeterType("Invalid Electricity Meter Type");
		}
		if (dto.getKw() == 0 || dto.getKw() > 6) {
			throw new InvalidKw("Invalid  Kilo Watts");
		}
		if (dto.getAmount() == 0 || dto.getAmount() < 200) {
			throw new InvalidAmount("Invalid Bill Amount");
		}
		}
		catch (InvalidCustomerName e) {
			System.out.println("Customer Name Exception Handled");
		}
		catch (InvalidCustomerId e) {
			System.out.println("Customer ID Exception Handled");
		}
		catch (InvalidBillNumber e) {
			System.out.println("Bill Number Exception Handled");
		}
		catch (InvalidElectricityMeterType e) {
			System.out.println("Electricity Meter Type Exception Handled");
		}
		catch (InvalidKw e) {
			System.out.println("KW Exception Handled");
		}
		catch (InvalidAmount e) {
			System.out.println("Amt Exception Handled");
		}
		

		dao.addDetails(dto);

	}

	@Override
	public void validateDisplayDetails() {
		dao.displayDetails();

	}

	@Override
	public void validateUpdateCustomerNameUsingCustomerId(int customerId, String customerName) {
		dao.updateCustomerNameUsingCustomerId(customerId, customerName);

	}

	@Override
	public void validateDeleteDetails(ElectricityBillDTO dto) {
		dao.deleteDetails(dto);

	}

	@Override
	public void validateNewDetails(ArrayList list) {
		dao.newDetails(list);
	}

}
