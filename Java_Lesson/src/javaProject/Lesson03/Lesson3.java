package javaProject.Lesson03;

public class Lesson3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String m = "Hello";
		String n = "Friend";
		String o = m + n;
		System.out.println(o); // concatenation
		System.out.println(m + n); // same result

		int len = o.length();
		System.out.println(len); // displays length of a string

		String myPet = "Sparky the dog";
		// 0 4--------- --> called indices
		String smallPart = myPet.substring(4);
		System.out.println(smallPart); // prints "ky the dog"

		String myPet2 = "Sparky the dog";
		// 0 4----9
		String smallPart2 = myPet.substring(4, 9);
		System.out.println(smallPart2); // prints "ky the"

		String a = "Hi, I am from Canada";
		System.out.println(a.toLowerCase()); // change every letters to lowercase
		System.out.println(a.toUpperCase()); // change every letters to uppercase

		int c = 27;
		String d = "Comment ca va?";
		String e = c + " " + d;
		System.out.println(e); // addition of int and string will yield a string
		
		String f = "here is one line\nand here is another";
		System.out.println(f); // \n starts another line
		
		String g = "Path = c:\\nerd_file.doc";
		System.out.println(g); // \\ displays \
		
		String h = "Name:\t\tAddress:";
		System.out.println(h); // \t will allow us to tab over
	}

}
