package com.rwi.multithreading;
public class Addition extends Thread 
{
	int x=10,y=20,z;
	public void run()
	{
		z=x+y;
		System.out.println(z);
	}

}
