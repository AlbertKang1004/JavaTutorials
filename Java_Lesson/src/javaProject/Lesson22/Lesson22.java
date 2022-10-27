package javaProject.Lesson22;

public class Lesson22 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s = "139";
		int i = Integer.parseInt(s); // String --> int
		
		s = "3w4br";
		int base = 35;
		i = Integer.parseInt(s, base); // String --> int (base35)
		
		s = "282.222";
		double d = Double.parseDouble(s); // String --> double

		int t = 335;
		
		System.out.println(Integer.toHexString(t));
		System.out.println(Integer.toOctalString(t));
		System.out.println(Integer.toBinaryString(t));
		
		int ii = 104;
		String ss = Integer.toString(i);
		
		// OR
		
		int jj = 3;
		String ss2 = "" + jj;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
	}

}
