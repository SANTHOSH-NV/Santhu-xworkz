package com.xworkz.xworkzapp.custom;

public class InvalidElectricityMeterType extends RuntimeException {
	
	public InvalidElectricityMeterType(String type) {
		super(type);
	} 

}
