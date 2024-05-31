package com.rwi;

public class Person {
	
	String name;
	int age;
	String gender;
	
	public Person(String Name, int Age, String Gender){
		this.name = Name;
		this.age = Age;
		this.gender = Gender;
	}
	
	public void displayDetails(){
		System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
	}

	public static void main(String[] args) {
	
		// Creating objects of the Person class
		Person person1 = new Person("Sujal", 19, "Male");
		Person person2 = new Person("Gayatree", 23, "Female");
		
		System.out.println("Details of Person One :");
		person1.displayDetails();
		
		System.out.println();
		
		System.out.println("Details of Person Second :");
		person2.displayDetails();

	}

}
