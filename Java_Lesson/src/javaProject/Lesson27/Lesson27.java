package javaProject.Lesson27;
import java.text.*;
import java.util.Formatter;

public class Lesson27 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double d = 34.982665;
		
		NumberFormat fmt = NumberFormat.getNumberInstance();
		fmt.setMaximumFractionDigits(3);
		fmt.setMinimumFractionDigits(3);
		
		String s = fmt.format(d);
		System.out.println(s);
		double d2 = Double.parseDouble(s);
		System.out.println(d2);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String str = nf.format(81.0945);
		System.out.println(str);
		
		str = nf.format(.358);
		System.out.println(str);
		
		NumberFormat n = NumberFormat.getPercentInstance();
		n.setMinimumFractionDigits(2);
		n.setMaximumFractionDigits(2);
		String string = n.format(.35838);
		System.out.println(string);
		
		Formatter fmt2 = new Formatter();
		fmt2.format("My Number>>>%15f, and my string>>>%8s", 237.647, "hello"); 
		// number after % represents the space
		System.out.println(fmt2.toString());
		
	}

}
