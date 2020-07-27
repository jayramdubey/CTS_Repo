package jpmc;

public class IsAnagramOrNot {

	public static void main(String[] args) {
		String s1 = "night ";
		String s2 = "Eigthn";
		isAnagramOrNot(s1, s2);
	}

	private static void isAnagramOrNot(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		int flag = 0;
		if (l1 != l2){
			System.out.println("Not Anagram");
			return;
		}
			
		int arr[] = new int[256];
		for (int i = 0; i < l1; i++) {
			arr[s1.charAt(i)]++;
		}
		for (int i = 0; i < l2; i++) {
			arr[s2.charAt(i)]--;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				flag = 1;
		}
		if (flag == 1)
			System.out.println("Not Anagram");
		else
			System.out.println("Anagram");
	}
}
