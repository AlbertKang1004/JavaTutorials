package javaProject.Lesson37;

public class Lesson37_exercise {
	public static void main(String[] args) {
//		withdraw(-1);
//		setStudentScore(111);
		car(33);
	}

	public static void withdraw(double amount) {
		int balance = 100;
		if (amount > balance) {
			String s = "Can't withdraw more than the balance.";
			IllegalArgumentException e = new IllegalArgumentException(s);
			throw e;
		}

		if (amount <= 0) {
			String s = "Withdrawal amount must be greater than 0.";
			IllegalArgumentException e = new IllegalArgumentException(s);
			throw e;
		}
	}

	public static void setStudentScore(int score) {
		if (score > 100) {
			String s = "NOT POSSIBLE";
			IllegalArgumentException e = new IllegalArgumentException(s);
			throw e;
		}

		if (score < 0) {
			String s = "Do you really think negative scores are possible?";
			IllegalArgumentException e = new IllegalArgumentException(s);
			throw e;
		}
	}

	public static String car(int xs) {
		int i = 0;
		try {
			i = xs / 0;
			return i + "";
		} catch (ArithmeticException e) {
			i = 2;
			System.out.println("ERROR DETECTED");
			return i + "";
		}
	}
}
