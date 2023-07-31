package Static;

public class Devices {

	//class static variables -static keyword
	String name;
	static int warrenty;
	
	public void getservices()
	{
		System.out.println("non static method");
	}
	
	public static void skipservices()
	{
		System.out.println("static method");	
	}
	
	public static void main(String[] args) {
		
		Devices c= new Devices();
		c.name="phone";
		c.getservices();
		System.out.println(c.name);
		// how to access static members in the main method
		//1.using class name
		Devices.warrenty=30;
		Devices.skipservices();
		System.out.println(Devices.warrenty);
		//2.static members can accessed directly also
		warrenty=40;
		skipservices();
		System.out.println(warrenty);
		//3.by using reference name
          c.warrenty=10;
          c.skipservices();
          System.out.println(c.warrenty);
	}

}
