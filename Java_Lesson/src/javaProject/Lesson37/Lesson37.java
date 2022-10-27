package javaProject.Lesson37;

public class Lesson37 {

	public static void main(String[] args) {
		try {
			int i = 4;
			int j = 0;
			System.out.println(i / j);
		} catch (ArithmeticException e) {
			System.out.println("ERROR");
		} finally {
			System.out.println("Mission Complete");
		}
		
		int i = 0;
		if (i == 0) {
			StuffyException e = new StuffyException("NO");
			throw e;
		}
	}

}
