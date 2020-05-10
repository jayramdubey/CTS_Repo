package quistionAskInGs;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepitingChar {

	public static void main(String[] args) {

	    String str = "abcgabc";
		//String str = "xyzyxz";
		firstNonRepeatingChar(str);
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

	}
}
