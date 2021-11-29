package com.technoelevate.inheritance;
import java.util.Scanner;
public class ReverseAnumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int num= sc.nextInt();
	int temp ;
	int rev=0;
	while(num>0) {
		int temp1=num%10;
		num=num/10;
		rev=rev*10+temp1;
		
	}
	System.out.println(rev);
}
}
