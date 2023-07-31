package Encapsuation;

public class RegisterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Register r=new Register("Vipul",23,9876546372l,"Kolhapur",true);
    System.out.println(r.getName());
    System.out.println(r.getAge());
    System.out.println(r.getPhnumber());
    System.out.println(r.getCity());
    System.out.println(r.isPerm());
    System.out.println("======================");
    //update data
    r.setCity("Bangalore");
    r.setPhnumber(3456903424956754l);
    
    
    System.out.println(r.getName());
    System.out.println(r.getAge());
    System.out.println(r.getPhnumber());
    System.out.println(r.getCity());
    System.out.println(r.isPerm());
    
    System.out.println("======================");
    
    Register r1=new Register("Nikhil",234567865);
    System.out.println(r1.getName());
    System.out.println(r1.getAge());
    System.out.println(r1.getPhnumber());
    System.out.println(r1.getCity());
    System.out.println(r1.isPerm());
    
	}

}
