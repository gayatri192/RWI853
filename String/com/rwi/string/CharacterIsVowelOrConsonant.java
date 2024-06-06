package com.rwi.string;

public class CharacterIsVowelOrConsonant {

	public static void main(String[] args) {
		
		char ch = 'a';
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
			
			System.out.print(ch + " is a Vowel ");
		}else{
			System.out.print(ch + "is a Consonant");
			
		}

	}

}
