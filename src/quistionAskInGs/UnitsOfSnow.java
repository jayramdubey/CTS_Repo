package quistionAskInGs;

public class UnitsOfSnow {

	public static void main(String[] args) {
		int arr[] = { 5, 0, 6, 2, 3 };
		//int arr[] = { 6, 2, 4, 0, 6 };
		int len = arr.length;
		int res = getUnitOfSnow(arr, len);
		System.out.println("Unit of  Snow: " + res);

	}

	private static int getUnitOfSnow(int[] arr, int len) {

		int lMax[] = new int[len];
		int rMax[] = new int[len];
		int result = 0;

		lMax[0] = arr[0];
		for (int i = 1; i < len; i++)
			lMax[i] = Math.max(arr[i], lMax[i - 1]);

		rMax[len - 1] = arr[len - 1];
		for (int i = len - 2; i >=0; i--)
			rMax[i] = Math.max(arr[i], rMax[i + 1]);

		for (int i = 1; i < len; i++)
			result += (Math.min(lMax[i], rMax[i]) - arr[i]);
		return result;
	}

}
