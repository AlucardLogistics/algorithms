package com.alucard.algorithms;
//--- Directions
//Print out the n-th entry in the fibonacci series.
//The fibonacci series is an ordering of numbers where
//each number is the sum of the preceeding two.
//For example, the sequence
//[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
//forms the first ten entries of the fibonacci series.
//Example:
//fib(4) === 3

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		int nRec = 9;
		System.out.println(n + "th number in fibbonaci series is: " + fibonacci(n));
		System.out.println(nRec + "th number in fibbonaci series with recursion is: " + fibonacciRecursion(nRec));

	}
	
	private static int fibonacci(int n) {
		
		int numOne = 0;
		int numTwo = 1;
		int temp = 0;
		
		if(n == 0) {
			return numOne;
		}
		
		for(int i=2; i <= n; i++) {
			temp = numOne + numTwo;
			numOne = numTwo;
			numTwo = temp;
		}
		
		return numTwo;
	}
	
	private static int fibonacciRecursion(int n) {
		
		if(n <= 1) {
			return n;
		} else {
			return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
		}
	}

}
