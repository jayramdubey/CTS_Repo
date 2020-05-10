package gs_day4;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = { 5, 2, 4, 6, 1, 3 };
		int len = arr.length;

		selectionSort(arr, len);
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void selectionSort(int[] arr, int len) {

		for (int i = 0; i < len; i++) {
			int min_indx = i;
			int j;
			for (j = i + 1; j < len; j++) {
				if (arr[min_indx] > arr[j])
					min_indx = j;
			}
			int tmp = arr[min_indx];
			arr[min_indx] = arr[i];
			arr[i] = tmp;

		}

	}

}
