package quistionAskInGs;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepitingChar {

	public static void main(String[] args) {

	    String str = "abcgabc";
		//String str = "xyzyxz";
		firstNonRepeatingChar(str);
		System.out.println(firstNonRepeating(str));
	}

	private static char  firstNonRepeatingChar(String str) {
		if(str==null)
			return 0;

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
		int flag=0;
		for (char c : arr) {
			
			if (c == ' ')
				continue;
			if (hm.get(c) == 1) {
				flag=1;
				System.out.println("First non repiting char: " + c);
			}
		}
		if(flag==0){
			System.out.println("There is not repiting char: ");
		}
		return 0;

	}
	public static char firstNonRepeating(String word){
      	if(word==null)
			return 0;

       char arr[] = word.toCharArray();

		Map<Character, Integer> hm = new LinkedHashMap<>();

		for (char c : arr) {
			if (hm.containsKey(c))
				hm.put(c, hm.get(c) + 1);
			else
				hm.put(c, 1);
		}
		for (char c : arr) {
			if (hm.get(c) == 1) {
			    return c;
			}
		}
		return 0;
	}
}
