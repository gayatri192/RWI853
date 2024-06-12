package com.rwi.thread;

public class SimpleThread extends Thread {
	
	public void run(){
		for(int i = 0; i<=5; i++){
			System.out.println("Hey, Good Morning");
		}
	}
}

class Simple extends Thread{
	public void run(){
		for(int i = 0; i<=5; i++){
			System.out.println("Hello, Good Evening");
		}
	}
}

class Demo{
	
	public static void main(String[] args) {
		
		SimpleThread obj1 = new SimpleThread();
		Simple obj2 = new Simple();
		
		obj1.start();
		obj2.start();

	}
	
}
	


