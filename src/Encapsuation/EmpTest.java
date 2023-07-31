package Encapsuation;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee e=new Employee();
      e.setname("Minal");
      e.setage(35);
      e.setSalary(345.567);
     System.out.println(e.getName());
     System.out.println(e.getAge());
     System.out.println(e.getsalary());
     System.out.println(e.getAmount(0));
     
     Employee e1=new Employee();
     System.out.println(e1.getName());
     System.out.println(e1.getAge());
     System.out.println(e1.getsalary());
     System.out.println(e1.getAmount(20));
     
     
    Login lp=new Login();
    lp.setUsername("Prisha");
    lp.setPassword("Minal@123");
    lp.doLogin();
    
    Login lp1=new Login();
    lp1.setUsername("Tanish");
    lp1.setPassword("Tanish@123");
    lp1.doLogin();
    
	}
	

}
