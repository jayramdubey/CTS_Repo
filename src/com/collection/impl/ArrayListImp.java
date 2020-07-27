package com.collection.impl;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListImp {

		int SIZE = 15;
		String[] arr = new String[SIZE];
		int logicalSize = 0;
		String[] arr1;
		int temp = SIZE;

		public void add(String s) {
			logicalSize++;
			if (logicalSize == arr.length) {
				arr[logicalSize - 1] = s;
				arr = increaseSize(arr);
			}

			else {
				arr[logicalSize - 1] = s;
			}
		}

		private String[] increaseSize(String[] arr2) {

			SIZE = SIZE + SIZE / 2;
			arr1 = Arrays.copyOf(arr, SIZE);
			return arr1;

		}

		public String remove(int index) {
			String s = "";
			for (int i = index; i < logicalSize; i++) {
				if (i == index) {
					s = arr[i];

				}
				arr[i] = arr[i + 1];
			}

			return s;
		}

		public void display(int index) {
			String s = arr[index];

			System.out.println(arr[index]);
		}

		public static void main(String[] args) {
			ArrayListImp a = new ArrayListImp();
			a.add("hello1");
			a.add("hello2"); 
			a.add("hello3");
			a.add("hello4");
			a.add("hello5");
			a.add("hello6");
			a.add("hello7");
			a.add("hello8");
			a.add("hello9");
			a.add("hello10");
			a.add("hello11");
			a.add("hello12");
			a.add("hello13");
			a.add("hello14");
			a.add("hello15");
			a.add("hello16");
			a.add("hello17");
			a.add("hello18");
			a.add("hello19");
			a.add("hello20");
			a.add("hello21");
			a.add("hello22");
			a.display(21);
			a.display(14);
			a.display(15);
			System.out.println(a.remove(10));

			a.display(15);

			ArrayList list= new ArrayList<>();
			list.add(10);
			list.remove(1);
			
		}
	}