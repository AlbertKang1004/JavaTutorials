package javaProject.Lesson17;

import java.util.*;

public class Lesson17_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner("A string for testing scanner");
		
		System.out.println(sc.next());
		
		System.out.println(sc.findInLine("ri"));
		
		String ns = sc.next();
		System.out.println(ns);
		
		sc.useDelimiter("r\\s+");
		
		System.out.println(sc.next());

		sc.skip("r\\s*test");
		System.out.println(sc.next());
		
		sc.close();
	}

}
