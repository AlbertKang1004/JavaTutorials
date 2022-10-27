package javaProject.Lesson23;

import java.util.*;

public class Lesson23_project {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter next sentence: ");
		String str = sc.nextLine();
		boolean bool = false;
		StringTokenizer st = new StringTokenizer(str);

		while (st.hasMoreTokens()) {
			String temp = st.nextToken();
			if (temp.equalsIgnoreCase("Hermes")) {
				bool = false;
				break;
			}
			if (temp.equalsIgnoreCase("bridge")){
				bool = false;
				break;
			}
			if (temp.equalsIgnoreCase("Muddy")){
				bool = false;
				break;
			}
			if (temp.equalsIgnoreCase("River")){
				bool = false;
				break;
			}
			if (temp.equalsIgnoreCase("assault")){
				bool = false;
				break;
			}
			if (temp.equalsIgnoreCase("offensive")){
				bool = false;
				break;
			}
			bool = true;
		}
		if (bool == false) 
			System.out.println(str + ">>>REJECTED");
		else
			System.out.println(str + ">>>OK");

		sc.close();
	}

}
