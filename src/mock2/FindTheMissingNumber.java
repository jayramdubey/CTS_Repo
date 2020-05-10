package mock2;

public class FindTheMissingNumber {

	public static void main(String[] args) {

		int ar[] = {0,1,2,3,4,7,9};
		int n= ar.length;
		int size = ar[n-1];
		int tmp[]= new int[size];
		for(int i=0;i<ar.length-1;i++){
			tmp[ar[i]] +=1;
		}
		System.out.print("{ ");
		for(int i=0;i<size;i++){
			if(tmp[i]!=1)
			System.out.print(i+" ");
		}
		System.out.print("}");
	}

}
