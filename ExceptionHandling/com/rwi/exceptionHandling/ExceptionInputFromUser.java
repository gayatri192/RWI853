package com.rwi.exceptionHandling;

import java.util.Scanner;

public class ExceptionInputFromUser {

	public static void main(String[] args) {
		
		int a , b , c = 0;
		Scanner sc = new Scanner(System.in);
		
		try{
			a = Integer.parseInt(sc.nextLine());
			b = Integer.parseInt(sc.nextLine());
			c = a / b;
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		finally{
			System.out.println(c);
			System.out.println("Exit");
		}
		
	}

}
