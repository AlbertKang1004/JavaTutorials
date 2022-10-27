package javaProject.Lesson15;

public class Tester {

	public static void main(String[] args) {
		Circle cir1 = new Circle(5.1);
		Circle cir2 = new Circle(20.6);
		
		double xx = cir1.radius;
		System.out.println(xx);
		
		System.out.println(cir2.area());
		cir2.setRadius(40.1);
		System.out.println(cir2.area());
		
		Circle cir3 = new Circle(35.5);
		System.out.println(cir3.diameter()); // 71.0
		
//		cir2.radius = 40.6; // direct access
//		System.out.println(cir2.area());
	}

}
