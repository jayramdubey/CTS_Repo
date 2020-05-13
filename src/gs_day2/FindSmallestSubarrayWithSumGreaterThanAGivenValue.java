package gs_day2;

/*arr[] = {1, 4, 45, 6, 0, 19}
x  =  51
Output: 3*/

public class FindSmallestSubarrayWithSumGreaterThanAGivenValue {

	public static void main(String[] args) {
		// int arr1[] = { 1, 4, 45, 6, 10, 19 };
		// int sum = 51;

		// int arr1[] = {1, 10, 5, 2, 7};
		// int sum = 9;

		int arr1[] = { 1, 11, 100, 1, 0, 200, 3, 2, 1, 250 };
		int sum = 280;

		int len = arr1.length;
		int res = smallestSubWithSum(arr1, len, sum);
		if (res == len + 1)
			System.out.println("\nNot Possible");
		else
			System.out.println("\nSize of sub arrays: " + res);
	}

	private static int smallestSubWithSum(int[] arr, int len, int sum) {
		int min_len = len + 1;
		int curr_sum = 0;
		int start = 0, end = 0;
		int strt_indx = 0, endIndx = 0;
		while (end < len) {
			while (curr_sum <= sum && end < len)
				curr_sum += arr[end++];

			while (curr_sum > sum && start < len) {
				if (end - start < min_len) {
					min_len = end - start;
					strt_indx = start;
					endIndx = end;
				}

				curr_sum -= arr[start++];
			}
		}
		System.out.print("{ ");
		for (int i = strt_indx; i < endIndx; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print("}");
		return min_len;
	}

}
