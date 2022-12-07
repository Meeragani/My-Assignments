package week1.day1;

public class Bike {
	public void applyBreak()
	{
		System.out.println("Bike Applied break");
    }
	public void soundHorn()
	{
		System.out.println("Bike sound horn");
    }
	
	public static void main(String[] args) {
	
		Car car =new Car();
		car.applyBreak();
		car.soundHorn();
		
		Bike bike = new Bike();
		bike.applyBreak();
		bike.soundHorn();
		
		
	}
}

