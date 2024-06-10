package com.rwi.exceptionHandling;

public class DemoException {

	public static void main(String[] args) {
		
		int i = 10, j = 2, k = 0;
		int a[] = new int[5];
		
		try{
			
			k = i / j;
			for(int b = 0; b<=5;b++){
				a[b] = b + 1;
			}
			
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
