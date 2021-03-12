package com.xworkz.xworkzapp.dao;

import java.util.Date;

import com.xworkz.xworkzapp.dto.AmazonPrimeDTO;

public interface AmazonPrimeDAO {
	

	static final String userName = "amazon11@gmail.com";
	static final String password = "Amazon@11";

	public void logIn(String userName, String password);

	default void displayDate() {
		System.out.println(new Date());
	}
	
	
	public void addMovies(AmazonPrimeDTO movies);
	
	public void displayMovies();
	
	public void viewSubscribers(String[] subscribers);
}