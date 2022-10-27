package javaProject.Lesson23;

import java.util.*;

public class SpecialToken {

	public SpecialToken() {

	}

	static String thirdToken(String str) {
		StringTokenizer t = new StringTokenizer(str);
		t.nextToken();
		t.nextToken();
		return t.nextToken();
	}
}
