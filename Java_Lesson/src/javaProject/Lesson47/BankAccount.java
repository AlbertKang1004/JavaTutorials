package javaProject.Lesson47;

public class BankAccount implements Comparable<BankAccount> {
	public BankAccount(String nm, double amt) {
		name = nm;
		balance = amt;
		accountCounter++;
		accountID = accountCounter;
	}

	public void deposit(double dp) {
		balance = balance + dp;
	}

	public void withdraw(double wd) {
		balance = balance - wd;
	}

	@Override
	public int compareTo(BankAccount otherAccount) {

		int retValue;
		if (balance < otherAccount.balance) {
			retValue = 1;
		} else if (balance == otherAccount.balance) {
			retValue = 0;
		} else {
			retValue = -1;
		}
		return retValue;
	}

	public String name;
	public double balance;
	private static int accountCounter = 0;
	public int accountID;

}
