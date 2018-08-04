package com.alucard.algorithms;
//--- Directions
//Write a program that console logs the numbers
//from 1 to n. But for multiples of three print
//“fizz” instead of the number and for the multiples
//of five print “buzz”. For numbers which are multiples
//of both three and five print “fizzbuzz”.
//--- Example
//fizzBuzz(5);
//1
//2
//fizz
//4
//buzz

public class FizzBuzz {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			if(i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if(i % 3 == 0) {
				System.out.println("Fizz");
			} else if(i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(String.valueOf(i));
			}
		}

	}

}
