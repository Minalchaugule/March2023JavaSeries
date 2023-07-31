package ExceptionHandling;

public class ThrowableKeyword {

	public void m1()throws ArithmeticException
	{
		System.out.println("m1 method");
		m2();
	}
	
	public void m2()throws ArithmeticException
	{
		System.out.println("m2 method");
		try {
		m3();
		}
		catch(Exception e)
		{
			System.out.println("Handled");
			e.printStackTrace();
		}
	}
	
	public void m3()throws ArithmeticException
	{
		System.out.println("m3 method");
		int sum=9/0;
	}
	
	public static void main(String[] args)throws ArithmeticException {
		// TODO Auto-generated method stub
		ThrowableKeyword obj=new ThrowableKeyword();
		obj.m1();
	
		System.out.println("bye");
	}

}
