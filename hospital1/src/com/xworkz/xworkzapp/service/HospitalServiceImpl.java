package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dao.HospitalDAOImpl;
import com.xworkz.xworkzapp.dto.HospitalDTO;

public class HospitalServiceImpl implements HospitalService {

	HospitalDAOImpl dao = new HospitalDAOImpl();

	@Override
	public boolean checkAddingDetails(HospitalDTO dto) {
		boolean check = true;
		if (dto.getLicenceNo() == null || dto.getLicenceNo().length() != 8) {
			System.out.println("Invalid licence Number");
			check = false;
			return check;
		}
		if (dto.getHospitalName() == null || dto.getHospitalName().length() < 6) {
			System.out.println("Invalid Hospital Name");
			check = false;
			return check;
		}
		if (dto.getLocation() == null || dto.getLocation().length() < 4) {
			System.out.println("Invalid Hospital Location");
			check = false;
			return check;
		}
		if (dto.getFounderName() == null || dto.getFounderName().length() < 4) {
			System.out.println("Invalid Founder Name");
			check = false;
			return check;
		}
		if (dto.getSpecialization() == null || dto.getSpecialization().length() < 7) {
			System.out.println("Invalid Specialization");
			check = false;
			return check;
		}
		if (dto.getPhoneNo() == null || dto.getPhoneNo().length() != 10) {
			System.out.println("Invalid phone Num");
			check = false;
			return check;
		}

		if (check) {

			dao.addDetails(dto);
			System.out.println("Added Successfully");

		}
		return check;
	}

	@Override
	public void checkDisplayDetails() {
		dao.displayDetails();
	}

	@Override
	public void checkUpdatingDetails(String licenceNo, String founderName) {
		if (licenceNo != null && founderName != null) {
			dao.updateDetails(licenceNo, founderName);
		}

	}

	@Override
	public void checkDeleteDetails(String licenceNo) {
		if (licenceNo != null) {
			dao.deleteDetails(licenceNo);

		}
	}

	@Override
	public void chekDisplayDetailsUsingParameter(String name, String founder) {
		if (name != null && founder != null) {
			dao.displayDetailsUsigparam(name, founder);
		}
	}
}
