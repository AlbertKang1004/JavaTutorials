package javaProject.Lesson03;

public class Lesson3_exercise {

	public static void main(String[] args) {
		int rabbitNum = 129;
		String report = "The number of rabbits are " + rabbitNum + ".";
		System.out.println(report);

		String l = "Computer Science is for nerds";
		System.out.println(l.toLowerCase());

		String c;
		String d = "The Gettysburg Address";
		c = d.substring(4);
		System.out.println(c); // prints "Gettysburg Address"

		String a = "Four score and seven years ago,";
		String b = a.substring(7, 12);
		System.out.println(b); // prints "ore a"

		int count;
		String s = "Surface tension";
		count = s.length();
		System.out.println(count); // prints 15

		String m = "Look here!";
		System.out.println("\"" + m + "\" has " + m.length() + " characters.");
		
		System.out.println("All \"good\" men should come to the aid of their country");
		
		System.out.println("Hello\nHello again");
		
		System.out.println("A backslash looks like this \\, ...right?");
		
		String e = "Eddie Haskel";
		int f = e.length();
		String g = e.substring(f - 4);
		System.out.println(g); // prints "skel"
	}

}
