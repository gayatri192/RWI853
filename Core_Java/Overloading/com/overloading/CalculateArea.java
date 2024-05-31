package com.overloading;

public class CalculateArea {
	
	double pi = 3.14;
	// Method to calculate the area of a circle
    public double calculateArea(double radius) {
        System.out.println("Calculating area of a circle with radius: " + radius);
        return pi * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        System.out.println("Calculating area of a rectangle with length: " + length + " and width: " + width);
        return length * width;
    }
    
    public static void main(String[] args) {
    	CalculateArea calculator = new CalculateArea();

        // Calculate area of a circle
        double circleArea = calculator.calculateArea(5.0);
        System.out.println("Area of circle: " + circleArea);

        // Calculate area of a rectangle
        double rectangleArea = calculator.calculateArea(5.0, 10.0);
        System.out.println("Area of rectangle: " + rectangleArea);
    }
}
