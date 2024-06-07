package com.rwi.string;

import java.util.Scanner;

public class ReverseString {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        String reversedString = reverseString(inputString);
	        System.out.println("Reversed string: " + reversedString);
	    }

	    public static String reverseString(String str) {
	        char[] charArray = str.toCharArray();
	        int left = 0;
	        int right = charArray.length - 1;
	        
	        while (left < right) {
	            // Swap the characters
	            char temp = charArray[left];
	            charArray[left] = charArray[right];
	            charArray[right] = temp;
	            
	            left++;
	            right--;
	        }
	        
	        return new String(charArray);
	    }
	}