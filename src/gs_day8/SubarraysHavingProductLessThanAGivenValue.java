package gs_day8;

public class SubarraysHavingProductLessThanAGivenValue {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4 };
		int k = 100;
		int size = array.length;

		int count = numSubarrayProductLessThanK(array, size, k);
		System.out.print("Total number of subarrays is :" + count);

	}

	public static int numSubarrayProductLessThanK(int[] arr, int len, int k) {
		if (k <= 1)
			return 0;
		int prod = 1, result = 0, left = 0;
		for (int right = 0; right < len; right++) {
			prod *= arr[right];
			while (prod >= k)
				prod /= arr[left++];
			result += right - left + 1;
		}
		return result;
	}

}
