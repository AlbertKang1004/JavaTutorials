package javaProject.Lesson16;

public class Lesson16_exercise {

	public static void main(String[] args) {
		String myString = "Yellow";
		String yourString = "Yellow";
		String hisString = new String("Yellow");
		String ourString = myString;
		
		System.out.println(myString == yourString); // true
		System.out.println(myString == ourString); // true
		System.out.println(myString.equals(yourString)); // true
		System.out.println(myString.equals(ourString)); // true
		System.out.println(myString == hisString); // false

	}

}
