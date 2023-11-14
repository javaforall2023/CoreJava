package com.javaforall.arrays;

public class Arrays2 {

	public static void main(String[] args) {
		
		int array[][] = {{1,2},{3,4}};
		
		// 1,2,3,4,5,6,7,8,9
		
						
		//array[0][0] = 1
		//array[0][1] = 2
		//array[0][2] = 3
		
		//array[1][0] = 4
		//array[1][1] = 5
		//array[1][2] = 6
				
		//System.out.println(array[0][0]);
		//System.out.println(array[1][2]);
		
		// 1 2
		// 3 4
		
		for(int i=0;i<array.length;i++) {
		
			for(int j=0;j<array.length;j++){
				
				System.out.print(" "+array[i][j]);
			}
			
			System.out.println();
		}
		
	}

}
