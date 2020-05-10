package array;

public class RemoveDublicateShortedArrElement2 {

	public static void main(String[] args) {
		int arr[] = { 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 10, 10 };
		int len = arr.length;
		int size=removeDub(arr, len);
	
		 
         System.out.println("After removing dublicate main size of arrays: "+size);
	}

	private static int removeDub(int[] arr, int len) {
		
		int res=1;
        for(int i=0;i<len;i++){
        	if(arr[i]!=arr[res-1]){
        		arr[res]=arr[i];
        		res++;
        	}
        }
        return res;
	}

}
