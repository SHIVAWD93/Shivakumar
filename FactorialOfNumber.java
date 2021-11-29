package com.technoelevate.inheritance;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int fact = 5;
		int num =1;
		for(int i=fact;i>0;i--) {
			num = i*num;
		}
System.out.println(num);
	}

}
