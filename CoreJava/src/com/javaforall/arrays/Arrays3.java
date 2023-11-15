package com.javaforall.arrays;

public class Arrays3 {

	public static void main(String[] args) {
		
		// Print a 3X3 Matrix
		// Print 2X3 Matrix
		
		// 1 2 3 
		// 4 5 6
		// 7 8 9
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0; i<a.length;i++) {
			System.out.println();
			for(int j=0;j<a.length;j++) {
				System.out.print(" "+a[i][j]);
				
			}
		}
				
	}

}
