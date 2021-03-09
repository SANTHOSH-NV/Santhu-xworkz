package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.HospitalDTO;

public class HospitalDAOImpl implements HospitalDAO {

	HospitalDTO dto[] = new HospitalDTO[3];
	int index = 0;

	@Override
	public void addDetails(HospitalDTO dto) {
		this.dto[index] = dto;
		System.out.println("Adding Hospital details");
		index++;
	}

	@Override
	public void displayDetails() {
		System.out.println("Inside display method");
		for (int i = 0; i < index; i++) {
			if (dto[i] != null) {
				System.out.println("Hospital Name :" + dto[i].getHospitalName());
				System.out.println("Hospital Licence Num :" + dto[i].getLicenceNo());
				System.out.println("Hospital  founder Name :" + dto[i].getFounderName());
				System.out.println("Hospital location :" + dto[i].getLocation());
				System.out.println("Hospital Specialization :" + dto[i].getSpecialization());
				System.out.println("Hospital phone Num :" + dto[i].getPhoneNo() + "\n");

			}
		}
	}

	@Override
	public void updateDetails(String licenceNo, String founderName) {
		System.out.println("inside update method");
		for (int i = 0; i < dto.length; i++) {
			if (dto[i].getLicenceNo().equals(licenceNo)) {
				System.out.println("licence Num found & updating");
				dto[i].setFounderName(founderName);

			} else
				System.out.println("Invalid Licence Num");
		}
	}

	@Override
	public void deleteDetails(String licenceNo) {
		System.out.println("inside delete method");
		for (int i = 0; i < dto.length; i++) {
			if (dto[i].getLicenceNo().equals(licenceNo)) {
				System.out.println("Licence num found & deleting");
				dto[i] = null;
			} else
				System.out.println("invalid licence num");

		}
	}

	@Override
	public void displayDetailsUsigparam(String name, String founderName) {
		System.out.println("display method usig parameter");
		for (int i = 0; i < index; i++) {
			if (dto[i].getHospitalName().equals(name) || dto[i].getFounderName().equals(founderName)) {
				System.out.println("Hospital Name :" + dto[i].getHospitalName());
				System.out.println("Hospital Licence Num :" + dto[i].getLicenceNo());
				System.out.println("Hospital  founder Name :" + dto[i].getFounderName());
				System.out.println("Hospital location :" + dto[i].getLocation());
				System.out.println("Hospital Specialization :" + dto[i].getSpecialization());
				System.out.println("Hospital phone Num :" + dto[i].getPhoneNo());
			} else
				System.out.println(" invalid input");
		}
	}
}
