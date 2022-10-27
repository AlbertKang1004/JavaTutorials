package javaProject.Lesson40;

import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner kbReader = new Scanner(System.in);
		System.out.print("Generate which term number? ");
		int k = kbReader.nextInt();
		kbReader.close();
		System.out.println("Term #" + k + " is " + ModFib.modFibbonacci(k));
	}

}
