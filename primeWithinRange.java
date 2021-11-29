package com.technoelevate.inheritance;

public class primeWithinRange {

	public static void main(String[] args) {
		int count;
		int num1;
		int start = 3;
		int end = 27;
		for (int i = start; i <= end; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}

			}
			if (count == 0) {
				System.out.println(i);

			}
		}
	}

}
