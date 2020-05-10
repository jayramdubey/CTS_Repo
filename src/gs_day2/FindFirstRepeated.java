package gs_day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstRepeated {

	public static void main(String[] args) {

		// String str = "abcgabc";
		String str = "my name is jayram dhar dubey";
		FindFirstRepeated(str);
		firstNonRepeatingChar(str);
		Last_Repeated(str);
		Last_Non_Repeated(str);
		MostRepeatedNumber(str);
	}

	private static void MostRepeatedNumber(String str) {

		char arr[] = str.toCharArray();

		Map<Character, Integer> hm = new LinkedHashMap<>();

		for (char c : arr) {
			if (c == ' ')
				continue;
			if (hm.containsKey(c))
				hm.put(c, hm.get(c) + 1);
			else
				hm.put(c, 1);
		}
		int max = 0;
		int p = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] == ' ')
				continue;
			if (max < hm.get(arr[i])) {
				max = hm.get(arr[i]);
				p = i;
			}
		}
		System.out.println("Most Reapited charectors :" + arr[p]);
	}

	private static void Last_Non_Repeated(String str) {

		char arr[] = str.toCharArray();

		Map<Character, Integer> hm = new LinkedHashMap<>();

		for (char c : arr) {
			if (c == ' ')
				continue;
			if (hm.containsKey(c))
				hm.put(c, hm.get(c) + 1);
			else
				hm.put(c, 1);
		}

		for (int i = arr.length - 1; i > 0; i--) {

			if (hm.get(arr[i]) == 1) {
				System.out.println("Last non repiting char: " + arr[i]);
				break;
			}
		}
	}

	private static void Last_Repeated(String str) {

		char arr[] = str.toCharArray();

		Map<Character, Integer> hm = new LinkedHashMap<>();

		for (char c : arr) {
			if (c == ' ')
				continue;
			if (hm.containsKey(c))
				hm.put(c, hm.get(c) + 1);
			else
				hm.put(c, 1);
		}

		for (int i = arr.length - 1; i > 0; i--) {

			if (hm.get(arr[i]) > 1) {
				System.out.println("Last repiting char: " + arr[i]);
				break;
			}
		}
	}

	private static void firstNonRepeatingChar(String str) {

		char arr[] = str.toCharArray();

		Map<Character, Integer> hm = new LinkedHashMap<>();

		for (char c : arr) {
			if (c == ' ')
				continue;
			if (hm.containsKey(c))
				hm.put(c, hm.get(c) + 1);
			else
				hm.put(c, 1);
		}

		for (char c : arr) {
			int flag = 0;
			if (c == ' ')
				continue;
			if (hm.get(c) == 1) {
				System.out.println("First non repiting char: " + c);
				break;
			}
		}

	}

	private static void FindFirstRepeated(String str) {

		char arr[] = str.toCharArray();

		Map<Character, Integer> hm = new LinkedHashMap<>();

		for (char c : arr) {
			if (c == ' ')
				continue;
			if (hm.containsKey(c))
				hm.put(c, hm.get(c) + 1);
			else
				hm.put(c, 1);
		}

		for (char c : arr) {
			int flag = 0;
			if (c == ' ')
				continue;
			if (hm.get(c) > 1) {
				System.out.println("First repiting char: " + c);
				break;
			}
		}

	}
}
