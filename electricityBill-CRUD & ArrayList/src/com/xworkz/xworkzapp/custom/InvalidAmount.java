package com.xworkz.xworkzapp.custom;

public class InvalidAmount extends RuntimeException {
	
	public InvalidAmount(String amt) {
		super(amt);
	}

}
