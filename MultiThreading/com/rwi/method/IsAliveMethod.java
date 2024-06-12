package com.rwi.method;

public class IsAliveMethod extends Thread{
	
	public void run()
   	{
       		System.out.println("ABC");
       		try {
        		Thread.sleep(100);
    		}catch(InterruptedException ie){ }
       		System.out.println("XYZ");
  	}

	public static void main(String[] args) {
		IsAliveMethod t1=new IsAliveMethod();
		IsAliveMethod t2=new IsAliveMethod();
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}

}
