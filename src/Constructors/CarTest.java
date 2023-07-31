package Constructors;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Car c=new Car();
      
      c.make="unknown";
      System.out.println(c.make);
      
      c.model="unknown";
      System.out.println(c.model);
      
//      c.year=unknown;
//      System.out.println(c.year);

      Car c1=new Car("Audi","Minal",2001);
      System.out.println(" Make : "+c1.make +" Model :"+c1.model+" year :"+c1.year);
      
 
	}

}
