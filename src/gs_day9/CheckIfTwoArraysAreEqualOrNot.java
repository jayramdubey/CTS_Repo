package gs_day9;

import java.util.HashMap;
import java.util.Map;

public class CheckIfTwoArraysAreEqualOrNot {

	public static void main(String[] args) {
		int arr1[] = { 3, 5, 2, 5, 2 }; 
        int arr2[] = { 2, 3, 5, 5, 6 }; 
  
        if (areEqual(arr1, arr2)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    }

	private static boolean areEqual(int[] arr1, int[] arr2) {
		int l1=arr1.length, l2=arr2.length;
		if(l1 != l2)
			return false;
		Map<Integer, Integer> hm= new HashMap<>();
		 for(int i=0;i<l1;i++){
			 if(hm.containsKey(arr1[i])){
				 hm.put(arr1[i], hm.get(arr1[i])+1);
			 }else{
				 hm.put(arr1[i], 1); 
			 }
		 }
		 for(int i=0;i<l2;i++){
			 if(!hm.containsKey(arr2[i])){
				return false;
			 }
		 }
		
		return true;
	} 
}
