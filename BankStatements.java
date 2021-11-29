package com.technoelevate.inheritance;

public class BankStatements {
	private int availableBal;
	private int depositBal;
	private int withdrawBal;
	private int pin = 1234;
	public void setDepositBal(int depositBal, int pin) {
		if (this.pin == pin) {
			this.depositBal = depositBal;
			availableBal = availableBal + depositBal;
			getAvailable(pin);
		} else {
			System.out.println("Incorrect PIN Number");
		}
	}
public void setWithdrawBal(int withdrawBal, int pin) {
		this.withdrawBal = withdrawBal;
		if (this.pin == pin) {
			if (withdrawBal <= availableBal) {
				availableBal = availableBal - withdrawBal;
			} else {
				System.out.println(" Insuffiacent Balance Please Withdraw below Available Amount ");
			}
			getAvailable(pin);
		} else
			System.out.println("Incorrect PIN Number");
	}
	public void getAvailable(int pin) {
			System.out.println("Available Balance  Amount   "+availableBal);
	}
}
