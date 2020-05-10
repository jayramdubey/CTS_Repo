package mock2;

import java.util.ArrayList;
import java.util.List;

public class WhetherOneArrayIsASubsetOfOtherOrNot {

	public static void main(String[] args) {
		int array1[] = { 1, 6, 5 };
		int array2[] = { 1, 4, 7, 3, 5, 6 };

		int lenA = array1.length;
		int lenB = array2.length;
		boolean result = isSubArrayOrNot(array1, array2, lenA, lenB);
		System.out.println(result);

	}

	private static boolean isSubArrayOrNot(int[] array1, int[] array2, int lenA, int lenB) {

		List<Integer> temp = new ArrayList<>();
		int count = 0;
		if (lenA <= lenB) {
			for (int i = 0; i < lenB; i++)
				temp.add(array2[i]);
			for (int i = 0; i < lenA; i++) {
				if (temp.contains(array1[i]))
					count++;
			}
			if (count == lenA)
				return true;

		} else {
			for (int i = 0; i < lenA; i++)
				temp.add(array1[i]);
			for (int i = 0; i < lenB; i++) {
				if (temp.contains(array2[i]))
					count++;
			}
			if (count == lenB)
				return true;

		}
		return false;
	}

}
