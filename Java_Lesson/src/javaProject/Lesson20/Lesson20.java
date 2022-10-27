package javaProject.Lesson20;

public class Lesson20 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Nerd geek = new Nerd();
		geek.MethodB("Some words");
		// OR
		Nerd.MethodB("Again"); // direct access is possible due to static keyword

		Dweeb.x = 79;
		System.out.println(Dweeb.x);
		Dweeb twerp1 = new Dweeb();

		System.out.println(Dweeb.x); // 79
		System.out.println(twerp1.x); // 79
		twerp1.x = 102;

		Dweeb twerp2 = new Dweeb();
		System.out.println(Dweeb.x); // 102
		System.out.println(twerp1.x); // 102
		System.out.println(twerp2.x); // 102
	}

}
