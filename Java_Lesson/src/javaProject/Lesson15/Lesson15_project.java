package javaProject.Lesson15;

public class Lesson15_project {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount(1000, "Sally Jones");
		myAccount.deposit(505.22);
		System.out.println(myAccount.balance);
		myAccount.withdraw(100);
		System.out.println("The " + myAccount.name + " account balance is, $" + myAccount.balance);

		BankAccount acc = new BankAccount(10, "Sally");
		acc.deposit(5000);
		acc.withdraw(acc.balance / 2);
		System.out.println(acc.balance); // 2505.0
	}

}
