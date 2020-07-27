package mock;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class GivenNumberIsPowerOFTenOrNot {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean res = givenNumberIsPower(n);
		System.out.println("Divisible by 10 or not: " + res);
	}

	private static boolean givenNumberIsPower(int n) {
		while (n > 9 && n % 10 == 0) {
			n /= 10;
		}
		return n == 1;
	}
	@Test
	public void testM1(){
		
		assertTrue(givenNumberIsPower(100));
		assertFalse(givenNumberIsPower(1001));
	}

}
