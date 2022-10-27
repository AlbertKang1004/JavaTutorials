package javaProject.Lesson45;

import java.util.*;

public class BankAccount_comp implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		if (o1.balance > o2.balance)
			return 1;
		else if (o1.balance == o2.balance)
			return 0;
		else
			return -1;
	}

}
