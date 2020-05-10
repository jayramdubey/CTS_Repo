package array;

public class LeftRotation {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 56, 7 };
		int len = arr.length;

		leftRotation(arr, len, 2);

	}

	private static void leftRotation(int[] arr, int len, int d) {
		for (int i = 0; i < d; i++) {
			leftRotationone(arr, len);
		}
		for (int i = 0; i < len; i++) {
			System.out.print(" " + arr[i]);
		}

	}

	private static void leftRotationone(int[] arr, int len) {
		int tmp = arr[0];

		for (int i = 0; i < len - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[len-1] = tmp;
	}

}
