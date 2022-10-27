package javaProject;

public class Person {
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public static int plus(int a, int b) {
		return a + b;
	}
	
	public String name;
	public int age;
	public static int a = 0;
}
