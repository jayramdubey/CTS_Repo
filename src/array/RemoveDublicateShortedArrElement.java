package array;

public class RemoveDublicateShortedArrElement {

	public static void main(String[] args) {

		int arr[] = { 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 10, 10};
		int len = arr.length;
		removeDub(arr, len);

	}

	private static void removeDub(int[] arr, int len) {
		int tmp[] = new int[len];

		tmp[0] = arr[0];
		int res = 1;
		for (int i = 0; i < len; i++) {
			if (tmp[res - 1] != arr[i]) {
				tmp[res] = arr[i];
				res++;
			}
		}
		for (int i = 0; i < len; i++) {
			System.out.print(" " + tmp[i]);
		}
	}

}
