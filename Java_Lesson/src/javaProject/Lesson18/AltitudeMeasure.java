package javaProject.Lesson18;

import java.util.*;

public class AltitudeMeasure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<Double> altitude = new ArrayList<>();
		boolean bool = true;
		final double B = 107.0;

		do {
			System.out.println("------------------------------------");
			System.out.println("If no more data is needed, enter \"exit\"");
			
			System.out.print("Enter the first person's name : ");
			String name1 = sc.nextLine();
		
		
			if (name1.equals("exit"))
				bool = false;
			else {
				System.out.print("Enter the second person's name : ");
				String name2 = sc.nextLine();
		
				String names = name1 + " + " + name2;
				name.add(names);

				System.out.print("Enter Azimuth angle #1 : ");
				double az1 = sc.nextDouble();
				
				System.out.print("Enter Elevation angle #1 : ");
				double ev1 = sc.nextDouble();
				
				System.out.print("Enter Azimuth angle #2 : ");
				double az2 = sc.nextDouble();
				
				System.out.print("Enter Elevation angle #2 : ");
				double ev2 = sc.nextDouble();
			
				
				sc.nextLine();
				
				double h1 = (B * Math.sin(Math.toRadians(az2)) * Math.tan(Math.toRadians(ev1)))
						/ Math.sin(Math.toRadians(az1 + az2));
				double h2 = (B * Math.sin(Math.toRadians(az1)) * Math.tan(Math.toRadians(ev2)))
						/ Math.sin(Math.toRadians(az1 + az2));
				double alt = (h1 + h2) / 2;
				altitude.add(alt);
				
//				double closure_error = Math.abs((h1 - h2) / (2 * alt)) * 100;
			}
		} while (bool);
		sc.close();
		
		System.out.println("| Name\t\t\t| Apogee |");
		for (int i = 0; i < name.size(); i++) {
			System.out.printf("| %-22s| %6.2f |\n", name.get(i), altitude.get(i));
		}
		

//		System.out.println("Enter Baseline length");
//		double B = sc.nextDouble();
		

	}

}
