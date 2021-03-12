package com.xworkz.xworkzapp.tester;

import com.xworkz.xworkzapp.dao.AmazonPrimeDAO;
import com.xworkz.xworkzapp.dao.AmazonPrimeDAOImpl;
import com.xworkz.xworkzapp.dto.AmazonPrimeDTO;
import com.xworkz.xworkzapp.service.AmazonPrimeServiceImpl;

public class AmazonPrimeUtil {
	public static void main(String[] args) {

		AmazonPrimeDTO movies = new AmazonPrimeDTO("A", "2:30 min", 5);
		AmazonPrimeDTO movies1 = new AmazonPrimeDTO("Bahubali", " 3 hrs", 4);
		AmazonPrimeDTO movies2 = new AmazonPrimeDTO("Robert", "2:45 min", 4);
		String[] subscribers = { "appu", "D-boss", "theertha", "shivu", "sathya" };

		AmazonPrimeServiceImpl impl = new AmazonPrimeServiceImpl();
		impl.validateLogIn("amazon11@gmail.com", "Amazon@11");

		impl.validateAddMovies(movies);
		impl.validateAddMovies(movies1);
		impl.validateAddMovies(movies2);

		
			//impl.validateDisplayMovies();
			
			impl.validateViewSubscribers(subscribers);
	}
}
