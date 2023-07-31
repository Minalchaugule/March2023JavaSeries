package classAndObjects;

public class Employee {
	//class-category/blueprint/template
	//object-physical entity created from class
	//each object has it's own properties
	String name;//global/class variables
	int age;
	String city;
	double salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;//local variables
		//create an object of class using new keyword
		Employee emp=new Employee();
		//Employee -class name
		//emp=object reference name
		//new=keyword
		//new Employee()-object
		
		emp.name="Prisha";
		emp.age=30;
		emp.salary=123.456;
		emp.city="London";
		
		System.out.println(emp.name);
		System.out.println(emp.city);
		System.out.println(emp.age);
		System.out.println(emp.salary);
		System.out.println("====================");
		
		//we can create multiple object for a class
		Employee emp1=new Employee();
		System.out.println(emp1.name);//null
		System.out.println(emp1.city);//null
		System.out.println(emp1.age);//0
		System.out.println(emp1.salary);//0.0
		
		

	}

}
