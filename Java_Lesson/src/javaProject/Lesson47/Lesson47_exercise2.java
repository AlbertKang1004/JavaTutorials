package javaProject.Lesson47;

public class Lesson47_exercise2 {

	public static void main(String[] args) {
		ToolControl tc = new ToolControl();
		System.out.println(tc.setToolLocation("T1", 1));
		System.out.println(tc.setToolLocation("T1", 2));
		System.out.println(tc.setToolLocation("T2", 2));

		tc.deleteToolLocation("T1");
		System.out.println(tc.setToolLocation("T1", 76));

		System.out.println(tc.getToolRpm("T2"));
		System.out.println(tc.getPosition(76));
		System.out.println(tc.getFeedRate(1));
	}

}
