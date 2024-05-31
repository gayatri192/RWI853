package com.overriding;

public class Cat extends Animal {
	
	@Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
	
	public static void main(String[] args) {
		Cat c = new Cat();
		c.makeSound();
		
	}

}
