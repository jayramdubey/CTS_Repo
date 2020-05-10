package gs_day2;

public class Factorials {

	public static void main(String[] args) {
		int n=6;
		int res = factorials(n);
		System.out.println(res);
	}

	private static int factorials(int n) {
		if(n==1 || n==0){
			return 1;
		}
		
		return n*factorials(n-1);
	}

}
