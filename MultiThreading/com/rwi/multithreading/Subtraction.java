package com.rwi.multithreading;
public class Subtraction extends Thread
{
	int x=80,y=20,z;
	public void run()
	{

		z=x-y;
		System.out.println(z);
	}
}
