package com.encap;

public class Encapsulation {
	
	// Private fields
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) { // Simple validation
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }

	public static void main(String[] args) {
		// Creating an object of Person
        Encapsulation person = new Encapsulation();

        // Setting values using setter methods
        person.setName("Alice");
        person.setAge(25);

        // Getting values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Attempting to set an invalid age
        person.setAge(-5); // This will display an error message

        // Displaying the values again to show that invalid age was not set
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
	}


