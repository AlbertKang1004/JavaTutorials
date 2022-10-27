package javaProject.Lesson13;

public class Lesson13 {

	public static void main(String[] args) {
		String s = "W";
		char a = s.charAt(0);
		System.out.println(a);
		
		char b = 'X';
		String t = "" + b;
		System.out.println(t);
		
		char bigLetter = 'H';
		char smallLetter = (char)(bigLetter + 32);
		System.out.println(smallLetter);
		
		char ch = 'a';
		System.out.println(Character.isDigit(ch)); // false
		
		ch = '3';
		System.out.println(Character.isDigit(ch)); // true
		
		ch = 'a';
		System.out.println(Character.isLetter(ch)); // true
		
		ch = '<';
		System.out.println(Character.isLetter(ch)); // false
		
		ch = 'a';
		System.out.println(Character.isLetterOrDigit(ch)); // true
		
		ch = '2';
		System.out.println(Character.isLetterOrDigit(ch)); // true
		
		ch = ' ';
		System.out.println(Character.isWhitespace(ch)); // true
		
		ch = 'm';
		System.out.println(Character.isWhitespace(ch)); // false
		
		ch = 'Q';
		System.out.println(Character.isLowerCase(ch)); // false
		System.out.println(Character.isUpperCase(ch)); // true
		
		ch = 'd';
		char nn = Character.toUpperCase(ch);
		System.out.println(nn); // D
		nn = Character.toLowerCase(nn);
		System.out.println(nn); // d
	}

}
