package javaProject.Lesson54;

public class OuterClass {

	public OuterClass() {
	}

	public void test() {
		// int a = 2;
		InnerClass obj = new InnerClass(100);
		System.out.println(obj.icMethod());
	}

	private static int ocMethod() {
		return 10;
	}

	public static int ocDataMember = 3;

	class InnerClass {
		InnerClass(int val) // constructor
		{
			icDataMember = val;
		}

		int icMethod() {
			return (icDataMember + ocMethod() + ocDataMember);
		}

		int icDataMember;
	}

}
