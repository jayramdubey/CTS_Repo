package gs_day6;

import java.util.Arrays;

public class BinarySearchRec {

	public static void main(String[] args) {
		int arr[] = { 10, 5, 6, 9, 20, 15, 7, 8 };
		int key = 100;
		Arrays.sort(arr);
		int len = arr.length;
		int result = binarySearch(arr, 0, len - 1, key);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

	private static int binarySearch(int[] arr, int low, int high, int key) {

		if (high >= low) {

			int mid = (low + high) / 2;
			if (key == arr[mid])
				return mid;
			if (key < arr[mid])
				return binarySearch(arr, low, mid - 1, key);
			else
				return binarySearch(arr, mid + 1, high, key);
		}
		
		return -1;

	}

}
