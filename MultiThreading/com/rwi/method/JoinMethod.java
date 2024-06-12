package com.rwi.method;

public class JoinMethod extends Thread {

	public void run()
   	{
       		System.out.println("ABC");
       		try {
        		Thread.sleep(100);
    		}catch(InterruptedException ie){ }
       		System.out.println("XYZ");
  	}

	public static void main(String[] args) {
		JoinMethod t1=new JoinMethod();
		JoinMethod t2=new JoinMethod();
		t1.start();
		
		try{
  			t1.join();	//Waiting for t1 to finish
		}catch(InterruptedException ie){}
		
		t2.start();
		
	}

}
