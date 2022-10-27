package javaProject.Lesson36;

public class Lesson36_exercise2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		Child myChild = new Child();
//		System.out.println(myChild.x); // 39
//		// System.out.println(myChild.returnX());
//
//		Child theObj = new Child();
//		Parent newObj = theObj;
//		// newObj.busterStein();
//		Parent meatloaf = new Child();

//		A a = new B(5, 10);
//		System.out.println(a.g());

//		A a = new B(5, 10);
//		System.out.println(a.f());

//		A a = new B(5, 10);
//		System.out.println(a.x);

//		B b = new B(5, 10);
//		System.out.println(b.x);

//		A a = new B(5, 10);
//		System.out.println(a.zorro());

		Parent pr = new Child(4, 11);
		System.out.println(pr.work());

		Street st = new Street();
		House.getInfo((Town) st);

		System.out.println(st instanceof Town);
	}

}
