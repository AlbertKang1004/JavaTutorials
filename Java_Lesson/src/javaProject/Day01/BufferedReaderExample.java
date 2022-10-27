package javaProject.Day01;
import java.io.*;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter an Integer: ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter a String: ");
		String b = br.readLine();
		
		System.out.printf("You have entered: %d and string as: %s", a, b);
		
	}

}
