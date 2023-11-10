package com.javaforall.dayone;

public class ExceptionHandling {

	public static void main(String[] args) {
					
		try {
			
			String str = null;
			int strLength = str.length();
			
			System.out.println(strLength);
			
		}catch(Exception ex) {
			System.out.println(ex.toString());
			System.out.println("Exception Occcured:"+ex.getMessage());
		}finally{
			System.out.println("Finally ...");
		}
	}

}

