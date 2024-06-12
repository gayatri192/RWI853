package com.rwi.thread;

class A extends Thread {
	
	public void run(){
		for(int i = 0; i<=5; i++){
			System.out.println("Hey, Good Morning");
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread{
	public void run(){
		for(int i = 0; i<=5; i++){
			System.out.println("Hello, Good Evening");
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class ThreadSleepMethod {

	public static void main(String[] args) {
		
		A obj1 = new A();
		B obj2 = new B();
		
		obj1.start();
		try{
			Thread.sleep(2);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		obj2.start();

	}

}
