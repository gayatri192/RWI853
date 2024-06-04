package com.rwi.composition;

import java.util.ArrayList;
import java.util.List;

public class Car {
	
	private Engine engine;
	private List<Wheel> wheels;
	
	public Car(Engine engine) {
		this.engine = engine;
		this.wheels = new ArrayList<>();
	}
	
	public void addWheel(Wheel wheel){
		if(wheels.size() < 4){
			wheels.add(wheel);
		} else{
			System.out.println("Cannot add more wheels, the car already has 4 wheels");
		}
	}
	
	public Engine getEngine(){
		return engine;
	}
	
	public List<Wheel> getWheels(){
		return wheels;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", wheels=" + wheels + "]";
	}
	
	
	

}
