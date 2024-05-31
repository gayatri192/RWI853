package com.rwi.singleInheritance;

public class DemoSingle {
	
	// Private fields
    private int a = 2;
    private int b = 3;

    // Public method to multiply a and b
    public int mul() {
        int c = a * b;
        return c;
    }
}
class Multiplication extends DemoSingle {
    // Method to display the multiplication result
    public void display() {
        int result = mul(); // Calls the inherited mul method
        System.out.println("Multiplication is: " + result);
    }
}

class Main {
    public static void main(String[] args) {
    	Multiplication obj = new Multiplication();
        obj.display();
    }
}