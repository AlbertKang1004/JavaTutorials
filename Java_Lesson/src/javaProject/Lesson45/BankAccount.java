package javaProject.Lesson45;

public class BankAccount implements Comparable<BankAccount> {
	public BankAccount(String nm, double amt) {
		name = nm;
		balance = amt;
	}

	public void deposit(double dp) {
		balance = balance + dp;
	}

	public void withdraw(double wd) {
		balance = balance - wd;
	}
//  @override
//	public int compareTo(BankAccount otherAccount) {
//
//		int retValue;
//		if (balance < otherAccount.balance) {
//			retValue = 1;
//		} else if (balance == otherAccount.balance) {
//			retValue = 0;
//		} else {
//			retValue = -1;
//		}
//		return retValue;
//	}
	@Override
	public int compareTo(BankAccount otherAccount) {
		if (name.compareTo(otherAccount.name) > 0) return 1;
		else if (name.compareTo(otherAccount.name) == 0) return 0;
		else return -1;
	}

	public String name;
	public double balance;
	
}
