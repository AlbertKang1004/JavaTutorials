package javaProject;
import javaProject.Person;

public class ExampleJava {

	public static void main(String[] args) {
		Person p1 = new Person("Albert", 19);
		System.out.println(p1.getName());
		System.out.println(p1.plus(1, 2));
		
		System.out.println(Person.plus(1, 2));
		System.out.println(Person.a);
	}

}
