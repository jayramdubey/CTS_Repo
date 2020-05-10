package mock;

import java.util.Arrays;

public class PrintAllTheTripletsOn3 {

	public static void main(String[] args) {
		int arr[] = { 2, 7, 4, 9, 5, 1, 3 };
		int sum = 10;

		printAllTheTriplets(arr, sum);
		System.out.println(".........................");
		//printAllTheTripletsOn2(arr, sum);

	}

	private static void printAllTheTripletsOn2(int[] arr, int sum) {
		int len = arr.length;
		Arrays.sort(arr);
		int l, r;
		for (int i = 0; i < len - 2; i++) {
			l = i + 1;
			r = len - 1;
			while (l < r) {
				if (arr[i] + arr[l] + arr[r] <= sum) {
					for (int x = l + 1; x <= r; x++) {
						System.out.println("[" + arr[i] + "," + arr[l] + "," + arr[r] + "]");
					}

					l++;
				}

				else
					r--;
			}
		}

	}

	private static void printAllTheTriplets(int[] arr, int sum) {

		int len = arr.length;
		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 1; j < len - 1; j++) {
				for (int k = j + 1; k < len; k++) {
					if (arr[k] + arr[j] + arr[i] <= 10) {
						System.out.println("[" + arr[k] + "," + arr[j] + "," + arr[i] + "]");
					}
				}
			}
		}

	}

}
