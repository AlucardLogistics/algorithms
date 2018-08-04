package com.alucard.algorithms;

import java.util.Arrays;

//--- Directions
//Given an array and chunk size, divide the array into many subarrays
//where each subarray is of length size
//--- Examples
//chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]
//chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]
//chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]
//chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]
//chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]

public class ArrayChunk {
	
	public static void main(String[] args) { 
		
		int[] numbers = {1,2,3,4,5,6,7,8};
		int size = 3;
		int[] numberArray = {3,5,7,3,1,4,7,5,3,4,7,4,7,5,3,2};
		int newSize = 5;
		
		System.out.println("Chunks of Arrays by 3: " + Arrays.deepToString(chunkArray(numbers, size)));
		System.out.println("Chunks of ArraysTwo by 4: " + Arrays.deepToString(chunkArray(numberArray, newSize)));
				
		
	}
	
	private static int[][] chunkArray(int[] array, int chunkSize) {
		
		int length  = array.length;
		int[][] dest =  new int[((length + chunkSize -1) / chunkSize)][];
		int destIndex = 0;
		int stopIndex = 0;
		
		for(int startIndex = 0; startIndex + chunkSize <= length; startIndex += chunkSize) {
			stopIndex += chunkSize;
			dest[destIndex++] = Arrays.copyOfRange(array, startIndex, stopIndex);
		}
		
		if(stopIndex < length) {
			dest[destIndex] = Arrays.copyOfRange(array, stopIndex, length);
		}
		
		
		return dest;
	}
	
	public static int[][] chunkArrayTwo(int[] array, int chunkSize) {
        int numOfChunks = (int)Math.ceil((double)array.length / chunkSize);
        int[][] output = new int[numOfChunks][];

        for(int i = 0; i < numOfChunks; ++i) {
            int start = i * chunkSize;
            int length = Math.min(array.length - start, chunkSize);

            int[] temp = new int[length];
            System.arraycopy(array, start, temp, 0, length);
            output[i] = temp;
        }

        return output;
    }

}
