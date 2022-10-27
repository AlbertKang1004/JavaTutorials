package javaProject.Lesson45;

import java.util.*;
import java.text.*;

public class Lesson45_project {

	@SuppressWarnings({ "resource", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
		String name;
		BankAccount[] ba = new BankAccount[5];
		for (int j = 0; j < ba.length; j++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter the name to whom the account belongs. ");
			name = sc.nextLine();

			System.out.print("Please enter the amount of the deposit. ");
			double amount = sc.nextDouble();
			System.out.println();
			ba[j] = new BankAccount(name, amount);

		}

		Comparator comp = new BankAccount_comp();
		Arrays.sort(ba, comp);
		for (BankAccount b : ba)
			System.out.printf("%s >>> %.2f\n", b.name, b.balance);
	}

}
