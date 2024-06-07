package com.rwi.string;

import java.util.Scanner;

public class CountConsonantVowel {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        int[] counts = countVowelsAndConsonants(inputString);
	        System.out.println("Number of vowels in the string: " + counts[0]);
	        System.out.println("Number of consonants in the string: " + counts[1]);
	    }

	 public static int[] countVowelsAndConsonants(String str) {
	        int vowelCount = 0;
	        int consonantCount = 0;
	        str = str.toLowerCase();  // Convert the string to lowercase to handle both uppercase and lowercase letters

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch >= 'a' && ch <= 'z') {  
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowelCount++;
	                } else {
	                    consonantCount++;
	                }
	            }
	        }
	        return new int[] { vowelCount, consonantCount };
	    }
}
