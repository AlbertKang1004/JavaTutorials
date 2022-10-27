package javaProject.Lesson50;

public class Lesson50_project {

	public static void main(String[] args) {
		StackLL st = new StackLL();
		System.out.println(st.size()); // 0
		st.push(157.3);
		st.push(22);
		st.push(-18);
		double j = st.pop();
		System.out.println(j); // -18.0
		System.out.println(st.peek()); // 22.0
		System.out.println(st.pop()); // 22.0
		System.out.println(st.size()); // 1
		st.clear();
		System.out.println(st.size()); // 0
	}

}
