package javaProject.Lesson27;

public class Lesson27_2 {

	public static void main(String[] args) {
		System.out.printf("%9.3f\n", 187.9207); 
		// 9 wide, 3 decimal, float
		System.out.printf("%9.2e\n", 187.9207); 
		// 9 wide, 2 decimal, scientific
		System.out.printf("%.4g\n", 111187.9207);
		// 4 decimal OR sig fig, float/scientific
		System.out.printf("%6.8s\n", "abcdefghi");
		// between 6 - 8 characters
		
		System.out.printf("%-9.3f\n", 187.9207); 
		// same but stick to the left
		System.out.printf("%09.3f\n", 187.9207); 
		// same but fill spaces with 0
		System.out.printf("%,9.3f\n", 1187.9207);
		// add a comma for 3 digits
	}

}
