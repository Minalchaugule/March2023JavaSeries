package Constructors;

public class Emp {

	 String name;
	 int id;
	 double salary;
	
	public Emp(String name, int id, double salary) {
		
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
//	public void SetID(int id)
//	{
//		this.id=id;
//	}
	
	public int getid()
	{
		return id;
	}
	
//	public void setName(String name)
//	{
//		this.name=name;
//	}
//	
	public String getName()
	{
		return name;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public double getSalary()
	{
		return salary;
	}
}
