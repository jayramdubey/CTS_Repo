package gs_day2;

public class SecondSmallestElement {

	public static void main(String[] args) {
		int arr[] = { 10, 9, 1, 8, 4, 6, 3, 2, 20, 14,-1 };
		int len = arr.length;
		secondSmallestElement(arr, len);
	}

	private static void secondSmallestElement(int[] arr, int len) {

		int first, second;
		if (len < 2) {
			System.out.println(" Invalid Input ");
			return;
		}

		first = second = arr[0];
		for (int i = 0; i < len; i++) {

			if (arr[i] < first) {
				second = first;
				first = arr[i];
			}

			else if (second> first && arr[i] < second)
				second = arr[i];
		}
		System.out.println("Second Smallest element is " + second);

	}

}
