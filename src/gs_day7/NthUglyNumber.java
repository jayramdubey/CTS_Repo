package gs_day7;

import java.util.Scanner;

public class NthUglyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = nthUglyNumber(num);
		System.out.println("Next ugly number: "+result);

	}
	public static int nthUglyNumber(int n) {
	       
        int []arr = new int[n];
        arr[0] = 1;
        int index_of_2 = 0;
        int index_of_3 = 0;
        int index_of_5 = 0;
        for(int i=1;i<n;i++){
            arr[i] = Math.min(arr[index_of_2]*2,Math.min(arr[index_of_3]*3, arr[index_of_5]*5));
            if(arr[i] == arr[index_of_2]*2){
                index_of_2++;
            }
            if(arr[i] == arr[index_of_3]*3){
                index_of_3++;
            }
            if(arr[i] == arr[index_of_5]*5){
                index_of_5++;
            }
        }
        return arr[n-1];  
    }
}
