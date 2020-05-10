package test;

import java.io.*;
import java.util.*;

/*
Jayram
 *Find the longest sub string and return its start index and length
 E.g,: input = "abbbccda"output = [1,3]
 Testcases were
 1) input = "", output = [-1,0]
 2) input = "100001011", output = [1,4]
 3) input = "aabbbbbCDaA", output = [2,5]

 */

class LenthOfUnitStrin {
  public static void main(String[] args) {
    
   String input="aabbbbbCDaA";
   // String input="";
   int longestSubString[]=getLongestSubString(input);
    System.out.println(Arrays.toString(longestSubString));
  }
  public static int[] getLongestSubString(String str){
    
   int len = str.length();
    int max=0;
    int p=0;
    int start=0;
    int end=0;
    for (int i = 0; i < len; i++) {
      int count = 1;
        p=i;
      while (i < len - 1 && str.charAt(i) == str.charAt(i + 1)) {
        count++;
        i++;
      }
      if(max<count){
          max=count;
          start=p;
          end=i;
        }
    }
    int arr[]={start,max};
	return arr;
   
    
  }
  }

