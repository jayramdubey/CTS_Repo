package lembdaexpresions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingAnagramsM2 {

	public static void main(String[] args) {
		String arr[] = { "cat", "dog", "tac", "god", "act" };

		List<List<String>> result = new ArrayList<>();
		
		result = groupAnagramsBestMethods(arr);
		System.out.println(result);
		
/*		result = groupingAnagrams(arr);
		System.out.println(result);*/

	}

	public static List<List<String>> groupAnagramsBestMethods(String[] words) {
		
		List<List<String>> result = new ArrayList<>();

		HashMap<String, ArrayList<String>> map = new HashMap<>();

		for (String word : words) {
			ArrayList<String> list;
			
			char[] arr = new char[26];
			for (char c : word.toCharArray()) {
				arr[c - 'a']++;
			}
			String key = new String(arr);

			if (map.containsKey(key)) {
				list = map.get(key);// or map.get(key).add(word);
				list.add(word);
			} else {
				list = new ArrayList<String>();
				list.add(word);
				map.put(key, list);
			}
		}

		result.addAll(map.values());

		return result;
	}

	private static List<List<String>> groupingAnagrams(String[] input) {

		List<String> inputList = Arrays.asList(input);
		List<List<String>> res = new ArrayList<>();
		
		Map<String, List<String>> resmap = inputList.stream()
				.collect(Collectors.groupingBy(s -> {
					
			            char[] c = s.toCharArray();
			                       Arrays.sort(c);
			                       return new String(c);
		}, 
						
		Collectors.mapping(Function.identity(), Collectors.toList())));
		resmap.forEach((k, v) -> res.add(v));
		return res;
	}

}
