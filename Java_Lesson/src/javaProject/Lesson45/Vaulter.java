package javaProject.Lesson45;

public class Vaulter implements Comparable<Vaulter> {

	public Vaulter(String player_name, int highest_vault) {
		name = player_name;
		height = highest_vault;
	}

	@Override
	public int compareTo(Vaulter o) {
		if (o.height > height)
			return 1;
		else if (o.height == height)
			return 0;
		else
			return -1;
	}

	public String name;
	public int height;

}
