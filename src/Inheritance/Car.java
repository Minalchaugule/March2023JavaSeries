package Inheritance;

public class Car extends Vehicle{
final int wheels=4;
	
	public void start()
	{
		System.out.println("Car -start");
	}
	
	public void stop()
	{
		System.out.println("Car -stop");
	}
	
	public void refuel()
	{
		System.out.println("Car -refuel");
	}
	
	public void engine()
	{
		System.out.println("Car -engine");
	}
	//can't be overriden static method
	public static void Billing()
	{
		System.out.println("Car -Billing ");
	}
	
	private void Tyres()
	{
		System.out.println("Car -Tyre");
	}
	//can't be overriden but can b inherit
	final public void power()
	{
		System.out.println("car-power");
	}
	//can't be overriden
	final public static void abs()
	{
		System.out.println("Car -abs");
	}
	
}
