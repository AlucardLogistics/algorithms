package com.alucard.algorithms;
//--- Directions
//Write a function that returns the number of vowels
//used in a string.  Vowels are the characters 'a', 'e'
//'i', 'o', and 'u'.
//--- Examples
//vowels('Hi There!') --> 3
//vowels('Why do you ask?') --> 4
//vowels('Why?') --> 0

public class Vowels {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hi There!";
		String str2 = "Why dO you ask?";
		String str3 = "Why?";
		
		System.out.println("No. of vowels: " + countVowelsOne(str1));
		System.out.println("No. of vowels: " + countVowelsTwo(str2));
		System.out.println("No. of vowels: " + countVowelsTwo(str3));
		
	}
	
	private static int countVowelsOne(String str) {
		
		int count = 0;
		
		for(int i = 0; i<str.length(); i++) {
			if(str.toLowerCase().charAt(i) == 'a' || 
					str.toLowerCase().charAt(i) == 'e' || 
					str.toLowerCase().charAt(i) == 'i' || 
					str.toLowerCase().charAt(i) == 'o' || 
					str.toLowerCase().charAt(i) == 'u') {
				count++;
			}
		}
		
		return count;
	}
	
	private static int countVowelsTwo(String str) {
			
		char[] vowels = {'a', 'e', 'i', 'o', 'u',};
		str = str.toLowerCase();
		char[] letters = str.toCharArray();
		int count = 0;
		
		for(int i = 0; i<letters.length; i++) {
			for(int j=0; j<vowels.length; j++) {
				if(letters[i] == vowels[j]) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	

}
