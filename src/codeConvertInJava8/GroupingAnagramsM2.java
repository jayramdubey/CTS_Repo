package codeConvertInJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingAnagramsM2 {

	public static void main(String[] args) {
		//String arr[] = { "cat", "dog", "tac", "god", "act" };
		//List<List<String>> result = new ArrayList<>();
		
		MyIntra obj = ()-> {
			String words[] = { "cat", "dog", "tac", "god", "act" };
			List<List<String>> resultfun = new ArrayList<List<String>>();

			HashMap<String, ArrayList<String>> map = new HashMap<>();
			for (String word : words) {
				char[] arr2 = new char[26];
				for (char c : word.toCharArray()) {
					arr2[c - 'a']++;
				}
				String key = new String(arr2);

				if (map.containsKey(key)) {
					map.get(key).add(word);
				} else {
					ArrayList<String> al = new ArrayList<String>();
					al.add(word);
					map.put(key, al);
				}
			}

			resultfun.addAll(map.values());

			return resultfun;
			
		};
		//result = groupAnagramsBestMethods(arr);
		System.out.println(obj);

	}

	/*public static List<List<String>> groupAnagramsBestMethods(String[] words) {
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
	}*/
}
