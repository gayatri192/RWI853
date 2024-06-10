package com.rwi.exceptionHandling;

public class ThrowAndThrows {
	static void evenodd (int a) throws ArithmeticException{
		if (a%2==0){
			throw new ArithmeticException("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
	public static void main(String[] args){
		evenodd(9);
		
	}

}