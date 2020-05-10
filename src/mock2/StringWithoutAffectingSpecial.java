package mock2;

/*Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.  
Only subsequence "abc" is reversed
Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"*/

public class StringWithoutAffectingSpecial {

	public static void main(String[] args) {
       String str = "Ab,c,de!$";
       int len=str.length();
       solutions(str, len);
	}

	private static void solutions(String str, int len) {
      
		char chAr[]=str.toCharArray();
		int i=0,j=len-1;
		while(i<j){
			if(!Character.isAlphabetic(chAr[i]))
				i++;
			else if(!Character.isAlphabetic(chAr[j]))
				j--;
			else{
				char tmp=chAr[i];
				chAr[i] = chAr[j];
				chAr[j]=tmp;
				i++;j--;
			}
		}
		for(i=0;i<len;i++){
			System.out.print(chAr[i]);
			
		}
	}

}
