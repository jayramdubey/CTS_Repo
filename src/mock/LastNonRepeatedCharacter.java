package mock;

import java.util.LinkedHashMap;
import java.util.Map;

public class LastNonRepeatedCharacter {

	public static void main(String[] args) {
		String str = "my name is jayram dhar dubey";
		Map<Character, Integer> hm = new LinkedHashMap<>();
		char arr[] = str.toCharArray();

		for (char c : arr) {

			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				if (c == ' ') {
					continue;
				}
				hm.put(c, 1);
			}
		}
		int len = arr.length - 1;
		for (int i = len; i >= 0; i--) {

			if (hm.get(arr[i]) == 1) {
				System.out.println("First non repeated characted in String is:  " + arr[i]);
				break;
			}
		}
	}

}
