package javaProject.Lesson36;

public class BankAccount {
	
	public BankAccount(double amt) // Constructor
	{
		balance = amt;
	}
	
	public double getBalance() {
		 return balance;
	}
	
	public void deposit(double d) {
		
	}
	
	public void withdraw(double d) {
		
	}
	
	
	private double balance; // not getting inherited
}
