package com.rwi.runTimePolymorphism;

//Base class
	class Animal {
	    // Method to be overridden
	    public void makeSound() {
	        System.out.println("Some generic animal sound");
	    }
	}

	// Derived class
	class Dog extends Animal {
	    // Overriding the makeSound method
	    @Override
	    public void makeSound() {
	        System.out.println("Bark");
	    }
	}

	// Derived class
	class Cat extends Animal {
	    // Overriding the makeSound method
	    @Override
	    public void makeSound() {
	        System.out.println("Meow");
	    }
	}


public class DemoRunTime {
	public static void main(String[] args) {
		
	        // Creating objects of Animal, Dog, and Cat
	        Animal myDog = new Dog(); // Animal reference but Dog object
	        Animal myCat = new Cat(); // Animal reference but Cat object

	        // Calling the makeSound method on each object
	        myDog.makeSound(); // Calls the overridden method in Dog class
	        myCat.makeSound(); // Calls the overridden method in Cat class
	    }
	}



