package com.rwi.hierarchical;

public class Main {
	
	 public static void main(String[] args) {
	        // Creating objects of Circle and Rectangle
	        Circle circle = new Circle();
	        Rectangle rectangle = new Rectangle();

	        // Calling methods
	        circle.draw(); // Inherited method from Shape
	        circle.drawCircle(); // Method from Circle

	        rectangle.draw(); // Inherited method from Shape
	        rectangle.drawRectangle(); // Method from Rectangle
	    }

}
