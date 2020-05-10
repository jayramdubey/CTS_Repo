package array;

public class StockBuyandCellProblems {

	public static void main(String[] args) {

		//int dayPrice[] = { 10, 30, 200, 50, 5, 500, 6, 800 };
		int dayPrice[] = { 1, 5, 3, 8, 12 };
		int len = dayPrice.length;
		int result = maxProfit(dayPrice, len);
		System.out.println("Maximum profit is: " + result);
	}

	private static int maxProfit(int[] arr, int len) {
		int profit = 0;
		for (int i = 1; i < len; i++) {
			if (arr[i] > arr[i - 1]) {
				profit += arr[i] - arr[i - 1];
			}
		}

		return profit;
	}

}
