package javaProject.Lesson34;
@SuppressWarnings("static-access")
public class Lesson34_exercise {

	
	public static void main(String args[]) {
		MyClass theObj = new MyClass();
		theObj.gravy = 107.43;
		String s = "hello";
		int xray[] = { 1, 2, 3, 4, 5 };
		double floozy = 97.4;
		myMethod(floozy, theObj, xray, s);
		System.out.println(floozy); // 97.4
		System.out.println(theObj.gravy); // 10.001
		System.out.println(xray[2]); // 100
		System.out.println(s); // hello
	}

	public static void myMethod(double floozy, MyClass anObj, int a[], String s) {
		floozy = 13.1;
		anObj.gravy = 10.001;
		a[2] = 100;
		s = "good bye";
	}

}
