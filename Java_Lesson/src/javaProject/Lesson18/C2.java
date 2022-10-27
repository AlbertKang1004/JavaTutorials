package javaProject.Lesson18;
import java.util.*;

public class C2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		k+=1;
		int sum = 0;
		for (int i = 0; i < k ; i++) {
			sum += (n * Math.pow(10, i));
		}
		System.out.println(sum);
		sc.close();

	}

}
