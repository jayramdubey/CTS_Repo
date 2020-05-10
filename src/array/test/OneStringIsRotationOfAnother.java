package array.test;

import java.util.Scanner;

public class OneStringIsRotationOfAnother {
	public static void main(String arg[]){
		String s1 = "banana";
        String s2 = "anaban";
        isRotaionOrNot(s1,s2);
	}

	private static void isRotaionOrNot(String s1, String s2) {
		if(s1.length()!=s2.length()){
			System.out.println("s2 is not rotated version of s1 ");
		}else{
			String s3= s1+s2;
			if(s3.contains(s2)){
				System.out.println("s2 is rotated version of s1 ");
			}else
				System.out.println("s2 is not rotated version of s1 ");
		}
	}

}
