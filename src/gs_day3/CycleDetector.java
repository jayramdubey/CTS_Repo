package gs_day3;

import java.util.HashMap;
import java.util.Map;

public class CycleDetector {
	private static Map<Integer, Integer> visitedElements = new HashMap<>();
	private static int counter = 0;

	public static void main(String[] args) {
		int arr[] = {1, 3, 0, 4, 1 };
		int len = arr.length;
		int res = countCycles(arr, len);
		System.out.println(res);

	}

	public static int countCycles(int[] data, int len) {
	    int[] counters = new int[len];
	    int index = 0;
	    int count = 0;
	    while(counters[index] == 0) {
	        counters[index] = count++;
	        index = data[index];
	    }
	    return count - counters[index];
	}
}
