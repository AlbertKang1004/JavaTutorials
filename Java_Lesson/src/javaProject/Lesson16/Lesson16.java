package javaProject.Lesson16;

public class Lesson16 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		Circle cir1 = new Circle(3.0);
		// OR
		Circle cir1;
		cir1 = new Circle(3.0);
		
		System.out.println(cir1.radius);
		System.out.println(new Circle(3.0));

		Circle cir2 = new Circle(3.0);
		
		System.out.println(cir1 == cir2); // false
		System.out.println(cir1.equals(cir2)); // false
		
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2)); // true
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		System.out.println(s3 == s4); // false
		System.out.println(s3.equals(s4)); // true
		
		Circle cir3;
		cir3 = cir2;
		System.out.println(cir3.equals(cir2)); // true
		System.out.println(cir3.equals(cir1)); // false
		
		System.out.println(cir3 == cir1); // false
		
		Surfer Surferdude = new Surfer();
		
	}

}
