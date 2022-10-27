package javaProject.Lesson20;
// Question in 313 - 12

public class MathProbability {
	
	final static int question_number = 30;
	final static double rep_prob = 0.1;

	public static void main(String[] args) {
		char[] test = testGenerator();
		for (char c : test) {
			System.out.print(c + " ");
		}
		System.out.println();

		double right_count = 0;
		for (int i = 0; i < test.length; i++) {
			if (test[i] == 'C')
				right_count++;
		}
		double prob1 = (right_count / (test.length)) * 100;
		System.out.println("When only C is selected: " + prob1 + "%");

		right_count = 0;
		for (int i = 0; i < test.length; i++) {
			if (i % 2 == 0) {
				if (test[i] == 'B')
					right_count++;
			} else {
				if (test[i] == 'C')
					right_count++;
			}
		}
		prob1 = (right_count / (test.length)) * 100;
		System.out.println("B - C - B - C: " + prob1 + "%");
		
		for (int i = 0; i < test.length; i++) {
			if (i % 2 == 0) {
				if (test[i] == 'C')
					right_count++;
			} else {
				if (test[i] == 'B')
					right_count++;
			}
		}
		prob1 = (right_count / (test.length)) * 100;
		System.out.println("C - B - C - B: " + prob1 + "%");
	}
	
	public static char[] testGenerator() {
		
		char[] test = new char[question_number];
		for (int i = 0; i < test.length; i++) {
			double n = Math.random();
			double temp = 0;
			double a = 0.15, b = 0.25, c = 0.30, d = 0.15, e = 0.15; // determines each probabilities
			if (i != 0) {
				switch (test[i - 1]) {
				case 'A':
					temp = a - (a * rep_prob);
					a *= rep_prob;
					b /= (1 - temp);
					c /= (1 - temp);
					d /= (1 - temp);
					e /= (1 - temp);
					break;
				case 'B':
					temp = b - (b * rep_prob);
					b *= rep_prob;
					a /= (1 - temp);
					c /= (1 - temp);
					d /= (1 - temp);
					e /= (1 - temp);
					break;
				case 'C':
					temp = c - (c * rep_prob);
					c *= rep_prob;
					a /= (1 - temp);
					b /= (1 - temp);
					d /= (1 - temp);
					e /= (1 - temp);
					break;
				case 'D':
					temp = d - (d * rep_prob);
					d *= rep_prob;
					a /= (1 - temp);
					b /= (1 - temp);
					c /= (1 - temp);
					e /= (1 - temp);
					break;
				case 'E':
					temp = e - (e * rep_prob);
					e *= rep_prob;
					a /= (1 - temp);
					b /= (1 - temp);
					c /= (1 - temp);
					d /= (1 - temp);
					break;
				}
			}

			if (0 <= n && n < a) { // 15% for A
				test[i] = 'A';
			} else if (a <= n && n < a + b) { // 25% for B
				test[i] = 'B';
			} else if (a + b <= n && n < a + b + c) {// 30% for C
				test[i] = 'C';
			} else if (a + b + c <= n && n < a + b + c + d) { // 15% for D
				test[i] = 'D';
			} else if (a + b + c + d <= n && n < 1) { // 15% for E
				test[i] = 'E';
			} 
		}
		return test;
	}
}
