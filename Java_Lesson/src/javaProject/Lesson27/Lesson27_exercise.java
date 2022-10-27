package javaProject.Lesson27;

import java.text.*;
import java.util.*;

public class Lesson27_exercise {

	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(1);
		
		double cv = 18.7713;
		System.out.println(nf.format(cv));
		
		nf.setMaximumFractionDigits(3);
		nf.setMinimumFractionDigits(2);
		
		double dv = 184.767123;
		System.out.println(nf.format(dv));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		double db = sc.nextDouble();
		nf.setMaximumFractionDigits(4);
		nf.setMinimumFractionDigits(3);
		
		System.out.println("The number is: " + nf.format(db));
		sc.close();
		
	}

}
