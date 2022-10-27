package javaProject.Lesson20;
import java.util.Scanner;

public class Lesson20_project {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the A value for the line: ");
		DistToLine.A = sc.nextDouble();
		System.out.print("Enter the B value for the line: ");
		DistToLine.B = sc.nextDouble();
		System.out.print("Enter the C value for the line: ");
		DistToLine.C = sc.nextDouble();
		
		System.out.print("Enter the x coordinate of the point: ");
		double X = sc.nextDouble();
		System.out.print("Enter the y coordinate of the point: ");
		double Y = sc.nextDouble();
		sc.close();
		
		System.out.println("Distance from the point to the line is: " + DistToLine.getDist(X, Y));
		
	}

}
