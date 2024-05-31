package com.rwi.compileTimePolymorphism;

public class DemoCompileTime {
	
	// Overloaded methods
    public void display() {
        System.out.println("Display with no arguments");
    }

    public void display(int a) {
        System.out.println("Display with one argument: " + a);
    }

    public void display(int a, int b) {
        System.out.println("Display with two arguments: " + a + ", " + b);
    }

    public static void main(String[] args) {
    	DemoCompileTime obj = new DemoCompileTime();

       // Calling overloaded methods
        obj.display();
        obj.display(10);
        obj.display(10, 20);
    }

}
