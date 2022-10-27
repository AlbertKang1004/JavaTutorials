package javaProject.Lesson17;
import java.util.Scanner;

public class Lesson17_exercise3 {

	public static void main(String[] args) {
		String s = new String("Good morning, how may I help you? I289 56");
		Scanner sc = new Scanner(s);
		
		System.out.println(sc.next()); // Good
		
		sc.skip("\\s*mo");
		String s2 = sc.next();
		System.out.println(s2); // rning,
		
		sc.useDelimiter("\\s+I");
		System.out.println(sc.next()); //  how may
		
		sc.findInLine("el");
		System.out.println(sc.hasNext()); // true
		System.out.println(sc.next()); // p you?
		
		sc.useDelimiter("\\s+");
//		System.out.println(sc.nextInt()); 
		// error because the following character is I
		
		sc.skip("\\D*");
		// skip anything but digits (0 - 9)
		System.out.println(sc.nextInt()); 
		
		sc.close();
	}

}

