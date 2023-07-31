package Inheritance;

public class CarTest {

	public static void main(String[] args) {
		// Parent class object
       Car c=new Car();
       c.start();
       c.stop();
       c.refuel();
       c.engine();
       c.vehicleDesign();
      //Car.billing();
       
       System.out.println("++++++++++++++++++++++++++++");
       //child class object
       BMW b=new BMW();
       b.start();
       b.autoparking();
       b.stop();
       b.refuel();
       b.engine();b.vehicleDesign();
       BMW.Billing();
       b.power();
       
       
      System.out.println("Wheels of car :"+b.wheels);
       
       
       System.out.println("++++++++++++++++++++++++++++");
       //upcasting
      
       Car cb=new BMW();
       cb.refuel();
       cb.start();
       cb.stop();
       cb.engine();
       cb.vehicleDesign();
       
       System.out.println("++++++++++++++++++++++++++++");
       Vehicle v=new BMW();
       v.engine();
//       v.start();//grand parent can't access ,child and grandchild class properties
//       v.stop();
//       v.autoparking();
//       v.refuel();
       
       System.out.println("++++++++++++++++++++++++++++");
       Automobile a=new Vehicle();
       a.vehicleDesign();
       
       System.out.println("++++++++++++++++++++++++++++");
       
       
       System.out.println("++++++++++++++++++++++++++++");
       //down casting-reference check point-class cast exception
//       BMW bw=(BMW) new Car();
//       bw.start();
//       bw.stop();
//       bw.refuel();
//       bw.autoparking();
       
       System.out.println("++++++++++++++++++++++++++++");
     //down casting-reference check point-class cast exception
      // BMW bv=(BMW) new Vehicle();
       //bv.engine();
       
       Audi au=new Audi();
       au.start();//overrided
       au.stop();//inherit from car
       au.refuel();//inherit from car
       au.engine();//inherit from vehicle-car
       au.power();//final class of car
       au.safety();//indivisual method
       au.Billing();//car inherited
       au.vehicleDesign();//inherited-automobile-car-audi
	}

}
