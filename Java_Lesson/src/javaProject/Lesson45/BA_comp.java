package javaProject.Lesson45;

import java.util.*;

public class BA_comp implements Comparator<BankAccount2> {

	@Override
	public int compare(BankAccount2 ba1, BankAccount2 ba2) {
//		BankAccount2 ba1 = (BankAccount2) firstObject;
//		BankAccount2 ba2 = (BankAccount2) secondObject;
		if (ba1.balance < ba2.balance)
			return -1;
		else if (ba1.balance == ba2.balance)
			return 0;
		else
			return 1;
	}

}
