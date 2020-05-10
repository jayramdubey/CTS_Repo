package gs_day3;

public class CircularArray {

	public static void main(String[] args) {

		char[] arr = new char[] { 'A', 'B', 'C', 'D', 'E', 'F' };
		int n = arr.length;
		print(arr, n, 3);
	}

	private static void print(char[] arr, int n, int ind) {

		char[] b = new char[(2 * n)];

		for (int i = 0; i < n; i++)
			b[i] = b[n + i] = arr[i];
		
		for (int i = ind; i < n + ind; i++)
			System.out.print(b[i] + " ");

	}

}
