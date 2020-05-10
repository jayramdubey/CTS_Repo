package gs_day3;

public class ClimbStaircaseDP {

	public static void main(String[] args) {
		int n = 4;
		int result = findSteps(n);
		System.out.println("Total steps: "+ result);
	}

	private static int findSteps(int n) {
		int res[] = new int[n+1];
		res[0]=1;
		res[1]=1;
		res[2]=2;
		
		for(int i=3;i<=n;i++){
			res[i]= res[i-1]+res[i-2]+res[i-3];
		}
		return res[n];
	}

}
