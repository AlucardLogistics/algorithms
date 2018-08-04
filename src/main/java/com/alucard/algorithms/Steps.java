package com.alucard.algorithms;
//--- Directions
//Write a function that accepts a positive number N.
//The function should console log a step shape
//with N levels using the # character.  Make sure the
//step has spaces on the right hand side!
//--- Examples
//steps(2)
//  '# '
//  '##'
//steps(3)
//  '#  '
//  '## '
//  '###'
//steps(4)
//  '#   '
//  '##  '
//  '### '
//  '####'

public class Steps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String step = "#";
		int steps = 6;
		steps(step, steps);

	}
	
	private static void steps(String step, int steps) {
		
		for(int i=1; i<=steps; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(step);
			}
			System.out.println();
		}
		
	}

}
