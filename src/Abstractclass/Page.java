package Abstractclass;
//can't create object of abstract class


public abstract class Page {
	
	public Page()
	{
		this(5);
		System.out.println("Page -default constructor");
	}
	
	public Page(int b)
	{
		System.out.println("Page -constructor with para"+b);
	}
	public abstract void title();
	
	public abstract void url();
	
	public void defaultPageTimeout()
	{
	System.out.println("default time out -20secs");	
	}
	
	public static void pageFooter()
	{
	System.out.println("Get page footer");	
    }
	
	public final void DisplayLogo()
	{
		System.out.println("Logo displayed");
	}
    }
