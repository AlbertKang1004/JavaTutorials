package javaProject.Lesson07;
import java.util.*;

public class Lesson7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your integer here: ");
		int i = scanner.nextInt();
		System.out.println(i * 3);
		
		System.out.print("Enter your decimal here: ");
		double j = scanner.nextDouble();
		System.out.println(j * 3);
		
		System.out.print("Enter your string here: ");
		String k = scanner.next();
		System.out.println("This is the first part: " + k);
		System.out.print("Enter your string here: ");
		k = scanner.next();
		System.out.println("This is the second part: " + k);
		
		System.out.print("Enter your next line: ");
		String l = scanner.nextLine();
		System.out.println("This is your next line: " + l);
		scanner.close();
	}

}
