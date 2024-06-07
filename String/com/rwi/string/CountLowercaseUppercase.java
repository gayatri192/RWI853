package com.rwi.string;

import java.util.Scanner;

public class CountLowercaseUppercase {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        
        int lowerCount = 0;
        int upperCount = 0;
        
        for (char ch : inputString.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowerCount++;
            } else if (Character.isUpperCase(ch)) {
                upperCount++;
            }
        }
        
        System.out.println("Number of lowercase letters: " + lowerCount);
        System.out.println("Number of uppercase letters: " + upperCount);
    }
}