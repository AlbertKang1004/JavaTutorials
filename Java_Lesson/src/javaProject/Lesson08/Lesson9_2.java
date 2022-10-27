package javaProject.Lesson08;
import java.util.*;

public class Lesson9_2 {

	public static void main(String[] args) {
		int groovyDude = 37;
		if (groovyDude == 37) 
			groovyDude++; // only one line for if statement
		System.out.println(groovyDude); // 38
		
		Scanner sc = new Scanner(System.in);
		System.out.print("what is your grade? ");
		int grade = sc.nextInt();
		
		if (grade >= 90) {
			System.out.println("You made an A.");
		} else if (grade >= 80) {
			System.out.println("You made an B.");
		} else if (grade >= 70) {
			System.out.println("You made an C.");
		} else if (grade >= 60) {
			System.out.println("You made an D.");
		} else {
			System.out.println("Sorry, you failed.");
		}
		sc.close();
	}

}
