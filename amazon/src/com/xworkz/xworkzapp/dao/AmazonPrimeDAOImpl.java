package com.xworkz.xworkzapp.dao;

import com.xworkz.xworkzapp.dto.AmazonPrimeDTO;

public class AmazonPrimeDAOImpl implements AmazonPrimeDAO {

	AmazonPrimeDTO movies[] = new AmazonPrimeDTO[3];
	int index = 0;

	String[] subscribers = { "appu", "D-boss", "theertha", "shivu", "sathya" };

	@Override
	public void logIn(String userName, String password) {
		System.out.println("Inside logIn method");
		if (userName.equals(AmazonPrimeDAO.userName) && password.equals(AmazonPrimeDAO.password)) {
			System.out.println("LogIn Successfull");
			System.out.println("Welcome to AmazonPrimeVideo");
			// AmazonPrimeDAO.super.displayDate();

		} else
			System.out.println("Invalid Credentilas");
	}

	@Override
	public void displayDate() {
		System.out.println("today's date is :");
		AmazonPrimeDAO.super.displayDate();
	}

	@Override
	public void addMovies(AmazonPrimeDTO movies) {
		this.movies[index] = movies;
		System.out.println("Inside AddMovies method");
		index++;

	}

	@Override
	public void displayMovies() {
		System.out.println("Inside Display Method");
		for (int i = 0; i < movies.length; i++) {

			if (movies[i] != null) {
				System.out.println("Movie Name = " + movies[i].getMovieName());
				System.out.println("Movie length is = " + movies[i].getMovieLength());
				System.out.println("No of songs = " + movies[i].getNoOfSongs());
			}
		}
	}

	@Override
	public void viewSubscribers(String[] subscribers) {

		System.out.println("Subscribers are :");
		for (int i = 0; i < subscribers.length; i++) {
			System.out.println(subscribers[i] + " ");
		}
	}
}
