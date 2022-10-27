package javaProject.Lesson14;

public class Lesson14_exercise {

	public static void main(String[] args) {
		System.out.println("1. " + Integer.toString(0x3C4F));
		System.out.println("2. " + Integer.toString(0b100011));
		System.out.println("3. " + Integer.toString(0637));

		System.out.println("6. " + Integer.toString(0x9A4E));
		System.out.println("7. " + Integer.toString(0b1011011));
		System.out.println("8. " + Integer.toString(06437));

		int a = 0x5C3B;
		System.out.println("9. " + a);

		int k = 03365;
		System.out.println("10. " + k);

		System.out.println("11. " + Integer.toString(478, 2));
		System.out.println("12. " + Integer.toString(5678, 16));
		System.out.println("13. " + Integer.toString(5678, 8));

		int ans = 0x2c6 * 0x3f;
		System.out.println("14. " + Integer.toString(ans, 16));
		int ans2 = 03456 * 0745;
		System.out.println("15. " + Integer.toString(ans2, 8));

		System.out.println("16. " + Integer.toString(0xA));
		System.out.println("17. " + Integer.toString(0x8));

		System.out.println("19. " + Integer.toString(16, 16));

		System.out.println("21. " + Integer.toString(0b1111000 + 0b1001110, 2));
		System.out.println("22. " + Integer.toString(0b1000001 + 0b1100001, 2));

		String s = "33492";
		int b = 11;
		int i = Integer.parseInt(Integer.toString(Integer.parseInt(s,b)));
		System.out.println("24. " + i);
		
		System.out.println("25. " + Integer.toString(Integer.parseInt("9322GF", 33), 28));
		
		System.out.println("26. " + Integer.toString(0x3FA6 + 0xE83A, 16));
		System.out.println("27. " + Integer.toString(07267 * 04645, 8));
		System.out.println("28. " + Integer.toString(02376 + 0567, 8));
		System.out.println("29. " + Integer.toString(0x3E + 0x5B, 16));

	}

}
