package quistionAskInGs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupingAnagrams {

	public static void main(String[] args) {

		String arr[] = { "cat", "dog", "tac", "god", "act" };

		groupingAnagrams(arr);

	}

	private static void groupingAnagrams(String[] arr) {
		List<String> al = new ArrayList<>();
		Set set = new HashSet<>();
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				boolean res = isAnagram(arr[i], arr[j]);
				if (res == true) {
					al.add(arr[j]);
				}
			}
			List<String> tmp = new ArrayList<>();
			tmp.addAll(al);
			set.add(tmp);
			al.clear();
		}
		System.out.println(set);
	}

	private static boolean isAnagram(String string, String string2) {
		char ar1[] = string.toCharArray();
		char ar2[] = string2.toCharArray();
		int len1 = ar1.length;
		int len2 = ar2.length;

		int arCheck[] = new int[126];
		int flag = 0;

		if (len1 == len2) {
			for (int i = 0; i < len1; i++) {
				arCheck[ar1[i]] += 1;
			}
			for (int i = 0; i < len1; i++) {
				arCheck[ar2[i]] -= 1;
			}
			for (int i = 0; i < arCheck.length; i++) {
				if (arCheck[i] > 0)
					flag = 1;
			}
			for (int i = 0; i < arCheck.length; i++) {
				arCheck[i] = 0;
			}
			if (flag == 0) {
				return true;
			}

		} else {
			return false;
		}

		return false;
	}

}
