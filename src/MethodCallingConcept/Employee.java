package MethodCallingConcept;

public class Employee {
	
	public void m1()
	{
		System.out.println("M1 method");
		m2();
	}
	
	public void m2()
	{
		System.out.println("M2 method");
		
	}
	
	public void m3()
	{
		System.out.println("M3 method");
		Browser b1=new Browser();
		b1.b2();
	}
	
	public static void t1()
	{
		System.out.println("Browser -static method t1");
		t2();
	}
	
	public static  void t2()
	{
		System.out.println("Browser -static method t2");
		t3();
	}
	
	public static void t3()
	{
		//whenever we call t3 method ,everytime it calls m1 method which is non static hence need to create object everytime
		//hence we need to use call by reference
		System.out.println("Browser -static method t3");
		Employee e1=new Employee();
		e1.m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee e=new Employee();
    e.m1();
     t1();
     Browser.p1();
	}

}
