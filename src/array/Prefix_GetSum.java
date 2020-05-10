package array;

import java.util.Scanner;

public class Prefix_GetSum {

	public static void main(String[] args) {
		int arr[] = { 2, 8, 3, 9, 6, 5, 4 };
		int len = arr.length;
		int prefix_sum[] = new int[len];
		prefix_sum[0] = arr[0];
		for (int i = 1; i < len; i++) {
			prefix_sum[i] = prefix_sum[i - 1] + arr[i];
		}
		System.out.println("Enter the l and r values ");
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int sumOfarr = getSum(prefix_sum, len, l, r);
		System.out.println("Sum of the  prefix: "+ sumOfarr);

	}

	private static int getSum(int[] prefix_sum, int len, int l, int r) {

		int sumOfNum = 0;
		if (l == 0) {
			sumOfNum = prefix_sum[r];
		} else {
			sumOfNum = prefix_sum[r] - prefix_sum[l - 1];
		}
		return sumOfNum;
	}

}
