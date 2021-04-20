package com.xworkz.xworkzapp.custom;

public class InvalidBillNumber extends RuntimeException {
	
	public InvalidBillNumber(String num) {
		super(num);
	}

}
