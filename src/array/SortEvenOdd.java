package array;

import java.util.Arrays;

/*Input  : arr[] = {1, 2, 3, 5, 4, 7, 10}
Output : arr[] = {7, 5, 3, 1, 2, 4, 10}
Input  : arr[] = {0, 4, 5, 3, 7, 2, 1}
Output : arr[] = {7, 5, 3, 1, 0, 2, 4} */

public class SortEvenOdd {

	public static void main(String[] args) {
		//int arr[] = {1, 2, 3, 5, 4, 7, 10};
		int arr[] = {0, 4, 5, 3, 7, 2, 1};
		int len = arr.length;
		arr = twoWaySort(arr, len);
		for(int i=0;i<len-1;i++){
			System.out.print(arr[i]+" ");
		}
		
		
	}

	  static int [] twoWaySort(int arr[], int n) 
	    { 
	        // Make all odd numbers negative 
	        for (int i = 0; i < n; i++) 
	            if (arr[i] %2 != 0) // Check for odd 
	                arr[i] *= -1; 
	  
	        // Sort all numbers 
	        Arrays.sort(arr); 
	  
	        // Retaining original array 
	        for (int i = 0; i < n; i++) 
	            if (arr[i] %2 != 0) 
	                arr[i] *= -1;
			return arr; 
	    } 
	  

}
