package com.alucard.algorithms;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonString {

	public static void main(String[] args) {
		
		List<String> words = new ArrayList<String>();
		words.add("cat");
		words.add("dog");
		words.add("cat");
		words.add("chicken");
		words.add("cat");
		words.add("dog");
		
				
		
//		ArrayList<String> string;
//		string = new ArrayList<>(Arrays.asList("Mah", "Bob", "mah", "bat", "MAh", "BOb"));
		
		System.out.println("Most commons elements: " + mostCommonStrings(words));

	}
	
	private static Object mostCommonStrings(List<String> string) {
		
		Map<String, Integer> wordMap = new HashMap<String, Integer>();

		for (String st : string) {
		    String input = st.toUpperCase();
		    if (wordMap.get(input) != null) {
		        Integer count = wordMap.get(input) + 1;
		        wordMap.put(input, count);
		    } else {
		        wordMap.put(input, 1);
		    }
		}
		System.out.println("Word Map values: " + wordMap);
		Object maxEntry = Collections.max(wordMap.entrySet(), Map.Entry.comparingByValue()).getKey();
		//System.out.println("maxEntry = " + maxEntry);
		
		
		return maxEntry;
		
	}

}
