package javaProject.Lesson27;

import java.text.*;
import java.util.*;

public class Lesson27_exercise2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		double mn = 123.4432;
		System.out.println(nf.format(mn));

		NumberFormat n = NumberFormat.getPercentInstance();
		n.setMaximumFractionDigits(3);
		n.setMinimumFractionDigits(3);
		String str = n.format(4.708832);
		System.out.println(str);

		Formatter fmt = new Formatter();
		fmt.format("%s--->%-,10.3f--->%08.1e", "Formatting example", 189.11081, .07642);
		System.out.println(fmt);
		// Formatting example--->189.111 --->07.6e-02
		Formatter f = new Formatter();
		double d = 3251.231241;
		f.format("%-12.4f", d);
		System.out.println(f);

		Formatter f2 = new Formatter();
		int i = 932324;
		f2.format("%,-11d", i);
		System.out.println(f2);

		System.out.printf("-->|%3.6s|<--", "x");
		// --->| x|<---
		System.out.println();
		int[] num = { 57012, 26, 729 };
		double[] money = { 1200586.22, 187.91, 571267.03 };

		for (int j = 0; j < 3; j++) {
			System.out.printf("%05d%13s$%,12.2f\n", num[j], "", money[j]);
		}
		
		Formatter fmt2 = new Formatter();
		int i2 = 4893;
		fmt2.format("start%012dend", i2);
		String s = fmt2.toString();
		System.out.println(s);
	}

}
