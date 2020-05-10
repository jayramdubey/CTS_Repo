package mock;

import java.util.HashSet;
import java.util.Set;

// I/P: {1,2,3} then O/P: 2 
//I/P: {1,1,2,2} then O/P: 2 

public class CountTheElements {

	public static void main(String[] args) {

		int ar[] = { 1, 1, 2, 2 };
		int lengthOfArr = ar.length;
		printDublicate(ar, lengthOfArr);
	}

	private static void printDublicate(int[] ar, int len) {
		Set<Integer> hs = new HashSet<>();
		for (int i = 0; i < len; i++) {
			hs.add(ar[i]);
		}

		int arrkey = 0;
		int count = 0;

		for (Integer itr : hs) {
			arrkey = itr + 1;
			if (hs.contains(arrkey)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
