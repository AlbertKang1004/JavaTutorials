package javaProject.Lesson47;

import java.util.*;
import java.text.*;

public class Lesson47_project {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);

		BankAccount ba;
		Map<Integer, BankAccount> accounts = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < 4; j++) {
			System.out.print("Please enter the name to whom the account belongs. ");
			String name = sc.nextLine();

			System.out.print("Please enter the amount of the deposit. ");
			double amount = sc.nextDouble();
			System.out.println();
			ba = new BankAccount(name, amount);
			accounts.put(ba.accountID, ba);
			sc.nextLine();
		}

		Set<Integer> accountsSet = new TreeSet<>();
		accountsSet = accounts.keySet();
		Iterator<Integer> iter = accountsSet.iterator();
		while (iter.hasNext()) {
			Integer temp = iter.next();
			System.out.printf("%d >>> %s >>> %s\n", temp, accounts.get(temp).name,
					formatter.format(accounts.get(temp).balance));
		}
		System.out.println();
		System.out.print("Please enter the ID for the account that you wish to view. ");
		int id = sc.nextInt();
		Integer idw = id;
		System.out.printf("%d >>> %s >>> %s\n", idw, accounts.get(idw).name,
				formatter.format(accounts.get(idw).balance));
	}

}