package quistionAskInGs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestAverage {

	public static void main(String[] args) {
		/*
		 * String[][] scores = { { "Bob", "85" }, { "Mark", "100" }, { "Mark",
		 * "100" }, { "Charles", "77" }, { "Charles", "63" }, { "chandu", "10"
		 * }, { "chandu", "100" }, { "chandu", "100" }, { "chandu", "100" } };
		 */

		String[][] scores = { { "Bob", "85" }, { "Mark", "100" }, { "Charles", "63" }, { "Mark", "94" },
				{ "Mark", "100" } };
		findMaxEverage(scores);

	}

	private static void findMaxEverage(String[][] scores) {
		Map<String, Integer> hm = new HashMap<>();
		Map<String, Integer> counts = new HashMap<>();

		for (int i = 0; i < scores.length; i++) {
			if (hm.containsKey(scores[i][0])) {
				Integer value = hm.get(scores[i][0]);
				int countValue = counts.get(scores[i][0]) + 1;
				hm.put(scores[i][0], (value + Integer.parseInt(scores[i][1])) / countValue);
			} else {
				counts.put(scores[i][0], 1);
				hm.put(scores[i][0], Integer.parseInt(scores[i][1]));
			}
		}
		List<Map.Entry<String, Integer>> list = new ArrayList<>(hm.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		System.out.println(hm);
		System.out.println(counts);
		System.out.println(list.get(list.size() - 1));
	}
}
