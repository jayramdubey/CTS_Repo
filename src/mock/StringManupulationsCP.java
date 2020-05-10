package mock;


import java.io.*;
import java.util.*;

/*
 * /*
 *  aabbccdcdddd-- max repeated char a-2 b-2 c-3 d-5  --> remove max repeated one       from the string--> aabbccc --> 7
    aabbcccddd --> a-2 b-2 c-3 d-3 -->  d-3 --> aabbccc --> 7
    aabbccdd  --> a-2 b-2 c-2 d-2 --> aabbcc -->6
 */


public class StringManupulationsCP {
  public static void main(String[] args) {
    String str="aabbccddeeeeeee";
    int result1= method1(str);
    int result2= method2(str);
    System.out.println("After delete char length using 1st Methods : "+result1);
    System.out.println("After delete char length using 2nd Methods: "+result2);
  }
  
  public static int method1(String str){
    
    char ar1[]=str.toCharArray();
    int len= ar1.length;
    
    int ar2[]= new int[26];
    int size= ar2.length;
    for(int i=0;i<len;i++){
      ar2[ar1[i]-'a']++;
    }
    int max=0;
     for(int i=0;i<size;i++){
      if(max<ar2[i])
        max = ar2[i];
    }
      for(int i=size-1;i>0;i--){
      if(ar2[i]==max){
        ar2[i] -=max;
      }
    }
    int result= len -max;
    
    return result;
  }
  
   public static int method2(String str){
    char ar1[]=str.toCharArray();
    int len= ar1.length;
     
     Map<Character, Integer> hm = new HashMap<>();
      for (char c : ar1) {
      if (c == ' ')
        continue;
      if (hm.containsKey(c))
        hm.put(c, hm.get(c) + 1);
      else
        hm.put(c, 1);
    }
     int max=0;
      for(int i=0;i<len;i++){
           if(hm.get(ar1[i])>max){
             max = hm.get(ar1[i]);
           }
    }
    

     
     int result= len -max;
     return result;
   }
  
}
