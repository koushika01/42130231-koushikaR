package com.objects;

class movie {
	String title;
	String director;
	String genre;
	int rating;

	movie(String title, String director, String genre,int rating) {
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.rating = rating;

	}

	void displayDetails() {
		System.out.println("TITLE:" + this.title);
		System.out.println("DIRECTOR:" + this.director);
		System.out.println("GENRE:" + this.genre);
		System.out.println("RATING:" + this.rating + "\n");

	}

	int updateRating(int star) {
		this.rating = star;
		return rating;
	}
}

public class Movie_management_system {

	public static void main(String[] args) {
	movie c1=new movie("blah blah","atlee","comedy",10);
    c1.displayDetails();
    c1.updateRating(6);
    c1.displayDetails();

	}

}
