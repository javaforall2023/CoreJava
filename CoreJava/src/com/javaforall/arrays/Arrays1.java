package com.javaforall.arrays;

public class Arrays1 {

	public static void main(String[] args) {
				
		// What is An Array
		//int a[];
		//int []b;
		//int[] c;
		
		int array1[] = new int[5];
		
		int array2[] = {4,5,6,7,8};
		
		// Index of starts with 0 - the index will go till the size minus 1
		
		array1[0] = 2;
		array1[1] = 3;
		// skipping or not assigning any value to index 2
		array1[3] = 5;
		array1[4] = 6;
		
		for(int i=0; i<array1.length;i++) {
				System.out.println(array1[i]);
		}
		
		
		

	}

}
