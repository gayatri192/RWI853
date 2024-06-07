package com.rwi.string;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStr {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        if(str1.length() == str2.length()) {

            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

                    
            boolean result = Arrays.equals(charArray1, charArray2);

            if(result) {
              System.out.println(str1 + " and " + str2 + " are anagram.");
            }
            else {
              System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
          }
          else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
          }

	}
      }