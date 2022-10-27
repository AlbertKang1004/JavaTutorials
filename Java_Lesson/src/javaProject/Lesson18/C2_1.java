package javaProject.Lesson18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class C2_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		b += 1;
		int sum = 0;
		for (int i = 0; i < b; i++) {
			sum += (a * Math.pow(10, i));
		}
		System.out.println(sum);
	}

}
