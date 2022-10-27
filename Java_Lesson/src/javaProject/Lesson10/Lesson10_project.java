package javaProject.Lesson10;

import java.util.*;

public class Lesson10_project {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double voltar_w = 0.091, krypton_w = 0.720, fertos_w = 0.865, servontos_w = 4.612;

		System.out.print("What is your weight on the earth? : ");
		double weight = scanner.nextDouble();

		System.out.println("\n\t1. Voltar");
		System.out.println("\t2. Krypton");
		System.out.println("\t3. Fertos");
		System.out.println("\t4. Servontos\n");

		System.out.print("Selection? : ");
		int selection = scanner.nextInt();
		scanner.close();

		switch (selection) {
		case 1:
			System.out.println("Your weight on Voltor would be " + (weight * voltar_w));
			break;
		case 2:
			System.out.println("Your weight on Krypton would be " + (weight * krypton_w));
			break;
		case 3:
			System.out.println("Your weight on Fertos would be " + (weight * fertos_w));
			break;
		case 4:
			System.out.println("Your weight on Servontos would be " + (weight * servontos_w));
			break;
		default:
			System.out.println("Error!");
		}
	}

}
