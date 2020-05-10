package test;

import java.util.Arrays;

public class Main {
	
	    public static void main(String[] args) 
	    { 
	        int ar[] = {2, 2, 1, 8, 3, 2, 2, 4, 2}; 
	  
	        // To fill complete array with a particular 
	        // value 
	        Arrays.fill(ar, 10); 
	        System.out.println("Array completely filled" + 
	                  " with 10\n" + Arrays.toString(ar)); 
	    } 
	} 