package gs_day3;

public class MedianOfTwoSorted {

	public static void main(String[] args) {
		int a1[] = { 1, 12, 15, 26, 38 };
		int a2[] = { 2, 13, 17, 30, 45 };
		int l1 = a1.length;
		int l2 = a2.length;
		int l3 = l1 + l2;
		int a3[] = new int[l3];

		findMedian(a1, a2, a3, l1, l2, l3);
	}

	private static void findMedian(int[] a1, int[] a2, int[] a3, int l1, int l2, int size) {

		int j = 0, k = 0;
		while (j < l1 || k < l2) {
			for (int i = 0; i < size; i++) {
				if (j == l1) {
					a3[i] = a2[k];
					k++;
				} else if (k == l2) {
					a3[i] = a2[k];
					k++;
				} else {
					if (a1[j] < a2[k]) {
						a3[i] = a1[j];
						j++;
					} else if (a1[j] > a2[k]) {
						a3[i] = a2[k];
						k++;
					}
				}

			}
		}
		double result = 0;
		if (size % 2 == 0) {
			int x = a3[size / 2];
			int y = a3[(size / 2) - 1];
			result = (x + y) / 2.0;
		} else {
			result = a3[size / 2];
		}
		System.out.println("Median of the folowing  " + result);

	}

}
