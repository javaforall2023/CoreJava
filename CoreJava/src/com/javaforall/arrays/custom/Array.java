package com.javaforall.arrays.custom;

public class Array{

	private int[]items;
	private int count;
	
	public Array(int length){
		items = new int[length];
	}
	
	public void print() {
		for(int i=0;i<count;i++) {
			System.out.println(items[i]);
		}
	}

	public void addElement(int element) {
				
		 if(items.length==count) { 
			 
			 int []newItems = new int[count*2];
		 
		 for(int i=0;i<count;i++) { 
			 
			 newItems[i] = items[i]; 
		 
		 }
		 
		 items = newItems; 
		 
		 }
				
		items[count++] = element;
	}

	public void remove(int position) {
		if(position<0 || position>=count) {
			throw new IllegalArgumentException("Invalid Position to delete the Element");
		}
		
		for(int i=position;i<count;i++) {
			items[i]= items[i+1];
		}
		
		count--;
		
	}
	
	
	
	
}
