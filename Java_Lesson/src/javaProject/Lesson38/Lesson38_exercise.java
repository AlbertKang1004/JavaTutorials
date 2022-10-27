package javaProject.Lesson38;

public class Lesson38_exercise {

	public static void main(String[] args) {
		Sports x = new Baseball();
		Sports y = new Football();
		x.method2();
		y.method2();
		System.out.println(x instanceof Sports);
		System.out.println(y instanceof Football);
		
		
	}

}
