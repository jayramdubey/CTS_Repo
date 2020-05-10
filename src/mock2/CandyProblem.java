package mock2;

import java.util.Arrays;

public class CandyProblem {

	public static void main(String[] args) {
		//int arr[] = { 1,2,0,1,3 };
		int arr[] = { 1,0,2 };
		int len=arr.length;
		int result= candyPrint(arr, len);
		System.out.println(result);

	}

	private static int candyPrint(int[] ratings, int len) {

		
		int[] candies = new int[len];
		Arrays.fill(candies, 1);
		for (int i = 1; i < len; i++) {
			if (ratings[i] > ratings[i - 1]) {
				candies[i] = candies[i - 1] + 1;
			}
		}

		int sum = candies[len - 1];
		for (int i = len - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1]) {
				candies[i] = Math.max(candies[i], candies[i + 1] + 1);
			}
			sum += candies[i];
		}
		return sum;

	}
}
