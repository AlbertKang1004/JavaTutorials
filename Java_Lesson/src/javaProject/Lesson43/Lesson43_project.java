package javaProject.Lesson43;

import java.util.*;
import java.text.*;

public class Lesson43_project {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
		String name;
		ArrayList<BankAccount> aryLst = new ArrayList<>();
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the name to whom the accoount belongs. (\"Exit\" to abort)");
			name = sc.nextLine();
			
			if (!name.equalsIgnoreCase("EXIT")) {
				System.out.println("Please enter the amount of the deposit.");
				double amount = sc.nextDouble();
				System.out.println();
				BankAccount ba = new BankAccount(name, amount);
				aryLst.add(ba);
			}
		} while (!name.equalsIgnoreCase("EXIT"));
		
		BankAccount ba = aryLst.get(0);
		double maxBalance = ba.balance;
		String maxName = ba.name;
		for (int j = 1; j < aryLst.size(); j++) {
			if (aryLst.get(j).balance > maxBalance) {
				maxBalance = aryLst.get(j).balance;
				maxName = aryLst.get(j).name;
			}
		}
		System.out.println("The account with the largest balance belongs to " + maxName+ ".");
		System.out.println("The amount is $" + formatter.format(maxBalance) + ".");
	}

}
