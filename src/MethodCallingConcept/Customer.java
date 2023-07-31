package MethodCallingConcept;

public class Customer {
	
	public void c1()
	{
		System.out.println("c1 method");
		c2();
		Customer cs=new Customer();
		Customer.c5(cs);
		
	}
	
	public void c2()
	{
		System.out.println("c2 method");
		c3();
	}
	public void c3()
	{
		System.out.println("c3 method");
		
	}
	
	public static void c4(Customer cc)
	{
		System.out.println("c4 static method");	
		cc.c1();
		Customer.c5(cc);
	}
	
	public static void c5(Customer cc)
	{
		System.out.println("c5 static method");	
		cc.c2();
	}
	
	
	
	public static void main(String[] args) {
		Customer c=new Customer();
		c.c1();
Customer.c4(c);

}}

