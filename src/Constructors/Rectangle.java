package Constructors;

public class Rectangle {

	
	public double length;
	public double height;
	
	public Rectangle()
	{
		System.out.println("I am default constructor");
		
	}
	
	
	public Rectangle(double length, double height) {
		this.length = length;
		this.height = height;
		
	}
	
	public Double calculateArea()
	{
		Double area=length*height;
		System.out.println("Area of rectangle is "+area);
		return area;
		
	}
}
