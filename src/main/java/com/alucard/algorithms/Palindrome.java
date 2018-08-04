package com.alucard.algorithms;

//--- Directions
//Given a string, return true if the string is a palindrome
//or false if it is not.  Palindromes are strings that
//form the same word if it is reversed. *Do* include spaces
//and punctuation in determining if the string is a palindrome.
//--- Examples:
//palindrome("abba") === true
//palindrome("abcdefg") === false

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "abba";
		String test1 = "abcdefg";
		
		System.out.println("Palindrome test = 'abba' is: " + palindrome(test));
		System.out.println("Palindrome test1 = 'abcdefg' is: " + palindrome(test1));

	}
	
	
	private static boolean palindrome(String str) {
		
	//reverse the string argument
	String reverse = "";	
	for(int i = str.length()-1; i>=0; i--) {
		reverse = reverse + str.charAt(i);
	}
		//check if is palindrome
		if(str.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}



}
