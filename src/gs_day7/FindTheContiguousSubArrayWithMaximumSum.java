package gs_day7;

//Given an array arr of N integers. Find the contiguous sub-array with maximum sum. [1,2,3,-2,5] // 9
public class FindTheContiguousSubArrayWithMaximumSum {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, -2, 5 };
		int len = arr.length;
		maximumSum(arr, len);

	}

	private static void maximumSum(int[] arr, int len) {

		int max_Sum_sofar = 0, max_ending_here = 0, end = 0, S = 0, start = 0;
		for (int i = 0; i < len; i++) {
			max_ending_here += arr[i];
			if (max_Sum_sofar < max_ending_here) {
				max_Sum_sofar = max_ending_here;
				end = i;
				start = S;
			}
			if (max_ending_here < 0) {
				max_ending_here = 0;
				S = i + 1;
			}
		}
		System.out.println("Maximum sum: " + max_Sum_sofar);
		System.out.println("[ "+ start+" , "+ end+"]");

	}

}
