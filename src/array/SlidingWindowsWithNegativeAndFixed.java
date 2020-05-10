package array;

public class SlidingWindowsWithNegativeAndFixed {

	public static void main(String[] args) {

		//int arr[] = { 7, 8, 30, -5, 20, 7 };
		int arr[] = { 5, -10, 6, 90, 3};
		int len = arr.length;
		int window_size = 3;
		int result = findSlidinWidowsSum(arr, len, window_size);
		System.out.println("Maximum sliding sum: " + result);

	}

	private static int findSlidinWidowsSum(int[] arr, int n, int window_size) {

		int cur_sum = 0;
		for (int i = 0; i < window_size; i++) {
			cur_sum += arr[i];
		}
		int max_sum = cur_sum;
		for (int i = window_size; i < n; i++) {
			cur_sum += arr[i] - arr[i - window_size];
			max_sum = Math.max(cur_sum, max_sum);
		}
		return max_sum;

	}

}
