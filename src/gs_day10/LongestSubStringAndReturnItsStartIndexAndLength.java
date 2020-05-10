package gs_day10;

public class LongestSubStringAndReturnItsStartIndexAndLength {
	public static void main(String arg[]){
		String str ="aabbbbbCDaA";
		LongestSubStringAndReturnItsStartIndexAndLength(str, str.length());
		
	}

	private static void LongestSubStringAndReturnItsStartIndexAndLength(String str, int n) {
	
		int max=0, start=0;
		for(int i=0;i<n;i++){
			int count =1;
			int p =i;
			while(i<n-1 && str.charAt(i)==str.charAt(i+1)){
				
				count ++;
				i++;
			}
			if(max<count){
				start =p;
				max=count;
			}
		}
		System.out.println("Maximum sub string: " +"(" +start +", "+max+")");
		
		
	}

}
