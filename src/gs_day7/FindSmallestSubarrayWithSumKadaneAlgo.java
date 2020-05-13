package gs_day7;

public class FindSmallestSubarrayWithSumKadaneAlgo {

	public static void main(String[] args) {
		int arr[] = { 2, 3, -8, 7, -1, 2, 3 };
		int len = arr.length;
		maxSumSubArr(arr, len);
		maxSumSubArrKadaneAlgo(arr, len);

	}

	private static void maxSumSubArrKadaneAlgo(int[] arr, int len) {
		int max_so_far = 0, max_Ending_Here = 0, end = 0, start = 0, s = 0;

		for (int i = 0; i < len; i++) {
			max_Ending_Here += arr[i];
			if (max_so_far < max_Ending_Here) {
				max_so_far = max_Ending_Here;
				start = s;
				end = i;
			}
			if (max_Ending_Here < 0) {
				max_Ending_Here = 0;
				s = i + 1;
			}
		}
		System.out.println("Max sum of array "+ max_so_far);
		System.out.println("[ "+ start+" , "+ end+"]");

	}

	private static void maxSumSubArr(int[] arr, int len) {
		int res = arr[0];
		int maxSubArray = arr[0];
		for (int i = 1; i < len; i++) {
			maxSubArray = Math.max(maxSubArray + arr[i], arr[i]);

			res = Math.max(res, maxSubArray);

		}
		System.out.println("Maximum sum of the Arrays " + maxSubArray);

	}

}
