package gs_day3;


//We have given a anagram string and we have to check whether it can be made palindrome o not.

public class AnagramOfWordIsPalindromeOrNot {
	public static void main(String arg[]){

		String str = "aaaaddde";
		boolean res= isPalindromeOrNot(str);
		System.out.println("pelindrom or not: "+res);
	}

	private static boolean isPalindromeOrNot(String str) {
		
		int arr[] = new int[26];
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			arr[ch-'a']++;
		}
		int odd=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2 !=0){
				odd++;
			}
			if(odd>1){
				return false;
			}
	
		}
		return true;
	}
	

}
