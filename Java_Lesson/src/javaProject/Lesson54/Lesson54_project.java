package javaProject.Lesson54;

public class Lesson54_project {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.test();
		// InnerClass ic1 = new InnerClass(14);
		// Cannot access to innerclass using outerclass
		System.out.println();
		
		Apple app = new Apple();
		app.hal();
	}
}
