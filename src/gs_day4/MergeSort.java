package gs_day4;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 14, 7, 3, 12, 9, 11, 6, 2 };
		int s = 0, e = arr.length;
		mergeSort(arr, s, e - 1);
		printArray(arr);
	}

	private static void mergeSort(int[] arr, int s, int e) {

		if (s < e) {
			int mid = (s + e) / 2;
			mergeSort(arr, s, mid);
			mergeSort(arr, mid + 1, e);

			merge(arr, s, mid, e);
		}
	}

	private static void merge(int[] arr, int s, int mid, int e) {

		int tmp[] = new int[e - s + 1];

		int i = s, j = mid + 1, k = 0;
		while (i <= mid && j <= e) {
			if (arr[i] <= arr[j]) {
				tmp[k] = arr[i];
				i++;
				k++;
			} else {
				tmp[k] = arr[j];
				k++;
				j++;
			}
		}
		// left 1st arr
		while (i <= mid) {
			tmp[k] = arr[i];
			i++;
			k++;
		}
		while (j <= e) {
			tmp[k] = arr[j];
			k++;
			j++;
		}

		for (i = s; i <= e; i++) {
			arr[i] = tmp[i - s];
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
