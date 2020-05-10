package mock;

import java.util.HashMap;
import java.util.Map;
/*
* Find highest average in 2d array of students scores
*
* Example 1.
* String[][] arr = {
* {"Bobby","87";},
* {Charles,100;},
* {Eric;65},
* {Charles,22},
* {Charles,37},
* {Eric,49}
* }
* If students names are repeated multiple times,
* then find the average score for the student and do Math.floor if
necessary.
*
* So, Charles average score would be Math.floor((100+22+37)/3) = 53 And,
* for Eric it would be Math.floor((65+49)/2) = 57.
*
* So highest average would be [Bobby,87].
*
* --------------------------------------------------
*
* Example 2
* String[][] arr = {
* {Charles,87},
* {Bobby,87}
* }
* Highest average should be [Bobby,87],[Charles,87], which is
ordered by name
*
* --------------------------------------------------------
* Note: Should handle EMPTY, WHITESPACE &amp; NULL values.
*/
public class GetMaxAverageOfStudents {

	public static void main(String[] args) {

	/*	String[][] arr = { { "Bobby", "87" }, { "Charles", "100" }, { "Eric", "65" }, { "Charles", "22" },
				{ "Charles", "37" }, { "Eric", "49" } };*/
		

		String[][] arr = { { "Bob", "85" }, { "Mark", "100" }, { "Charles", "63" }, { "Mark", "94" },
				{ "Mark", "100" } };
		int len = arr.length;
		String highest = getMaxAverageOfStudents(arr, len);

		System.out.println(highest);
	}

	private static String getMaxAverageOfStudents(String[][] arr, int len) {

		Map<String, Integer> hm = new HashMap<>();
		Map<String, Integer> counts = new HashMap<>();

		for (int i = 0; i < len; i++) {
			if (hm.containsKey(arr[i][0])) {
				int values = hm.get(arr[i][0]);
				int counter = counts.get(arr[i][0]) + 1;
				hm.put(arr[i][0], (values + Integer.parseInt(arr[i][1]) / counter));
			} else {
				counts.put(arr[i][0], 1);
				hm.put(arr[i][0], Integer.parseInt(arr[i][1]));
			}
		}

		int max = 0;
		int p = 0;
		for (int i = 0; i < len; i++) {
			if (max < hm.get(arr[i][0])) {
				max = hm.get(arr[i][0]);
				p = i;
			}
		}
		return arr[p][0];
	}

}
