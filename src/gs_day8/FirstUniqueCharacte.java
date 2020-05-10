package gs_day8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacte {

	public static void main(String[] args) {
		String str= "Jayram dha rdubey";
		uniqueChar(str);
	}

	private static void uniqueChar(String str) {
      
		Map<Character, Integer> hm = new LinkedHashMap<>();
		for(char c: str.toCharArray()){
			if(c==' ')
				continue;
			if(hm.containsKey(c))
				hm.put(c, hm.get(c)+1);
			else
				hm.put(c, 1);
		}
		for(char c: str.toCharArray()){
			if(hm.get(c)==1)
				System.out.println("FirstUniqueCharacte: "+ c);
			break;
		}
		
	}

}
