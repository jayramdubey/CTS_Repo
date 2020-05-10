package gs_day2;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 6;
		int res = fibonacci(n);
		System.out.println(res);
	}

	private static int fibonacci(int n) {
		if (n <= 1)
			return 0;

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
