package com.technojava1;

import java.util.Scanner;

public class AmstrongMethod {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int ams = sc.nextInt();
int original =ams;
int tr=0;
while(ams>0) {
	int temp = ams%10;
	ams=ams/10;
	tr= tr+(temp*temp*temp);
}
if (tr==original) {
	System.out.println("given number is amstrong");
}
else {
	System.out.println("given number is not amstrong");
}
	}

}
