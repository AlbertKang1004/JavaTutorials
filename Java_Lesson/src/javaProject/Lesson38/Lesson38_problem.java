package javaProject.Lesson38;

public class Lesson38_problem {

	public static void main(String[] args) {
		VectorManip vm = new VectorManip(new double[] { 3.4, 2.5, 4.1 });
		System.out.println(vm instanceof VectorManip);
		System.out.println(vm instanceof Vector);
//		System.out.println(VectorManip instanceof vm);
//		System.out.println(Vector instanceof vm);

	}

}
