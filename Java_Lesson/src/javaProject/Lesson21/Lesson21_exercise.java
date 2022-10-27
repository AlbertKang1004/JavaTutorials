package javaProject.Lesson21;

public class Lesson21_exercise {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		double dx = 4.567;
		Double dd = dx;
		
		Boolean bj = true;
		
		int ip = 123;
		Integer ozzie = ip;
		
		Character cw = 'a';
		char c = cw.charValue();
		
		Double d1 = 1.23, d2 = 4.56;
		double dd2 = d1.doubleValue() * d2.doubleValue();
		
		Integer i1 = 12, i2 = 34;
		int i3 = i1.intValue() + i2.intValue();
		
		Boolean bool = false;
		if (bool.booleanValue()) {}
		
		Double jj = 98.33;
		float ff = jj.floatValue();
		
		Double pk = 100.3;
		int gurg = pk.intValue(); // LOSE DECIMAL POINTS
	}
}
