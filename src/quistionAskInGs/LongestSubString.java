package quistionAskInGs;

public class LongestSubString {

	public static void main(String[] args) {

		//String str = "aabbbbbccd";
		String str = "abbbbccccd";
		longestSubString(str);
	}

	private static void longestSubString(String str) {

		if (str.length() == 0) {
			System.out.println("[" + -1 + "," + 0 + "]");
		} else {
			int len = str.length();
			int max = 0, s = 0;
			for (int i = 0; i < len; i++) {
				int count = 1;
				while (i < len - 1 && str.charAt(i) == str.charAt(i + 1)) {
					count++;
					i++;
				}
				if (max < count) {
					max = count;
					s = i - max + 1;
				}
			}
			System.out.println("[" + s + "," + max + "]");
		}
	}

}
