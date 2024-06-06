package com.rwi.string;

public class StringMethod {
	
	public static void main(String[] args) {
		
		String str = "Hello Guys";
		System.out.println("Original String = " +str);
		
		int index1 = str.codePointAt(1);
		int index2 = str.charAt(6);
		
		System.out.println("The character at position 1 is " +index1);
		System.out.println("The character at position 6 is " +
	            (char)index2 + "\n");
		
		String str1 = "Hello";
	    String str2 = "World";
	    String str3 = "Hello World";
	    String str4 = "hello world";

	        // concat() method
	    String concatenatedString = str1.concat(" ").concat(str2);
	    System.out.println("Concatenated String: " + concatenatedString + "\n");

	        // equals() method
	    boolean isEqual = str3.equals(concatenatedString);
	    System.out.println("str3 equals concatenatedString: " + isEqual + "\n");

	        // split() method
	    String[] words = str3.split(" ");
	    System.out.println("Words in str3:");
	    for (String word : words) {
	    	System.out.println(word);
	    }

	        // length() method
	    int lengthOfStr3 = str3.length();
	    System.out.println("Length of str3: " + lengthOfStr3 + "\n");

	        // replace() method
	    String replacedString = str3.replace('o', 'a');
	    System.out.println("Replaced String: " + replacedString + "\n");

	        // compareTo() method
	    int comparisonResult = str3.compareTo(str4);
	    if (comparisonResult < 0) {
	            System.out.println("str3 is lexicographically less than str4");
	        } else if (comparisonResult > 0) {
	            System.out.println("str3 is lexicographically greater than str4");
	        } else {
	            System.out.println("str3 is lexicographically equal to str4");
	        }
	    }
	

}

