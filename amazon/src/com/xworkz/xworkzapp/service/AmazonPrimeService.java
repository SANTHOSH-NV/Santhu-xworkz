package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dto.AmazonPrimeDTO;

public interface AmazonPrimeService {
	
	
	public void validateLogIn(String userName, String password);
	
	public void validateAddMovies(AmazonPrimeDTO movies);
	
	public void validateDisplayMovies();
		
	public void validateViewSubscribers(String[] subscribers);

}
