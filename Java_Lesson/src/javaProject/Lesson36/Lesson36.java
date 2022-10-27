package javaProject.Lesson36;

public class Lesson36 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		SavingsAccount myAccount = new SavingsAccount(200, 5);
		
		myAccount.deposit(132.14);
		myAccount.addInterest();
		System.out.println("Final balance is: " + myAccount.getBalance());

		BankAccount secondAcc = new SavingsAccount(3, 4); // can instantiate an object using preceding class
	
		System.out.println(myAccount instanceof SavingsAccount);
		System.out.println(myAccount instanceof BankAccount);
	}

}
