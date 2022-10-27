package javaProject.Lesson40;

public class ModFib {
	public ModFib() {
	}

	public static int modFibbonacci(int n) {
		if (n == 0)
			return 3;
		else if (n == 1)
			return 5;
		else if (n == 2)
			return 8;
		else
			return (modFibbonacci(n - 1) + modFibbonacci(n - 2) + modFibbonacci(n - 3));
	}
}
