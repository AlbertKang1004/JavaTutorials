package javaProject.Lesson54;

public class Lesson54 {

	public static void main(String[] args) {
		class InnerClass {
			InnerClass(int val) {
				icDataMember = val;
			}

			int icMethod() {
				return (icDataMember + ocMethod() + ocDataMember);
			}

			int icDataMember;
		}
//		int a = 2; // Not accesible from the inside of the inner class
		InnerClass obj = new InnerClass(100);
		System.out.println(obj.icMethod());

	}

	private static int ocMethod() {
		return 10;
	}

	public static int ocDataMember = 3;

}
