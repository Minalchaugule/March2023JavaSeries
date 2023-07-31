package Encapsuation;

public class Employee {

	//private variables
	private String name;
	private int age;
	private double salary;
	private int amount;
	
	private  void calculateBonus()
	{
		int i=10;
	    int r=3;
	    amount=i*r;
	}
	
	public int getAmount(int i)
	{
		calculateBonus();
		return amount;
	}
	
	
	//public getter and setter method
	
	public void setname(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setage(int age)
	{
		this.age=age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public double getsalary()
	{
		return salary;
	}
}
