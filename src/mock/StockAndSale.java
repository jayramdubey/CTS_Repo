package mock;

public class StockAndSale {

	public static void main(String[] args) {
		// int arr[] = { 7, 1, 5, 3, 6, 4 };  //op: 7
		int arr[] = { 1, 2, 3, 4, 5 };        // op: 4
		int len = arr.length;
		int maxProfite = maxProfit(arr, len);

		System.out.println(maxProfite);
	}

	private static int maxProfit(int[] arr, int len) {
		int maxProfite = 0;
		for (int i = 1; i < len; i++) {
			if (arr[i - 1] < arr[i]) {
				maxProfite += arr[i] - arr[i - 1];
			}
		}

		return maxProfite;

	}

}
