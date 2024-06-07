package com.rwi.string;

import java.util.Scanner;

public class CountOccurrenceCharStr {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        
        System.out.println("Enter a character to count: ");
        char characterToCount = scanner.next().charAt(0);
        
        int count = countCharacterOccurrence(inputString, characterToCount);
        System.out.println("The character '" + characterToCount + "' appears " + count + " times in the string.");
    }

    public static int countCharacterOccurrence(String str, char ch) {
        int count = 0;
        str = str.toLowerCase();  
        ch = Character.toLowerCase(ch);  

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}


/*
 ************Using StringBuilder***************
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        
        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
 * 
 * 
 
 */