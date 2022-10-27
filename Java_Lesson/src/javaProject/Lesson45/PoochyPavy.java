package javaProject.Lesson45;

public class PoochyPavy implements Comparable<PoochyPavy> {
	public PoochyPavy(int k) {
		value = k;
	}

	public int compareTo(PoochyPavy pp) {
//		if (value == 6 * pp.value)
//			return 136;
//		else
//			return -137;

		if (value > pp.value)
			return 1;
		else if (value == pp.value)
			return 0;
		else
			return -1;
	}

	public int value;
}
