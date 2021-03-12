package com.xworkz.xworkzapp.dto;

public class AmazonPrimeDTO {

	private String movieName;
	private String movieLength;
	private int noOfSongs;

	public AmazonPrimeDTO(String movieName, String movieLength, int noOfSongs) {
		super();
		this.movieName = movieName;
		this.movieLength = movieLength;
		this.noOfSongs = noOfSongs;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(String movieLength) {
		this.movieLength = movieLength;
	}

	public int getNoOfSongs() {
		return noOfSongs;
	}

	public void setNoOfSongs(int noOfSongs) {
		this.noOfSongs = noOfSongs;
	}

}
