package javaProject.Lesson18;

public class TestString {

	public static void main(String[] args) {
		String s = "sa s    a";
		String temp = "";
		
		for (int i = 0; i < s.length(); i++) {
			temp += ' ';
			temp += s.charAt(i);
		}
		String[] sp = temp.split("(?i)[s]\\s*[a]");
		for(String str : sp) {
			System.out.println('|' + str + '|');
		}
		System.out.println(sp.length);
		
	}

}
