package string;

public class PermutationOfString {

	public static void main(String[] args) {
		String str = "ABC";
		int len = str.length() - 1;
		PermutationOfString permutation = new PermutationOfString();
		System.out.println("Permutation of given String: ");
		permutation.printString(str, 0, len);

	}

	private void printString(String str, int i, int n) {
		
		if (i == n) {
			System.out.println(str);
		} else {
			for (int j = i; j <= n; j++) {
				str = swap(str, i, j);
				printString(str, i + 1, n);
				str = swap(str, i, j);
			}
		}

	}

	private static String swap(String str, int i, int j) {
		char tmp;
		char crArr[] = str.toCharArray();
		tmp = crArr[i];
		crArr[i] = crArr[j];
		crArr[j] = tmp;
		return String.valueOf(crArr);
	}

}
