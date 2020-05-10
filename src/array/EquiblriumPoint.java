package array;

public class EquiblriumPoint {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 8, -9, 20, 6 };
		int len = arr.length;
		boolean res=equiblirium(arr, len);
		System.out.println("isequiblirum  "+res);
	}

	private static boolean equiblirium(int[] arr, int n) {
		int sum = 0;
		int l_sum = 0;
		for (int i = 0; i < n; i++)
			sum += arr[i];

		for (int i = 0; i < n; i++) {
			if (l_sum == sum - arr[i]) {
				return true;
				}
			l_sum +=arr[i];
			sum -=arr[i];

		}
		return false;

	}

}
