package gs_day3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringCompression {

	public static void main(String[] args) {
		String str = "abcabcd";
		
		String result = findThlenthPrint(str);
		System.out.println(result);
		
		String result2 = findThlenthPrint2ndMethod(str);
		System.out.println(result2);
	}

	private static String findThlenthPrint2ndMethod(String str) {
		int len = str.length();
		int ar2[]=new int[126];
		for (int i = 0; i < len; i++) {
			ar2[str.charAt(i)]++;
		}
	String res="";
		for (int i = 65; i < ar2.length; i++) {
			if(ar2[i]>0)
			res += (char)i +""+ar2[i];
		}
		return res;
	}

	private static String findThlenthPrint(String str) {

		int len = str.length();
		Map<Character, Integer> hm = new LinkedHashMap<>();

		for (int i = 0; i < len; i++) {
			if (hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
			} else {
				hm.put(str.charAt(i), 1);
			}
		}
		String result="";
		Set<?> set= hm.entrySet();
		Iterator itr= set.iterator();
		while(itr.hasNext()){
			Map.Entry<Character, Integer> entry=  (Entry<Character, Integer>) itr.next();
			result+=entry.getKey().toString()+""+entry.getValue();
		}
		return result;
	}

}
