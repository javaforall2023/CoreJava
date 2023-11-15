package com.javaforall.arrays;

public class ArraysSorting {

	public static void main(String[] args) {
		
		int []array = {2,1,3,7,4,5,9,6};
		
		printArray(array);
		
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			
			}
			
		}
		System.out.println();
		
		printArray(array);
		

	}

	private static void printArray(int[] array) {
		
		for(int i=0;i<array.length;i++) {
			System.out.print(" "+ array[i]);
		}
		
	}

}
