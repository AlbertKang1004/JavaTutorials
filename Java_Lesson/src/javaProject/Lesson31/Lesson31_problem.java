package javaProject.Lesson31;

public class Lesson31_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StringBuffer sb = new StringBuffer();
//		int t[] = { 1, 2, 8, 9, 2 };
//		String s = "Do unto others as you would have...";
//		char[] sc = s.toCharArray();
//		for (int j = 0; j < t.length; j++) {
//			if (t[j] == 2)
//				sb.append(sc[j]);
//		}
//		System.out.print(sb.toString());

//		StringBuffer sb = new StringBuffer("groovy");
//		String st = "dude";
//		sb.append(st);
//		System.out.print(sb.length());

//		StringBuffer asb = new StringBuffer("abcdef_mnopqrst");
//		StringBuffer nsb = StrBuf.sbStuff(asb);
//		System.out.println(nsb);

//		System.out.println(lefty("Rubber ducky"));
		// throws exception

		StringBuffer sb = new StringBuffer("Pepsi Cola");
		sb.insert(2, "Coke");
		System.out.println(sb);
		//PeCokepsi Cola
		
		
	}

	public static String lefty(String s) {
		StringBuffer sb = new StringBuffer(s);
		for (int j = 0; j < sb.length(); j++)
			if (sb.charAt(j) >= 'q' - 1)
				sb.setCharAt(j, sb.charAt(j - 2));
		return sb.toString();
	}

}
