package com.rwi.aggregation;

public class MainAggregation {

	public static void main(String[] args) {
		
		Book book1 = new Book("1980", "George");
		Book book2 = new Book("To kill a Mockingbird", "Harper Lee");
		
		Library library1 = new Library("City Library", book1);
		Library library2 = new Library("Novel Hub", book2);
		
		library1.displayDetails();
		library2.displayDetails();
		
	}

}
