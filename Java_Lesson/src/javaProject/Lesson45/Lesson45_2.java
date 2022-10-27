package javaProject.Lesson45;

import java.util.Arrays;
import java.util.Comparator;

public class Lesson45_2 {

	public static void main(String[] args) {
		BankAccount2 ba[] = new BankAccount2[5];
		ba[0] = new BankAccount2("Albert", 128);
		ba[1] = new BankAccount2("Bernard", 462);
		ba[2] = new BankAccount2("Caitlyn", 919);
		ba[3] = new BankAccount2("Donna", 701);
		ba[4] = new BankAccount2("Esther", 110);

		Comparator<BankAccount2> comp = new BA_comp();
		Arrays.sort(ba, comp);
		for (BankAccount2 b : ba) {
			System.out.printf("Name: %s\tBalance: $%.2f\n", b.name, b.balance);
		}
	}

}
