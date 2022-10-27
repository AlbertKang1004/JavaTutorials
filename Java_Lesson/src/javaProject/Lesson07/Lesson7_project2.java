package javaProject.Lesson07;
import java.util.*;

public class Lesson7_project2 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your first name? ");
		String FirstName = scanner.next();
		System.out.print("What is your second name? ");
		String SecondName = scanner.next();
		String FullName = FirstName + " " + SecondName;
		System.out.println("Your full name is " + FullName);
		scanner.close();
	}
}
