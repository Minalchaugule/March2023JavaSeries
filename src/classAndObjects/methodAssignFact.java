package classAndObjects;
//Write a program to print the factorial of a number by defining a method named 'Factorial'.


public class methodAssignFact {

	public void getFactorial(int a)
	{
		int fact=1;

		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
			}
		System.out.println("Factorial of " + a +" is : " +fact);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodAssignFact f=new methodAssignFact();
		f.getFactorial(5);
		f.getFactorial(4);
		f.getFactorial(3);
		f.getFactorial(2);
		f.getFactorial(1);
		f.getFactorial(0);
	}
	

}
