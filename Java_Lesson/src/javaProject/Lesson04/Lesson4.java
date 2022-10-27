package javaProject.Lesson04;

public class Lesson4 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		double p;
		double j = 47.2;
		p = j; // assign the value of j to p. Both p and j are now 47.2

		double top, mid, bot; // multiple variables are only declared
		double x = 12.3, y = 45.6, z = 78.9; // multiple variables are declared and initialized

		System.out.println(5 + 3 * 4 - 7); // follows the order of * --> +,-
		System.out.println(8 - 5 * 6 / 3 + (5 - 6) * 3); // follows the order of () --> *,/ --> +,-

		int a = 0;
		a++;
		System.out.println(a);
	}
}