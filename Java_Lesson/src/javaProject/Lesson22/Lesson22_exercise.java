package javaProject.Lesson22;

public class Lesson22_exercise {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String rr = "123";
		int i = Integer.parseInt(rr);
		
		String s = "123.456";
		double d = Double.parseDouble(s);
		
		String s2 = "1444";
		String sh = Integer.toHexString(Integer.parseInt(s2));

		int jj = 2;
		String jj2 = String.valueOf(jj);
		
		String ss = "1000";
		Integer ss2 = Integer.parseInt(ss);
		
		String pdq = "-772.29";
		System.out.println(3 + Double.parseDouble(pdq));
		
		Integer iObj = -186;
		int ip = iObj;
		String mz = "3" + Integer.toString(ip) + "3";
		System.out.println(mz);
		
		String ss3 = "3pfh";
		int i2 = Integer.parseInt(ss3, 33);
		System.out.println(i2);
		
		int i3 = 2341;
		String ss4 = Integer.toString(i3, 6);
		System.out.println(ss4);
	}

}
