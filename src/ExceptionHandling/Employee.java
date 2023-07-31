package ExceptionHandling;

import java.util.Arrays;

public class Employee {
	
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("A");
System.out.println("A");
System.out.println("A");

try
{
	Employee e=new Employee();
	e.name=null;
	System.out.println(e.name);//NPE
int sum =12/0; //Arithmatic exception
System.out.println("Hello");

int Arrays[]=new int[3];
Arrays[4]=34;

}

catch(NullPointerException ne)
{
	System.out.println("Null pointer exception");
}

catch(Exception ae)
{
	System.out.println("exeception is catched");
	ae.printStackTrace();
}

catch(Throwable e)
{
	System.out.println("exeception is catched");
	e.printStackTrace();
}

System.out.println("Bye");
	}

}
