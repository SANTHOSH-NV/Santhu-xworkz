package com.xworkz.xworkzapp.service;

import com.xworkz.xworkzapp.dao.AmazonPrimeDAO;
import com.xworkz.xworkzapp.dao.AmazonPrimeDAOImpl;
import com.xworkz.xworkzapp.dto.AmazonPrimeDTO;

public class AmazonPrimeServiceImpl implements AmazonPrimeService {

	AmazonPrimeDAO dao = new AmazonPrimeDAOImpl();

	@Override
	public void validateLogIn(String userName, String password) {
		if (userName != null && userName.contains("@") && userName.contains(".com") && password.length() >= 6) {
			dao.logIn(userName, password);
			System.out.println("userName is : " + AmazonPrimeDAO.userName);
			System.out.println("password is :" + AmazonPrimeDAO.password);
			dao.displayDate();
		} else
			System.out.println("Enter Valid Credentials");

	}

	@Override
	public void validateAddMovies(AmazonPrimeDTO movies) {
		if (movies != null) {

			dao.addMovies(movies);

			System.out.println("Added movies Successfully");
		}
	}

	@Override
	public void validateDisplayMovies() {
		dao.displayMovies();
	}

	@Override
	public void validateViewSubscribers(String[] subscribers) {
		if (subscribers != null) {
			dao.viewSubscribers(subscribers);
		}
	}

}
