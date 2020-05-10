package gs_day9;

public class ReverseWordsInAGivenString {

	public static void main(String[] args) {
		String str = "my name is jayram dhar dubey";
		
		
		reverseWordsInAGivenString(str);
	}

	private static void reverseWordsInAGivenString(String str) {
		
		String words[] = str.split(" ");
		String result="";
		for(String word : words){
			String res = "";
			for(int i= word.length()-1;i>=0;i--){
				res+=word.charAt(i);
				
			}
			result += res+" ";
		}
		System.out.println(result);
		
	}

}
