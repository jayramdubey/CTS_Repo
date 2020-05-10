package string;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "jayramm";
		String s2 = "marayj";
		 
		boolean res= isAnagram(s1,s2);
		System.out.println("isAnagram: "+res);
	}

	private static boolean isAnagram(String s1, String s2) {
		int lenS1=s1.length();
		int lenS2=s2.length();
		if(lenS1!=lenS2){
			return false;
		}
		int flag=0;
		int tmp[]=new int[126];
		
		for(int i=0;i<lenS1;i++){
			tmp[s1.charAt(i)] +=1;
		}
		for(int i=0;i<lenS1;i++){
			tmp[s2.charAt(i)] -=1;
		}
		for(int i=0;i<tmp.length;i++){
			if(tmp[i]>0){
				flag=1;
				break;
			}
		}
		if(flag==0){
			return true;
		}
		return false;
	}

}
