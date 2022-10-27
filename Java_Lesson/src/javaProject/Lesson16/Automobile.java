package javaProject.Lesson16;

public class Automobile {
	
	public double mile;
	private double mpg = 23;
	
	public Automobile(double mileage) {
		mpg = mileage;
	}
	
	public void fillUp(double add) {
		mile += add;
	}
	
	public void takeTrip(double sub) {
		mile -= sub / mpg;
	}
	
	public double reportFuel() {
		return mile;
	}
}
