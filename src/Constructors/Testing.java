package Constructors;
// as constructor is private ,we can't create object of class ,so can't access any method outside the class but we can create inside the class
//in that case ,if user want to access methods outside the class,then need to declare as static method
//System class has private constructor in java
public class Testing {
	
	private Testing()
	{
		System.out.println("I am private constructor");
	}
	
	public static void getdata()
	{
		System.out.println("method");
	}
	public static void main(String[] args) 
	{
		Testing t=new Testing();
		t.getdata();
	}
}
