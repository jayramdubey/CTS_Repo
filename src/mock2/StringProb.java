package mock2;

import java.util.ArrayList;
import java.util.List;

/*How to check if a String contains only digits  Or not ? If digits found then convert those to binary format then add to list.

Ex : "krishna" o/p : No digit Found
"Krish7CTS8" o/p : {111,1000}
*/
public class StringProb {

	public static void main(String[] args) {

		String str = "Krish7CTS8";
		int len = str.length();
		findNumber(str, len);
	}

	private static void findNumber(String str, int len) {

		int tmp[] = new int[126];
		for (char c : str.toCharArray()) {
			tmp[c]++;
		}
		List<String> result = new ArrayList<>();
		String binary = "";
		for (int i = 48; i <= 57; i++) {
			if (tmp[i] == 1) {
				int val = Character.getNumericValue(i);
				while (val != 0) {
					binary = (val % 2) + binary;
					val = val / 2;
				}
				result.add(binary);
				binary = "";
			}
		}
		System.out.println(result);

	}

}
