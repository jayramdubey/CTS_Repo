package gs_day2;

public class DPfibonacci {

	public static void main(String[] args) {
		 int n = 9; 
		 int arr[]=fib(n);
		 for(int i=0;i<arr.length;i++){
			 System.out.print(arr[i]+" ");  
		 }
	}

	private static int[] fib(int n) {
		int feb[] = new int[n+1];
		int i=0;
		feb[0]=0;
		feb[1]=1;
		for( i=2;i<=n;i++){
			feb[i]= feb[i-1]+feb[i-2];
		}
		return feb;
	}

}
