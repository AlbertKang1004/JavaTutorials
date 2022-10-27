package javaProject.Lesson09;

public class Lesson9_exercise {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i = 10, j = 3;
		boolean true_false;

		true_false = (j > i);
		System.out.println(true_false); // false

		true_false = (i > j);
		System.out.println(true_false); // true

		true_false = (i == j);
		System.out.println(true_false); // false

		true_false = ((j <= i) || (j >= i));
		System.out.println(true_false); // true

		true_false = ((i > j) && (j == 0));
		System.out.println(true_false); // false

		true_false = ((j < 50) || (j != 33));
		System.out.println(true_false); // true

		true_false = (!(j < 50) && (i <= 50));
		System.out.println(true_false); // false

		true_false = (!(!(!true)));
		System.out.println(true_false); // false

		true_false = (5 <= 5);
		System.out.println(true_false); // true

		true_false = (j != i);
		System.out.println(true_false); // true

		int m = 33;
		boolean b = (m <= 44);
		System.out.println(b);

		int r = 1;
		boolean b2 = (r >= 17);
		System.out.println(b2);

		System.out.println(!((2 > 3) || (true) && (7 > 1) && (4 < 15) || (35 <= 36) && (89 != 34))); // false
		
		String s1 = "school BUS";
		if (s1.equals("school bus"))
			System.out.println("Equal");
		else 
			System.out.println("Not Equal");
		
		if (s1.equalsIgnoreCase("school bus"))
			System.out.println("Equal");
		else 
			System.out.println("Not Equal");
		
		int j2 = 19, m2 = 200;
		if (j2 == 18)  
			m2++;
		j2++;
		System.out.println(j2);
		System.out.println(m2);
		
		int g = 34;
		boolean b3 = (g == 34);
		System.out.println(b3); // true
		
		int k = 345622;
		boolean b4 = (k % 2 == 0); 
		System.out.println(b4); // true
	}

}
