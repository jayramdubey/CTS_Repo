package gs_day6;

public class BinarySearchItrative {

	public static void main(String[] args) {
		BinarySearchItrative ob = new BinarySearchItrative();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int key = 3;
		int result = ob.binarySearch(arr,0,n-1, key);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}

	private int binarySearch(int[] arr,int low, int high, int key) {

	
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key)
				return mid;
			if (key < arr[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}
}
