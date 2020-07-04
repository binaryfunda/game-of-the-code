package org.gameofthecode.program1;

public class PyramidPattern {

	public static void main(String args[]) 
	{
		int n = 10;//number of row required
		pyramidDesign(n);
	}

	 public static void pyramidDesign(int n) 
	    {  
		 //Outer loop will handle the number of row.
	        for ( int i=0; i<n; i++) 
	            { 
	        	//Inner loop will handle the space
	        	//the value of j is decrease by 1
	        	for(int j=n;j>=i;j--) {
	                System.out.print(" "); //print space

	        	}
	        	//Inner loop will handle the asterisk
	        	//the value of k is increase by 1
	        	for(int k=0;k<=i;k++) {
	                System.out.print("* "); //print space

	        	}
	        	//This is to take cursor to next line
	            System.out.println("");
	            }  

	        }
} 
	  
	 

