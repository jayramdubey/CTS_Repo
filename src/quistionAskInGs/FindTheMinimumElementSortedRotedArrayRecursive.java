package quistionAskInGs;

public class FindTheMinimumElementSortedRotedArrayRecursive {

	public static void main(String[] args) {
		//int arr[] = {4,5,6,7,1,2,3 };
		int arr[] = {4,5,6,0,1,2,3};
		int n = arr.length;
		int result = findminimum(arr, 0, n - 1);
		System.out.println("element is on pos: "+result+" element is: "+arr[result]);
	}

	private static int findminimum(int[] arr, int low, int high) {

		if (low > high)
			return 0;
		if (low == high)
			return low;
		int mid = (low + high) / 2;

		if (arr[mid] > arr[mid + 1] && mid < high)
			return mid + 1;
		if (arr[mid] < arr[mid - 1] && mid > low)
			return mid;
		if (arr[mid] < arr[high])
			return findminimum(arr, low, mid - 1);
		return findminimum(arr, mid + 1, high);

	}

}
