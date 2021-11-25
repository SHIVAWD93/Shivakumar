package com.technojava1;

import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("enter the values");
		for (int i = 0; i <  arr.length; i++) {
			arr[i] = sc.nextInt() ;
		}		
		display(arr);
		for (int k = 0; k < 5; k++) {
			System.out.println(arr[k]);
		}
		}
		public static int[] display(int arr[]) {
		int temp; 
		for (int i = 0; i< arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		return arr;
	}
}
