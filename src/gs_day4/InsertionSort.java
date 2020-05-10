package gs_day4;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[]={5,2,4,6,1,3};
		int len=arr.length;
		
		insertionSort(arr,len);
		for(int i=0;i<len;i++){
			System.out.print(arr[i]+" ");
		}
	}

	private static void insertionSort(int[] arr, int len) {
		int i,j;
		
		for(i=1;i<len;i++){
			j=i-1;
			int key = arr[i];
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
	}

}
