package mock;

import java.io.*;
import java.util.*;

/*
 *Given a sorted and rotated array, find if there is a pair with a given sum
Given an array that is sorted and then rotated around an unknown point. Find if the array has a pair with a given sum ‘x’. It may be assumed that all elements in the array are distinct.
Examples :

Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
Output: true
There is a pair (6, 10) with sum 16

Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 35
Output: true
There is a pair (26, 9) with sum 35

Input: arr[] = {11, 15, 26, 38, 9, 10}, x = 45
Output: false
There is no pair with sum 45.

NOTE: SOLVE IN O(N) complexity  *********
 */

public class SerchSumOfElementISThreOrNotCP {
	public static void main(String[] args) {
		int arr[] = { 11, 15, 6, 8, 9, 10 };
		int x = 26;
		System.out.println(isPairExists(arr, x));

	}

	public static boolean isPairExists(int arr[], int x) {

		Set<Integer> hs = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
		int diff = 0;
		for (int i = 0; i < arr.length; i++) {
			diff = x - arr[i];
			if (hs.contains(diff)) {
				return true;
			}
		}

		return false;
	}
}
