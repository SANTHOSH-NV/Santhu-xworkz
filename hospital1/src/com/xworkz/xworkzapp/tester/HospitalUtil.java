package com.xworkz.xworkzapp.tester;

import com.xworkz.xworkzapp.dto.HospitalDTO;
import com.xworkz.xworkzapp.service.HospitalServiceImpl;

public class HospitalUtil {

	public static void main(String[] args) {

		HospitalDTO dto = new HospitalDTO("KIG12512", " People Tree ", "Bangalore", "Raghavendra", "MultiSpeciality",
				"9987654312");
		HospitalDTO dto1 = new HospitalDTO("RDI16712", "Kirloskar ", "Mysore", "Raghu", "Speciality", "9987654312");
		HospitalDTO dto2 = new HospitalDTO("ASF12512", " Sapthagiri  ", "Tumkur", "Ramanna", "MultiSpeciality",
				"9987654312");

		HospitalServiceImpl impl = new HospitalServiceImpl();
		impl.checkAddingDetails(dto);
		impl.checkAddingDetails(dto1);
		impl.checkAddingDetails(dto2);

		 impl.checkDisplayDetails();
//
//		impl.checkUpdatingDetails("KIG12512", "Theertha");
//		impl.checkDisplayDetails();
//		
//		impl.checkDeleteDetails("RDI16712");
//		impl.checkDisplayDetails();
		
		impl.chekDisplayDetailsUsingParameter("Kirloskar", "Raghu");
	
	}

}
