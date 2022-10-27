package javaProject.Lesson37;
import java.io.IOException;
import java.util.*;

public class Lesson37_project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = false;
		try {
			FileInput.readTheFile(sc.nextLine());
			b = true;
		} catch (IOException e) {
			System.out.println("It did not work");
			System.out.println("Type \"exit\" to continue");
			if (sc.nextLine().equalsIgnoreCase("exit")) {
				b = false;
			}
		} 
		if (b) System.out.println("It worked");
		else System.out.println("FAIL");
		sc.close();

	}

}
