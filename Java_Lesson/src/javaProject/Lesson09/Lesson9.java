package javaProject.Lesson09;

import java.util.*;

public class Lesson9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your grade? ");
		int myGrade = scanner.nextInt();

		if (myGrade >= 70) {
			System.out.println("Congratulations, you passed.");
		} else {
			System.out.println("Better luck next time.");
		}
		scanner.nextLine();

		System.out.print("What state do you live in? ");
		String state = scanner.nextLine();

		System.out.print("What is the price? ");
		double price = scanner.nextDouble();
		double tax = 0;
		if ((state.equalsIgnoreCase("texas")) || state.equalsIgnoreCase("Tx")) {
			tax = price * .08;
		}
		double totalPrice = price + tax;
		System.out.println("The total price is " + totalPrice + ".");
		scanner.close();
	}

}
