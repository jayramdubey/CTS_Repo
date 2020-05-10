package gs_day8;

public class NumberIsPowerOf10 {

	public static void main(String[] args) {
		int n = 1000;
		boolean res=numberIsPowerOf10OrNot(n);
		System.out.println("Number is power of 10 or not: "+ res);
	}

	private static boolean numberIsPowerOf10OrNot(int n) {
		while (n > 9 && n % 10 == 0) {
			n /= 10;
		}
		
		return n ==1;
	}

}
