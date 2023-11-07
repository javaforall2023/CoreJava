package com.javaforall.dayone;

public class Loops {

	public static void main(String[] args) {
		
		// While Loop
		
		int n=0;
		
		/*
		 * while(n<=10) { if(n%2==1) { System.out.println(n); } n++;
		 * 
		 * }
		 */
		
		/*
		 * int i=0; do { System.out.println(i); i++; }while(i<10);
		 */
		 
		 
		 for(int j=1;j<=10;j++) {
			 System.out.println();
				for(int i=0;i<10;i++) { 
					 System.out.print(i+j);
				 }
				
		   }
		 
			/*
			 * 1 
			 * 22 
			 * 333 
			 * 4444 
			 * 55555 
			 * .. 
			 * 10101010...
			 */
		
		 String s1 = "Welcome"; 
		 String s2 = "Java";
		 
		 String s3 = s1+s2;
		 
		 System.out.println();
		 System.out.println(s3);
		 
		 int a = 10; 
		 
		 int b = 20;
		 
				
	}
	
	
	

}
