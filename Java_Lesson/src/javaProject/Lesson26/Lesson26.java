package javaProject.Lesson26;

import java.io.*;

public class Lesson26 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter(
				"/Users/albertkang1004/Desktop/Java/Java_Lesson/src/javaProject/Lesson26/Output1.txt");
		PrintWriter output = new PrintWriter(fw);
		
		output.print("Four-score and ");
		double d = 7.023;
		output.println(d);
		output.println("years ago.");
		
		output.close();
		fw.close();
	}
}
