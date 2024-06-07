package com.rwi.string;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
        
        String str1 = "Hello";
        
        System.out.println("The given string is: " + str1);
        
        
        for (int i = 0; i < str1.length(); i++) {
            
            boolean different = true;
            
            for (int j = 0; j < str1.length(); j++) {
               
                if (i != j && str1.charAt(i) == str1.charAt(j)) {
                    
                    different = false;
                    break;
                }
            }
            
            
            if (different) {
                System.out.println("The first non-repeated character in the String is: " + str1.charAt(i));
                break;
            }
        }
	}
}