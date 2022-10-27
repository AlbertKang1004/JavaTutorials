package javaProject.Lesson17;

public class MyTester {
	public static int doStuff(String myString) {
		int cc = 0;
		int p = myString.length() / 2;
		for (int k = 0; k < myString.length() / 2; k++, p++)
			if (myString.charAt(k) == myString.charAt(p))
				cc++;
		return cc;
	}

	public static void convert(String myString) {
		String tot = "";
		for (int j = 0; j < myString.length(); j++) {
			char ch = Character.toUpperCase(myString.charAt(j));
			tot = tot + ch;
		}
		System.out.println(tot);
	}

	public static int bailOnM(String myString) {
		int indx = 0;
		do {
			indx++;
		} while (myString.charAt(indx) != 'm');
		return indx;
	}

	public static void main(String args[]) {
		System.out.println("Nertz to you".charAt(4));
	}

	public static void printStuff(String theString) {
		for (int j = 0; j < theString.length(); j++) {
			char chr = theString.charAt(j);
			if (Character.isLetter(chr))
				System.out.print(chr);
		}
	}

	public static double elim(String theString) {
		int sum = 0;
		for (int j = 0; j < theString.length(); j++) {
			if (theString.charAt(j) > '1' && theString.charAt(j) < '8')
				sum = sum + theString.charAt(j) * 2;
		}
		return sum;
	}

	public static void doStuff2(String aString) {
		int p = 1;
		int j = aString.indexOf("23") + p;
		String s;
		System.out.print(j);
		if (j >= 0)
			s = aString.substring(j, j + 4);
		else
			s = "No can do";
		System.out.println(s + ">>>" + j % 3);
	}
}