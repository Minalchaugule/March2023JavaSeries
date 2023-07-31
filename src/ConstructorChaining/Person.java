package ConstructorChaining;

public class Person {
	
	public String name;
	public long phno;
	public char gender;
	
	public Person()
	{
		this("Minal",95934535533l);
	}
	
	public Person(String name, long phno) {
		this(name,phno,'F');
		this.name = "Prisha";
		this.phno = 23456789765432l;
		
	}

	public Person(String name, long phno, char gender) {
	
		this.name = name;
		this.phno = phno;
		this.gender = gender;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Person p=new Person();
    System.out.println(p.name);
    System.out.println(p.phno);
    System.out.println(p.gender);
	}

}
