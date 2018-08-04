package com.alucard.algorithms;
//--- Directions
//Write a function that accepts a positive number N.
//The function should console log a pyramid shape
//with N levels using the # character.  Make sure the
//pyramid has spaces on both the left *and* right hand sides
//--- Examples
//pyramid(1)
//  '#'
//pyramid(2)
//  ' # '
//  '###'
//pyramid(3)
//  '  #  '
//  ' ### '
//  '#####'

public class PyramidsVsSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 3;
		System.out.println("Pyramid of level: " + size);
		pyramid(size);
	}
	
	private static void pyramid(int size) {
		
		String step = "#";
		String space = " ";
		int temp = size;
		
		for (int row = 1; row <= size; row++) {
           for (int c = 1 ; c < temp ; c++) {
             System.out.print(space);
           }

           temp--;

           for (int c = 1; c <= 2*row - 1; c++) {
               System.out.print(step);
           }

           System.out.println();
        }
	}
	
	
}
