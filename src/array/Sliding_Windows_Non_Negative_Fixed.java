package array;

public class Sliding_Windows_Non_Negative_Fixed {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 20, 3, 10, 5 };
		int len = arr.length;
		int sum = 33;
		boolean result = findSlidinWidowsSum(arr, len, sum);
		System.out.println("Maximum sliding sum: " + result);

	}

	private static boolean findSlidinWidowsSum(int[] arr, int n, int sum) {
		int s = 0, curr_sum = arr[0];
		for (int i = 1; i < n; i++) {
			// clean the prev window
			while (curr_sum > sum && s < i - 1) {
				curr_sum -= arr[s];
				s++;
			}
			if (curr_sum == sum)
				return true;
			if (i < n) {
				curr_sum += arr[i];
			}
		}

		return (curr_sum == sum);
	}

}
