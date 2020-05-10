package mock;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

/*
 * Sort elements by frequency 
Print the elements of an array in the decreasing frequency if 2 numbers have same frequency then print the one which came first.

Examples:

Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}

Input: arr[] = {2, 5, 2, 6, -1, 99, 5, 8, 8, 8}
Output: arr[] = {8, 8, 8, 2, 2, 5,5,-1,6, 99}

 */

class Solution {
	public static void main(String[] args) {

		int arr[] = { 2, 5, 2, 8, 5, 6, 8, 8 };

		List<Integer> result = sortByFrequency(arr);
		System.out.println(result);
		List<Integer> resultm2 = sortByFrequencyMethod2(arr);
		System.out.println(resultm2);

	}

	private static List<Integer> sortByFrequencyMethod2(int[] inputArray) {

		Map<Integer, Integer> hm = new LinkedHashMap<>();

		for (int i = 0; i < inputArray.length; i++) {

			if (hm.containsKey(inputArray[i]))
				hm.put(inputArray[i], hm.get(inputArray[i]) + 1);
			else
				hm.put(inputArray[i], 1);
		}

		List<Map.Entry<Integer, Integer>> listOfEntry = new ArrayList<>(hm.entrySet());

		// Sort listOfEntry based on values

		Collections.sort(listOfEntry, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});

		System.out.println("Input Array : " + Arrays.toString(inputArray));

		System.out.println("Sorted Array Elements In Descending Order Of Their Frequency :");

		List<Integer> result = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : listOfEntry) {
			int frequency = entry.getValue();

			while (frequency >= 1) {
				result.add(entry.getKey());
				frequency--;
			}
		}
		return result;
	}

	public static List<Integer> sortByFrequency(int arr[]) {

		Map<Integer, Integer> map = new LinkedHashMap<>();

		for (int i : arr) {
			if (!map.containsKey(i))
				map.put(i, 1);
			else
				map.put(i, map.get(i) + 1);
		}

		List<Map.Entry<Integer, Integer>> sortList = new ArrayList<>(map.entrySet());

		Collections.sort(sortList, (o1, o2) -> {
			Integer i = o1.getValue();
			Integer j = o2.getValue();
			Integer val = j.compareTo(i);
			if (val == 0) {
				return o1.getKey().compareTo(o2.getKey());
			}
			return j.compareTo(i);
		});

		List<Integer> result = new ArrayList<>();
		for (Map.Entry<Integer, Integer> e : sortList) {
			int count = e.getValue();
			while (e.getValue() != null && count > 0) {
				result.add(e.getKey());
				count--;
			}
		}

		return result;
	}

}