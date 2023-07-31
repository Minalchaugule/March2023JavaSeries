package classAndObjects;
//Method overloading -
//within same class if you have multiple methods
//1.method name should be same
//2.different no of  parameters
//3.with different types of parameter
//4.with the different sequence /order of parameter
//5.return type doesn't matter
//6.max limit of parameter -255
//7.polymorphism-poly-many and morphism-forms
//method overloading -is compile time polymorphism/static -which method needs to call that is decided during compile time
public class Person {
	
	public void test()
	{
		System.out.println("method with 0 parameter");
	}
	public void test(int a)
	{
		System.out.println("method with 1 parameter");
	}
	public void test(int a,int b)
	{
		System.out.println("method with 2 parameter");	
	}
	public void test(String a)
	{
		System.out.println("method with 1  string parameter");
	}
	
	public void test(String a,int b)
	{
		System.out.println("method with 2 int and  string parameters");
	}
	public void test(int a,String b)
	{
		System.out.println("method with 2 string and int parameters");
	}
	
	public void test(int a,String b,String c)
	{
		System.out.println("method with 3 parameters");
	}
	
	//real time use cases of method overloading
	//amazon search
	//Uber -cab booking
	//ECOm Login
	//payment option
	
	public void makePayment(String cc,String cvv)
	{
	System.out.println("Payment done using credit card");	
	}
	public void makePayment(String upi)
	{
		System.out.println("Payment done using upi");	
	}
	public void makePayment(String dc,String vcc,String otp)
	{
		System.out.println("Payment done using credit card and otp");
	}
	
	public void demo(int a)//call by value
	{
	System.out.println("hi");	
	}
	public void demo(Integer a)//call by reference
	{
		System.out.println("bye");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p=new Person();
p.makePayment("test@6ihf");
p.makePayment("23456457567767", "789");
p.makePayment("56763454658697", "789", "8732");
p.demo(10);


	}

}
