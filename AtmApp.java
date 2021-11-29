package com.technoelevate.inheritance;

import java.util.Scanner;

public class AtmApp {
	public static void main(String[] args) {
		BankStatements bs = new BankStatements();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PIN Number");
		int pinNumber = sc.nextInt();
		System.out.println("enter the deposit Amount");
		int depositAmount = sc.nextInt();
		bs.setDepositBal(depositAmount, pinNumber);
int sample =sc.nextInt();
		System.out.println("enter the WithDraw Amount");
		int withDrawAmount = sc.nextInt();
		bs.setWithdrawBal(withDrawAmount, pinNumber);
		// bs.setWithdrawBal(500, 1234);
		// bs.setWithdrawBal(1500, 1234);
		// bs.setWithdrawBal(11500, 1234);
		// bs.setWithdrawBal(1000, 1234);
		// bs.setWithdrawBal(1000, 1234);
		// bs.setWithdrawBal(10000, 1234);

	}

}
