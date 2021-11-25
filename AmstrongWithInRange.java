package com.technojava1;

import java.util.Scanner;

public class AmstrongWithInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter starting value");
		int start = sc.nextInt();
		System.out.println("enter ending value");
		int end = sc.nextInt();
		for (int i = start; i <= end; i++) {
			int original = i;
			int n = i;
			int sum= 0;
            while (n > 0) {
				int temp = n % 10;
				n = n / 10;
				sum = sum + (temp * temp * temp);
			}
			if (sum == original) {
				System.out.println(sum);
				System.out.println("given number is amstrong");
			}
		}
	}
}
