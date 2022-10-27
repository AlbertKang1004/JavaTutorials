package javaProject.Lesson10;

import java.util.*;

public class Lesson10_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Make your arithmetic selection from the choices below: ");

		System.out.println("\t1. Addition");
		System.out.println("\t2. Subtraction");
		System.out.println("\t3. Multiplication");
		System.out.println("\t4. Division");

		System.out.print("\tYour choice? ");
		int choice = sc.nextInt();

		System.out.print("\nEnter first operand: ");
		double op1 = sc.nextDouble();

		System.out.print("\nEnter second operand: ");
		double op2 = sc.nextDouble();

		switch (choice) {
		case 1:
			System.out.println(op1 + " + " + op2 + " = " + (op1 + op2));
			break;
		case 2:
			System.out.println(op1 + " - " + op2 + " = " + (op1 - op2));
			break;
		case 3:
			System.out.println(op1 + " * " + op2 + " = " + (op1 * op2));
			break;
		case 4:
			System.out.println(op1 + " / " + op2 + " = " + (op1 / op2));
			break;
		default: 
			System.out.println("Error!");
		}
		sc.close();
	}

}
