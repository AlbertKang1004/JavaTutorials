package javaProject.Lesson45;

import java.util.*;

public class Lesson45 {

	public static void main(String[] args) {
		Integer x = 5;
		Integer y = 17;
		System.out.println(x.compareTo(y)); // negative -> smaller

		Double a = 52.5;
		Double b = 11.8;
		System.out.println(a.compareTo(b)); // positive -> bigger
		BankAccount acc1 = new BankAccount("Albert", 200.0);
		BankAccount acc2 = new BankAccount("Robust", 123.0);
		BankAccount acc3 = new BankAccount("Haboo", 588.0);
		BankAccount[] accounts = {acc1, acc2, acc3};
		Arrays.sort(accounts);
		for (BankAccount d : accounts) {
			System.out.printf("Name: %s \tBalance: $%.2f\n", d.name, d.balance);
		}
		
		
	}
}
