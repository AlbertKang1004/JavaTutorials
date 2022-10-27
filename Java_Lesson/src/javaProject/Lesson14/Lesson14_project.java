package javaProject.Lesson14;

public class Lesson14_project {

	public static void main(String[] args) {
		System.out.println("Decimal\tBinary\tOctal\tHexal\tCharacter");
		for (int i = 65; i <= 90; i++) {
			System.out.println(i + "\t" 
		+ Integer.toString(i, 2) + "\t"
		+ Integer.toString(i, 8) + "\t"
		+ Integer.toString(i, 16) + "\t"
		+ (char) i);
		}
	}

}
