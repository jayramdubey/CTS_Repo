package gs_day6;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]={10,5,6,9,20,15,7,8};
		int key=9;
		linearSerch(arr,key);

	}

	private static void linearSerch(int[] arr, int key) {
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				System.out.println("element is present in position: "+i+" key: "+ key);
			}
		}
		
	}

}
