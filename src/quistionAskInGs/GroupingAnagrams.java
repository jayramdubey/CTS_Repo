package quistionAskInGs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupingAnagramsM2 {

	public static void main(String[] args) {
		String arr[] = {"eat", "tea", "tan", "ate", "nat", "bat"};

		List<List<String>> result = new ArrayList<>();
		result = groupAnagramsBestMethods(arr);
		System.out.println(result);

	}

public static List<List<String>> groupAnagramsBestMethods(String[] words) {
		List<List<String>> result = new ArrayList<List<String>>();

		HashMap<String, ArrayList<String>> map = new HashMap<>();
		for (String word : words) {
			char[] arr = new char[26];
			for (char c : word.toCharArray()) {
				arr[c - 'a']++;
			}
			String key = new String(arr);

			if (map.containsKey(key)) {
				map.get(key).add(word);
			} else {
				ArrayList<String> al = new ArrayList<String>();
				al.add(word);
				map.put(key, al);
			}
		}

		result.addAll(map.values());
		return result;
	}
}
