package mock2;

import java.io.*;

public class JosephusProblem {

	public static void main(String[] args) {
		int n = 3;
		int k = 2;
		System.out.println("The chosen place is: " + circularArray(n, k));
	}

	static int circularArray(int n, int k) {
		int res = 0;
		for (int i = 1; i <= n; ++i)
			res = (res + k) % i;
		return res + 1;
	}

}
