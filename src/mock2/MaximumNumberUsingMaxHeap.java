package mock2;

/*
{4, 10, 3, 5, 1}

      4
    /  \
   10  3
  / \
 5  1
*/
/*
Input:
    array = [4, 10, 3, 5, 1]    K = 2
Output:
    10 5
 
Input:
    array = [4, 10, 3, 5, 1]    K = 5
 
Output: 10 5 4 3 1
 
Input:
    array = [4, 10, 3, 5, 1]    K = 0
 
Output:
 
 
 */
public class MaximumNumberUsingMaxHeap {

	public static void main(String[] args) {
		int[] array = { 4, 10, 3, 5, 1 };
		new MaximumNumberUsingMaxHeap().printMaxKElements(array, 1);
	}

	public void printMaxKElements(int data[], int k) {
		int len = data.length;
		if (k > len) {
			System.out.println("Invalid k size");
			return;
		}

		for (int i = len / 2 - 1; i >= 0; i--) {
			maxHeapify(i, data, len);
		}

		for (int i = data.length - 1; i >= data.length - k; i--) {
			System.out.print(data[0] + " ");
			int temp = data[0];
			data[0] = data[i];
			data[i] = temp;

			maxHeapify(0, data, i);
		}
	}

	private int leftChild(int i) {
		return 2 * i + 1;
	}

	private int rightChild(int i) {
		return 2 * i + 2;
	}

	private void maxHeapify(int i, int[] data, int size) {
		int largestElementIndex = i;

		int leftChildIndex = leftChild(i);
		if (leftChildIndex < size && data[leftChildIndex] > data[largestElementIndex]) {
			largestElementIndex = leftChildIndex;
		}

		int rightChildIndex = rightChild(i);
		if (rightChildIndex < size && data[rightChildIndex] > data[largestElementIndex]) {
			largestElementIndex = rightChildIndex;
		}

		if (largestElementIndex != i) {
			int swap = data[i];
			data[i] = data[largestElementIndex];
			data[largestElementIndex] = swap;

			maxHeapify(largestElementIndex, data, size);
		}
	}

}