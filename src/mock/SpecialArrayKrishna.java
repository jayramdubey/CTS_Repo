package mock;

import java.util.HashSet;
import java.util.Set;

// 2nd questions: (x,-x) 2,-2 3,-3 //3
//c
  // int arr[] = { 1,1,2,-1,2,-1 };//1
  //int arr[] = { 1, 2, 3, 4 };//0

public class SpecialArrayKrishna {

	public static void main(String[] args) {
		int arr[] = { 3, 2, -2,-3, 4,-4,1,-1 }; //3
		findVal(arr, arr.length);

	}

	private static void findVal(int[] arr, int len) {
       
		int maxInteger=0;
		int posetiveIntegre=0;
		Set<Integer> pairSet = new HashSet<>();
		for(int i=0;i<len;i++){
			if(arr[i]>0){
				pairSet.add(arr[i]);
			}
		}
		for(int i=0;i<len;i++){
			if(arr[i]<0){
				if(pairSet.contains(-arr[i])){
				
					maxInteger = Math.abs(arr[i]);
					posetiveIntegre= Math.max(maxInteger, posetiveIntegre);
				}
			}
		}
		System.out.println(posetiveIntegre);
		
	}

}
