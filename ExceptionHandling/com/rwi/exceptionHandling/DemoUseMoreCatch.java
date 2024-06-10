package com.rwi.exceptionHandling;

public class DemoUseMoreCatch {

	public static void main(String[] args) {
		
		int i = 10, j = 2, k = 0;
		int a[] = new int[5];
		
		try{
			
			k = i / j;
			for(int b = 0; b<=5;b++){
				a[b] = b + 1;
			}
			for(int val : a){
				System.out.println(val);
			}
			
		}
		catch(ArithmeticException e){
			System.out.println("Cannot Divide By Zero" + e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Maximum number of values is 5" + e);
		}
		catch(Exception e){
			System.out.println("Unknown Exception");
			e.printStackTrace();
		}
		
	}

}
