package com.rwi.composition;

public class MainComposition {

	public static void main(String[] args) {
		Engine engine = new Engine("A1");
        Car car = new Car(engine);
        
        Wheel wheel1 = new Wheel(18);
        Wheel wheel2 = new Wheel(18);
        Wheel wheel3 = new Wheel(18);
        Wheel wheel4 = new Wheel(18);
        
        car.addWheel(wheel1);
        car.addWheel(wheel2);
        car.addWheel(wheel3);
        car.addWheel(wheel4);
        
        System.out.println("Car details:");
        System.out.println("Engine: " + car.getEngine());
        System.out.println("Wheels: ");
        for (Wheel wheel : car.getWheels()) {
            System.out.println(wheel);

	}

}
}
