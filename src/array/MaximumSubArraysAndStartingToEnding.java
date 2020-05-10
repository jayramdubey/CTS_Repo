package array;

public class MaximumSubArraysAndStartingToEnding {

	public static void main(String[] args) {
		int arr[] = { 2, 3, -8, 7, -1, 2, 3 };
		int len = arr.length;
		 maxSumSubArr(arr, len);

	}

	private static void maxSumSubArr(int[] arr, int len) {
		int max_so_far = 0;
		int max_ending_here = 0, start = 0, end = 0, s = 0;

		for (int i = 0; i < len; i++) {
			max_ending_here = max_ending_here + arr[i];
			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
				start = s;
				end = i;
			}
			if (max_ending_here < 0) {
				max_ending_here = 0;
				s = i + 1;
			}
		}
		System.out.println("Maximum contiguous sum is " + max_so_far);
		System.out.println("Starting index " + start);
		System.out.println("Ending index " + end);
	}

}
