package com.xworkz.xworkzapp.custom;

public class InvalidCustomerName extends RuntimeException {
	
	public InvalidCustomerName(String name) {
		super(name);
	}

}
