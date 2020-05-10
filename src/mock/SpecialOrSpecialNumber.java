package mock;

import java.util.Scanner;

public class SpecialOrSpecialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements: ");
		int n = sc.nextInt();

		int result = n;
		while (result != 1 && result != 4) {
			result = isSpecialNumber(result);
		}
		if (result == 1)
			System.out.println("The number is special");
		else
			System.out.println("The number is not special");
	}

	private static int isSpecialNumber(int n) {

		int rem = 0;
		int sqrSum = 0;
		while (n > 0) {
			rem = n % 10;
			sqrSum += rem * rem;
			n /= 10;
		}
		return sqrSum;
	}

}
