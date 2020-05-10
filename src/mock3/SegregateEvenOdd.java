package mock3;

public class SegregateEvenOdd {

	public static void main(String[] args) {
		//int arr[] = { 12, 34, 45, 9, 8, 90, 3 };
		int arr[] = {12, 17, 70, 15, 22, 65, 21, 90};
		
		int len = arr.length;
		arr = segregateEvenOdd(arr,len);
		for(int i=0;i<len-1;i++){
			System.out.print(arr[i]+" ");
		}
		
	}

	private static int[] segregateEvenOdd(int[] arr, int len) {
		int left = 0;
		int right = len-1;
		while(left < right){
			
			while(arr[left]%2 == 0 && left<right)
				left ++;
			while(arr[right]%2 != 0 && left<right)
				right--;
			
			if(left < right){
				int tmp = arr[left];
				arr[left] = arr[right];
				arr[right] = tmp;
				left++;right--;
			}
		}
		return arr;
	}

}
