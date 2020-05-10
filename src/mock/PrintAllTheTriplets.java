package mock;

import java.util.Arrays;

public class PrintAllTheTriplets {

	public static void main(String[] args) {
		int arr[] = { 2, 7, 4, 9, 5, 1, 3 };
		int sum = 10;

		printAllTheTriplets(arr, sum);
	}

	public static void printAllTheTriplets(int[] arr, int sum) {

		Arrays.sort(arr);
		int len = arr.length;

		for (int i = 0; i <= len - 3; i++) {

			int low = i + 1, high = len - 1;

			while (low < high) {

				if (arr[i] + arr[low] + arr[high] > sum) {
					high--;
				} else {
					System.out.println("[" + arr[i] + "," + arr[low] + "," + arr[high] + "]");

					low++;
				}
			}
		}
	}

}
