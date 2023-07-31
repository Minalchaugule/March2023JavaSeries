package Constructors;

public class Car {
	
	String make;
	String model;
	int year;
	
	public Car()
	{
		System.out.println("default constructor");
	}

	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public void setmake(String make)
	{
	this.make=make;
	}
	
	public void setmodel(String model)
	{
	this.model=model;
	}
	
	public void setyear(int year)
	{
	this.year=year;
	}
}
