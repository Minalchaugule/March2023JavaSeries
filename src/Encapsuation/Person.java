package Encapsuation;

public class Person {

	private String name;
	private int age;
	private char gender;
	
	
	public void printinfo()
	{
		System.out.println("Person name is :"+name);
		System.out.println("Person age is : " + age);
		System.out.println("Person gender is : "+gender);
	}
		
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
		public int getage()
		{
			return age;
		}
		
		public void setgender(char gender)
		{
			this.gender=gender;
		}
		public char getgender()
		{
			return gender;
		}
		
	}
	
	

