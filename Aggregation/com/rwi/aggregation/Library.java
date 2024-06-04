package com.rwi.aggregation;

public class Library {
	
	private String name;
	private Book books;
	
	public Library(String name, Book books) {
		this.name = name;
		this.books = books;
	}
	
	public String getName(){
		return name;
	}
	
	public Book getBook(){
		return books;
	}
	
	public void displayDetails(){
		System.out.println("Library name = " +name + "\n" + "Books = " +books);
	}
	
}
