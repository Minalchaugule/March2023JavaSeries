package Constructors;

public class Employee {
	
	String name;
	int age;
	String city;
	
	public Employee()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee();
e1.name="Minal";
e1.age=35;
e1.city="London";



Employee e2=new Employee();
e2.name="Prisha";
e2.age=5;
e2.city="Bangalore";

//Testing t1=new Testing();//as constructor is defined as private we cant create object 
Testing.getdata();
	}

}
