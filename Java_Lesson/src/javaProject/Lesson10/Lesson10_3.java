package javaProject.Lesson10;

import java.util.*;

public class Lesson10_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Make your arithmetic selection from the choices below: ");

		System.out.println("\tA. Addition");
		System.out.println("\tS. Subtraction");
		System.out.println("\tM. Multiplication");
		System.out.println("\tD. Division");

		System.out.print("\tYour choice? ");
		String choice = sc.nextLine().toUpperCase();
		char ch = choice.charAt(0);

		System.out.print("\nEnter first operand: ");
		double op1 = sc.nextDouble();

		System.out.print("\nEnter second operand: ");
		double op2 = sc.nextDouble();

		switch (ch) {
		case 'A':
			System.out.println(op1 + " + " + op2 + " = " + (op1 + op2));
			break;
		case 'S':
			System.out.println(op1 + " - " + op2 + " = " + (op1 - op2));
			break;
		case 'M':
			System.out.println(op1 + " * " + op2 + " = " + (op1 * op2));
			break;
		case 'D':
			System.out.println(op1 + " / " + op2 + " = " + (op1 / op2));
			break;
		default: 
			System.out.println("Error!");
		}
		sc.close();
	}

}
