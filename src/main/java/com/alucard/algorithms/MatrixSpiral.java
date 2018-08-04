package com.alucard.algorithms;
//--- Directions
//Write a function that accepts an integer N
//and returns a NxN spiral matrix.
//--- Examples
//matrix(2)
//  [[1, 2],
//  [4, 3]]
//matrix(3)
//  [[1, 2, 3],
//  [8, 9, 4],
//  [7, 6, 5]]
//matrix(4)
//  [[1,   2,  3, 4],
//  [12, 13, 14, 5],
//  [11, 16, 15, 6],
//  [10,  9,  8, 7]]

public class MatrixSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		
        printSpiral(n);
    
	}
	

    static void printSpiral(int n)
    {
    	int[][] spiral = new int[n][n];        
        int value = 1;         
        int minCol = 0;         
        int maxCol = n-1;         
        int minRow = 0;         
        int maxRow = n-1;
         
        while (value <= n*n) {
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = value;                     
                value++;
            }
             
            for (int i = minRow+1; i <= maxRow; i++) { 
                spiral[i][maxCol] = value;                  
                value++; 
            } 
             
            for (int i = maxCol-1; i >= minCol; i--) {
                spiral[maxRow][i] = value;                             
                value++;
            }
             
            for (int i = maxRow-1; i >= minRow+1; i--) {
                spiral[i][minCol] = value;                 
                value++;
            }
             
            minCol++;             
            minRow++;             
            maxCol--;             
            maxRow--;
        }
         
        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral.length; j++) {
                System.out.print(spiral[i][j]+ "\t");
            }             
            System.out.println();
        }
    }
    

}
