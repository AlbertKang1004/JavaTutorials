package javaProject.Lesson17;

public class Lesson17_exercise {

	public static void main(String[] args) {
		String s = "Lucky hockey puck";
		String m = "uck";
		int j = 6, z = 99;

		int k = s.indexOf(m);
		System.out.println(k); // 14 -> 1

		k = s.indexOf("uck", j);
		System.out.println(k); // 8 -> 14

		k = s.indexOf('c'); 
		System.out.println(k); // 2

		String str = s.replace('o', 'p');
		System.out.println(str); // Lucky hpckey puck

		k = s.lastIndexOf(m, j + 3);
		System.out.println(k); // 5 -> 14

		char p = s.charAt(7);
		System.out.println(p); // o

		k = s.indexOf(z);
		System.out.println(k); // -1 -> 2

		k = s.lastIndexOf(m);
		System.out.println(k); // 14

		k = s.indexOf('y', j);
		System.out.println(k); // 5 -> 11

		p = s.charAt(z - 90);
		System.out.println(p); // k

		k = s.indexOf(m, 15);
		System.out.println(k); // -1

		k = s.indexOf(z + 2, 4);
		System.out.println(k); // 5 -> 10
 
		k = s.lastIndexOf('h');
		System.out.println(k); // 6

		k = s.lastIndexOf(121);
		System.out.println(k); // 11

		str = s.replace('y', 'A');
		System.out.println(str); // LuckA hockeA stick

	}

}
