package javaProject.Lesson15;

public class BankAccount {
	public double balance;
	public String name;
	
	public BankAccount(double b, String s) {
		balance = b;
		name = s;
	}
	
	public void deposit(double add) {
		balance += add;
	}
	
	public void withdraw(double sub) {
		balance -= sub;
	}
}
