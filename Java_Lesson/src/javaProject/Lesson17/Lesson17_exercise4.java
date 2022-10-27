package javaProject.Lesson17;

public class Lesson17_exercise4 {

	public static void main(String[] args) {
		System.out.println(MyTester.doStuff("I would if I could")); // 1
		System.out.println(MyTester.doStuff("fee fi fo fum")); // 2

		MyTester.convert("Abe Lincoln"); // ABE LINCOLN
		MyTester.convert("BR549"); // BR549
		
		System.out.println(MyTester.bailOnM("mumify")); // 2
		
		MyTester.printStuff("A1 USDA prime."); // AUSDAprime
		System.out.println();
		
		System.out.println(MyTester.elim("ABC1234DEF")); // 306.0
		
		System.out.println("Alf Abrams".indexOf('A')); // 0
		
		System.out.println("Alf Abrams".lastIndexOf('A')); // 4
		
		MyTester.doStuff2("3872345619"); // 43456>>>1
	}

}
