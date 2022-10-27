package javaProject.Lesson54;

public class RayVac {

	public static void main(String[] args) {
		class Calcs {
			Calcs(int val) {
				data = val;
			}

			int inMethod() {
				return (data + methodOc() + dataOc);
			}

			int data;
		}
//		int b = 2;
		Calcs obj = new Calcs(50);
		System.out.println(obj.inMethod());
	}

	private static int methodOc() {
		return 1;
	}
	
	private static int dataOc = 3;

}
