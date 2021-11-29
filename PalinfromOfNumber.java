package com.technoelevate.inheritance;

public class PalinfromOfNumber {

	public static void main(String[] args) {
		int num = 121;
		int ori =num;
		int num2 = 0;
		while (num > 0) {
			int num1 = num % 10;
			num = num / 10;
			num2 = num2 * 10 + num1;
		}
		if (num2 == ori) {
System.out.println("palindrome");
		} 
		else {
			System.out.println("not a palindrome");
		}

	}
}
