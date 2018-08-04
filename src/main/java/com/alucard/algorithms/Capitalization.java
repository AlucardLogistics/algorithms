package com.alucard.algorithms;
//--- Directions
//Write a function that accepts a string.  The function should
//capitalize the first letter of each word in the string then
//return the capitalized string.
//--- Examples
//capitalize('a short sentence') --> 'A Short Sentence'
//capitalize('a lazy fox') --> 'A Lazy Fox'
//capitalize('look, it is working!') --> 'Look, It Is Working!'

public class Capitalization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "a short sentence";
		String str2 = "a,lazy...fox!";
		String str3 = "look,it is working!";
		
		System.out.println("Capitalization: " + capitalizaion(str1));
		System.out.println("Capitalization: " + capitalizaion(str2));
		System.out.println("Capitalization: " + capitalizaion(str3));

	}

	private static String capitalizaion(String str) {
		
		StringBuilder titleCase = new StringBuilder();
		boolean nextTitleCase = true;
		
		for(char c : str.toCharArray()) {
			if(!Character.isLetterOrDigit(c)) {
				nextTitleCase = true;
			} else if(nextTitleCase) {
				c = Character.toTitleCase(c);
				nextTitleCase = false;
			}
			
			titleCase.append(c);
		}
		
		return titleCase.toString();
	}
}
