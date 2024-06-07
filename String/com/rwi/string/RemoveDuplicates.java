package com.rwi.string;

import java.util.Scanner;

public class RemoveDuplicates {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        String stringWithoutDuplicates = removeDuplicates(inputString);
	        System.out.println("String after removing duplicates: " + stringWithoutDuplicates);
	    }

	    public static String removeDuplicates(String str) {
	        String result = "";
	        
	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);
	            
	            // If the character is not already present in the result string, append it
	            if (result.indexOf(currentChar) == -1) {
	                result += currentChar;
	            }
	        }
	        
	        return result;
	    }
	}
