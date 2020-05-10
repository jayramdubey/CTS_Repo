package array;

public class ReverseArrays {

	public static void main(String[] args) {
		
		int arr[]={20,10,5,8,30,15};
		int low=0, high=arr.length-1;
		while(low<high){
			int tmp=arr[low];
			arr[low]=arr[high];
			arr[high]=tmp;
			low++;
			high--;
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}

	}

}
