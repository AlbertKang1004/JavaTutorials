package javaProject.Lesson31;

public class Lesson31_exercise {

	public static void main(String[] args) {
		StringBuffer st = new StringBuffer("Hello");
		System.out.println(st.toString());
		
		StringBuffer sb = new StringBuffer();
		sb.append("Humpty Dumpty sat on a wall.");
		
		System.out.println(sb.substring(3, 8)); // pty D
		System.out.println(sb.substring(3)); // pty Dumpty sat on a wall.
		sb.append('K');
		System.out.println(sb.toString()); // Humpty Dumpty sat on a wall.K
		
		StringBuffer sss = new StringBuffer();
		sss.append("Hello");
		sb.append(sss);
		String s = sb.toString();
		System.out.println(s); // Humpty Dumpty sat on a wall.KHello
		
		System.out.println(sb.length()); // 34
		System.out.println(sb.charAt(4)); // t
		sb.setCharAt(7, 'C');
		String s2 = sb.toString();
		System.out.println(s2); // Humpty Cumpty sat on a wall.KHello
		sb.delete(7, 9);
		System.out.println(sb.toString()); // Humpty mpty sat on a wall.KHello
		sb.deleteCharAt(9);
		System.out.println(sb.toString()); // Humpty mpy sat on a wall.KHello
		sb.insert(0, 'B');
		System.out.println(sb.toString()); // Bumpty mpy sat on a wall.KHello
		sb.insert(1, "xxx");
		System.out.println(sb.toString()); // Bxxxmpty mpy sat on a wall.KHello
	}

}
