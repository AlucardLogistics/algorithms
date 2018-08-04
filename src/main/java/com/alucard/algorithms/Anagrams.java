package com.alucard.algorithms;

import java.util.Arrays;

//--- Directions
//Check to see if two provided strings are anagrams of each other.
//One string is an anagram of another if it uses the same characters
//in the same quantity. Only consider characters, not spaces
//or punctuation.  Consider capital letters to be the same as lower case
//--- Examples
//anagrams('rail safety', 'fairy tales') --> True
//anagrams('RAIL! SAFETY!', 'fairy tales') --> True
//anagrams('Hi there', 'Bye there') --> False

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOne = "rail safety";
		String strTwo = "fairy tales";
		String strThree = "Hi there";
		String strFour = "Bye there";
		
		System.out.println("isAnagram one and two: " + isAnagram(strOne, strTwo));
		System.out.println("isAnagram three and four: " + isAnagram(strThree, strFour));

	}
	
	private static boolean isAnagram(String one, String two) {
		
		
		if(one.length() == two.length()) {
			char[] arrOne = one.toLowerCase().toCharArray();
			char[] arrTwo = two.toLowerCase().toCharArray();
			
			Arrays.sort(arrOne);
			Arrays.sort(arrTwo);
			
			if(Arrays.equals(arrOne, arrTwo)) {				
				return true;
			} else {				
				return false;
			}
		} else {
			return false;
		}
		
	}

}
