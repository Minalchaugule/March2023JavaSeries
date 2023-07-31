package MethodCallingConcept;
//we cant call other class non static method directly ,we need to create object of that class
public class Browser {
	
	public void b1()
	{
		System.out.println("browser-b1");
		b2();
		Employee.t1();
	}
	
	public void b2()
	{
		System.out.println("browser-b2");
		   Employee e=new Employee();
		   e.m1();
	}
	public  static void  p1()
	{
		System.out.println("browser-P1");	
	}

	
    
	}


