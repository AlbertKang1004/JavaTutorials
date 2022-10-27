package javaProject.Lesson44;

import java.util.*;
import java.text.*;

public class Lesson44_project {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
		String name;
		ArrayList<BankAccount> aryLst = new ArrayList<>();
		ListIterator<BankAccount> iter = aryLst.listIterator();
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the name to whom the accoount belongs. (\"Exit\" to abort)");
			name = sc.nextLine();

			if (!name.equalsIgnoreCase("EXIT")) {
				System.out.println("Please enter the amount of the deposit.");
				double amount = sc.nextDouble();
				System.out.println();
				BankAccount ba = new BankAccount(name, amount);
				iter.add(ba);
			}
		} while (!name.equalsIgnoreCase("EXIT"));

		BankAccount ba = iter.previous();
		double maxBalance = ba.balance;
		String maxName = ba.name;
		while (iter.hasPrevious()) {
			BankAccount temp = iter.previous();
			if (temp.balance > maxBalance) {
				maxBalance = temp.balance;
				maxName = temp.name;
			}
		}
		System.out.println("The account with the largest balance belongs to " + maxName + ".");
		System.out.println("The amount is $" + formatter.format(maxBalance) + ".");
	}

}
