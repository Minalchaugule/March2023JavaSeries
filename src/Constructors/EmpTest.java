package Constructors;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Emp e=new Emp("Prisha",10001,20000000d);
  System.out.println(e.getid());
  System.out.println(e.getName());
  System.out.println(e.getSalary());
  
  e.setSalary(20000+1000);
  System.out.println(e.salary);
  
  
	}

}
