package com.rwi.thread;

class Demo1 implements Runnable{
	
	public void run(){
		for(int i = 0; i<=5; i++){
			System.out.println("Hey");
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
}
class Demo2 implements Runnable{
	
	public void run(){
		for(int i = 0; i<=5; i++){
			System.out.println("Hii");
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
}

public class RunnableInterface {

	public static void main(String[] args) {
		
		Runnable obj1 = new Demo1();
		Runnable obj2 = new Demo2();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();

	}

}
