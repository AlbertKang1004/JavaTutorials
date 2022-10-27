package javaProject.Lesson12;

public class Lesson12 {
	public static void main(String[] args) {
		int sum = 0;
		int j = 3;
		while (j <= 79) {
			sum = sum + j;
			j++;
		}
		System.out.println(sum);

		sum = 0;
		j = 3;
		do {
			sum = sum + j;
			j++;
		} while (j <= 79);
		System.out.println(sum);

		int i = 0, boxer = 11;
		while (i < 10) {
			i++;
			if (i != 5) {
				continue;
			}
			boxer = boxer + i;
		}
		System.out.println(boxer); // 16
	}
}
