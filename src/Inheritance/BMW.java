package Inheritance;

public class BMW extends Car{
	
	final int wheels=6;
	 
	public void start()
	{
		System.out.println("BMW-start");
	}
	
	public void autoparking()
	{
	System.out.println("BMW -autoParking");	
	}
	
	@Override
	public void engine()
	{
		System.out.println("BMW -engine");
	}
	
//	public static void Billing()
//	{
//		System.out.println("BMW -Billing ");
//	}
	//indivisual method
	private void Tyres()
	{
		System.out.println("BMW -Tyre");
	}
	//final method cant be overriden
//	@Override
//	public void power()
//	{
//		
//	}
	//final methods cant be overriden
// public static void abs()
//	{
//		System.out.println("Car -abs");
//	}
//	
}
