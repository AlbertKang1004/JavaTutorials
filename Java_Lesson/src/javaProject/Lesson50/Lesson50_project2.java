package javaProject.Lesson50;

import java.util.*;

public class Lesson50_project2 {

	public static void main(String[] args) {
		StackLL st = new StackLL();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter number, math operation (+, -, *, or /). Enter Q to quit: ");
			String str = sc.next();
			if (str.charAt(0) >= 48 && str.charAt(0) <= 57) {
				// If input is a number
				st.push(Double.parseDouble(str));
			} else if (str.length() == 1
					&& (str.charAt(0) == 42 || str.charAt(0) == 43 || str.charAt(0) == 45 || str.charAt(0) == 47)) {
				// If input is a symbol
				double a, b;
				a = st.pop();
				b = st.pop();
				switch (str) {
				case "+":
					st.push(b + a);
					break;
				case "-":
					st.push(b - a);
					break;
				case "*":
					st.push(b * a);
					break;
				case "/":
					st.push(b / a);
					break;
				}
			} else if (str.equalsIgnoreCase("Q")) {
				break;
			} else {
				System.out.println("ERROR! Enter a valid value");
			}
			System.out.println("Current: " + st.peek());
		}
		sc.close();
		System.out.println("The answer is: " + st.peek());
	}

}
