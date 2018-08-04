package com.alucard.algorithms;

//--- Directions
//Given an integer, return an integer that is the reverse
//ordering of numbers.
//--- Examples
//reverseInt(15) === 51
//reverseInt(981) === 189
//reverseInt(500) === 5
//reverseInt(-15) === -51
//reverseInt(-90) === -9


public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = -90;
		int number2 = 500;
		int number3 = 981;
		
		System.out.println("reverse of -90 is: " + reverseInt(number1));
		System.out.println("reverse of 500 is: " + reverseInt(number2));
		System.out.println("reverse of 981 is: " + reverseInt(number3));

	}
	
	private static int reverseInt(int num) {
		
		long reverseNum = 0;
		long input_long = num;
		
		while(input_long != 0) {
			reverseNum = reverseNum*10 + input_long%10;
			input_long = input_long /10;
		}
		
		return (int) reverseNum;
	}

}
