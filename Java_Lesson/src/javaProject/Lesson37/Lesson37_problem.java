package javaProject.Lesson37;

//import java.util.Scanner;

public class Lesson37_problem {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		int j = sc.nextInt();
//		sc.close();
//		try {
//			System.out.print(str.charAt(j));
//		}
//
//		catch (StringIndexOutOfBoundsException e) {
//			System.out.println("Error: " + j);
//		}
		
		System.out.println(product("two","5"));

	}

	public static int product(String str1, String str2) {
		int prd = 1;
		try {
			prd *= Integer.parseInt(str1);
		} catch (NumberFormatException e) {
			prd = 1;
		}
		
		try {
			prd *= Integer.parseInt(str2);
		} catch (NumberFormatException e){
			prd = 1;
		}
		return prd;
	}

}
