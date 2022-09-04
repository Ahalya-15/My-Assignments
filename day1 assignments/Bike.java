package week1.day1;

public class Bike {
	public void applyBreak() {
		System.out.println("Break Applied");

	}
	public void soundHorn() {
		System.out.println("Sound Horn");

	}
	public static void main(String[] args) {
		Bike action=new Bike();
		Car action1=new Car();
		action1.applyBreak();
		action1.soundHorn();
		
		
	}
}
