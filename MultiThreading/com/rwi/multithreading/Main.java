package com.rwi.multithreading;
public class Main {

	public static void main(String[] args) {
		
		
		Addition ad=new Addition();
		Subtraction sb=new Subtraction();
		ad.start();
		sb.start();

	}

}
