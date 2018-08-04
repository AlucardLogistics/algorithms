package com.alucard.algorithms;

//--- Directions
//Given a string, return the character that is most
//commonly used in the string.
//--- Examples
//maxChar("abcccccccd") === "c"
//maxChar("apple 1231111") === "1"

public class MaxChars {
	
	static final int ASCII_SIZE = 256;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test1 = "abcccccdddddddccccccddd";
		String test2 = "a3333 asdwef 1";
		String test3 = "a3223 asd2wef 1w2we2";
		
		System.out.println("Most occured char: " + maxChar(test1));
		System.out.println("Most occured char: " + maxChar(test2));
		System.out.println("Most occured char: " + maxChar(test3));

	}
	
	private static char maxChar(String test) {
		int[] count = new int[ASCII_SIZE];
		
		int len = test.length();
		for(int i=0; i<len; i++) {
			count[test.charAt(i)]++;
		}
		
		int max = -1;
		char result = ' ';
		
		for(int i = 0; i < len; i++) {
			if(max < count[test.charAt(i)]) {
				max = count[test.charAt(i)];
				result = test.charAt(i);
			}
		}
		
		return result;
	}

}
