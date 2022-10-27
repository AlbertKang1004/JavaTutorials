package javaProject.Lesson18;

public class Lesson18_2 {

	public static void main(String[] args) {
		String s = "Hello again", sp[];
		sp = s.split("a");
		for (String str : sp) {
			System.out.print('|');
			System.out.print(str);
			System.out.println('|');
		}
		System.out.println();
		
		sp = s.split("\\s");
		for (String str : sp) {
			System.out.print('|');
			System.out.print(str);
			System.out.println('|');
		}
		System.out.println();
		
		sp = s.split("ga");
		for (String str : sp) {
			System.out.print('|');
			System.out.print(str);
			System.out.println('|');
		}
		System.out.println();
		
		sp = s.split("el|ai");
		for (String str : sp) {
			System.out.print('|');
			System.out.print(str);
			System.out.println('|');
		}
		System.out.println();
		
		String s2 = "THE ENOUGH USE OF THE WORD THE";
		sp = s2.split("THE");
		for (String str : sp) {
			System.out.print('|');
			System.out.print(str);
			System.out.println('|');
		}
		
		System.out.println(sp.length);
		
	}

}
