package javaProject.Lesson07;
import java.util.*;

public class Lesson7_project1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is the area? ");
		double area = scanner.nextDouble();
		
		double radius = Math.sqrt(area / Math.PI);
		System.out.println("Radius of your circle is " + radius);
		scanner.close();
	}

}
