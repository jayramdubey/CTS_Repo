package mock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinWindowSubStriing {
	
    public static void main(String arg[]){
    	String s = "ADOBECODEBANC";
    	String t = "ABC";
    	findMinWinSbString(s, t);
    	
/*    	
    	String result2= minWindow(s, t);
    	System.out.println(result2);*/
    }
    
    private static void findMinWinSbString(String s, String t) {
		char[] ch = t.toCharArray();
		int start=0,end=0;
		int min=Integer.MAX_VALUE;
		int count =0;
		List<Character> temp = new ArrayList<>();
		for(char c : ch) {
			temp.add(c);
		}
		
		for(int i=0;i<s.length();i++)
		{
			List<Character> list = new ArrayList<>(temp);
			int j=i;
			while(j<s.length() && list.size()>0) {
				if(list.contains(s.charAt(j))) {
					Character c = new Character(s.charAt(j));
					list.remove(c);
				}
				j++;
				count++;
			}
			
			if(count<min && list.size()==0) {
				min =count;
				start = i;
				end = j;
			}
			count=0;
		}
		
		System.out.println("MinWindowSubstring : "+s.substring(start,end));
	}

    
    
    public static String minWindow(String s, String t) {
		if (s.length() == 0 || t.length() == 0) {
			return "";
		}
		Map<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < t.length(); i++) {
			int count = hm.getOrDefault(t.charAt(i), 0);
			hm.put(t.charAt(i), count + 1);
		}

		int required = hm.size();
		int left = 0, right = 0;
		int formed = 0;

		Map<Character, Integer> hmWC = new HashMap<>();

		int[] ans = { -1, 0, 0 };

		while (right < s.length()) {

			char c = s.charAt(right);
			int count = hmWC.getOrDefault(c, 0);
			hmWC.put(c, count + 1);

			if (hm.containsKey(c) && hmWC.get(c).intValue() == hm.get(c).intValue()) {
				formed++;
			}

			while (left <= right && formed == required) {
				c = s.charAt(left);
				if (ans[0] == -1 || right - left + 1 < ans[0]) {
					ans[0] = right - left + 1;
					ans[1] = left;
					ans[2] = right;
				}

				hmWC.put(c, hmWC.get(c) - 1);
				if (hm.containsKey(c) && hmWC.get(c).intValue() < hm.get(c).intValue()) {
					formed--;
				}
				left++;
			}
			right++;
		}
		return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
	}
}