package com.rwi.string;

import java.util.Scanner;

public class RemoveLowercase {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        
        String stringWithoutLowercase = removeLowercase(inputString);
        System.out.println("String after removing lowercase letters: " + stringWithoutLowercase);
    }

    public static String removeLowercase(String str) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLowerCase(ch)) {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}