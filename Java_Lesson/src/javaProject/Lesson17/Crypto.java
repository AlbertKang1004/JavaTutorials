package javaProject.Lesson17;

public class Crypto {

	String str;

	public Crypto() {
	}

	public String encrypt(String en_str) {
		str = en_str;
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			switch (str.toLowerCase().charAt(i)) {
			case 'v':
				temp += "ag',r";
				break;
			case 'm':
				temp += "ssad";
				break;
			case 'g':
				temp += "jeb..w";
				break;
			case 'b':
				temp += "dug>?/";
				break;
			default:
				temp += str.charAt(i);
			}

		}

		return temp;
	}

	public String decrypt(String de_str) {
		str = de_str;
		str = str.replaceAll("ag',r", "v");
		str = str.replaceAll("ssad", "m");
		str = str.replaceAll("jeb..w", "g");
		str = str.replaceAll("dug>\\?/", "b");
		return str;
	}

}
