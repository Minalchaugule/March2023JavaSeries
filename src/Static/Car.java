package Static;

public class Car {
	
	String name;
	String chasisNumber;
	String engineNumber;
	double price;
	final static int wheels=4;
	
	//utils/generic functions
	public static void getLogo()//as logo is same in every page of application we can make it as static
	{
		System.out.println("Get logo of Car website");
	}
	
	public void getURL()//url is different in every page so nonstatic
	{
	System.out.println("get url");	
	}

	public static void main(String[] args) {
		
    Car c=new Car();
    c.name="Audi";
    c.engineNumber="RYjij5678908ghgyg";
    c.chasisNumber="hjkjkjhjkhj65467";
    c.price=15000000;
//    c.wheels=4;
    c.getURL();
    Car.getLogo();
    
    Car c1=new Car();
    c1.name="BMW";
    c1.engineNumber="weriubnv598695hgyg";
    c1.chasisNumber="2dfgfgasajkhj65467";
    c1.price=12000000;
    //c1.wheels=5;
    
    
    Car c2=new Car();
    c2.name="Nissan";
    c2.engineNumber="vxcnm4859ijrkfgv";
    c2.chasisNumber="hdeyw5gasajkhj65467";
    c2.price=20000000;
//    c2.wheels=4;
    
    //System.out.println(c.name +" "+c.chasisNumber +" "+ c.engineNumber +" "+ c.wheels);
    
    System.out.println(c.name +" "+c.chasisNumber +" "+ c.engineNumber +" "+ Car.wheels);
    
    
	}

}
