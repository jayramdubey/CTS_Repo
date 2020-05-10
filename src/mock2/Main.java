package mock2;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(7, 4, 6, 3, 9, 1);
		int k = 1;

		System.out.println("K'th largest element in the array is " + FindKthLargest(list, k));
	}

	public static int FindKthLargest(List<Integer> list, int k) {

		PriorityQueue<Integer> pq = new PriorityQueue<>(list.subList(0, k));

		for (int i = k; i < list.size(); i++) {
			if (list.get(i) > pq.peek()) {
				pq.poll();
				pq.add(list.get(i));
			}
		}
		return pq.peek();
	}
}