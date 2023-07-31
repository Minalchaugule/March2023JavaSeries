package ConstructorChaining;

public class Employee {
	
	public String name;
	public int age;
	public double salary;
	
	public Employee()
	{
		this("Prisha",5);
		
	}
	
	public Employee(String name, int age, double salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public Employee(String name, int age) {
		this(name,age,34.56d);
		this.name ="Tanish";
		this.age = 5;
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.salary);
	}
	

}
