package com.javaforall.arrays;

public class ArraysReverse {

	public static void main(String[] args) {
		
		int []array = {1,2,3,4,5,6,7,8,9};
		
		ArrayUtility.printArray(array);
		
		System.out.println();
		
		int array2[] = new int[array.length];
		
		int j = 0;
		
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(" "+array[i]);
			array2[j] = array[i];
			j++;
		}
		
		System.out.println();
		
		ArrayUtility.printArray(array);
		
		System.out.println();
		
		ArrayUtility.printArray(array2);
		
		System.out.println();
		System.out.println("##### Reversing #####");
		
		for(int i=0;i<array.length/2;i++) {
			int t = array[i];
			array[i]= array[array.length-i-1];
			array[array.length-i-1] = t;
		}
		
		ArrayUtility.printArray(array);

	}

}
