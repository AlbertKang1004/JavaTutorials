package javaProject.Lesson23;
import java.util.*;

public class Lesson23 {

	public static void main(String[] args) {
		String theString = "128,65,1,586,108,79222";
		StringTokenizer t = new StringTokenizer(theString, ", \n"); 
		// comma, space, & \n are delimiters
		
		System.out.println(t.countTokens());
		
		System.out.println(t.nextToken()); // 128
		System.out.println(t.nextToken()); // 65
		System.out.println(t.countTokens()); // 4
		
		System.out.println(t.nextToken(" ,8/n"));
		System.out.println(t.nextToken()); // 5 (8 set as delimiter)
		
		while (t.hasMoreTokens()) 
			System.out.println(t.nextToken() + "\n");
	}

}
