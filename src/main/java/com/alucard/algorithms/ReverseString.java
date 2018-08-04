package com.alucard.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//--- Directions
//Given a string, return a new string with the reversed
//order of characters
//--- Examples
//reverse('apple') === 'leppa'
//reverse('hello') === 'olleh'
//reverse('Greetings!') === '!sgniteerG'

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String strings = "batmAn!";
		
		System.out.println("Original string: " + strings);
		//System.out.println(strings.length());
		System.out.println("Reversed string One: " + reverseAlgoOne(strings));
		System.out.println("Reversed string Two: " + reverseAlgoTwo(strings));
		System.out.println("Reversed string Three: " + reverseAlgoThree(strings));
		
		

	}
	
	private static String reverseAlgoOne(String str) {
		
		char[] chars = str.toCharArray();
		char[] reverse = new char[str.length()];
		int j = 0;
		for(int i = chars.length-1; i>=0; i--) {
			
			reverse[j] = chars[i];
			j++;
		}
		
		String reverseStr = new String(reverse);
		
		return reverseStr;
	}
	
	private static String reverseAlgoTwo(String str) {
		
		String reverse = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		return reverse;
        
	}
	
	private static String reverseAlgoThree(String str) {
		
		List<String> list = new ArrayList<String>(Arrays.asList(str.split("")));
		Collections.reverse(list);
		String reverse = "";
		for(String s : list) {
			reverse += s;
		}
		
		return reverse;
	}
}
