package classAndObjects;
//

public class MethodAssignEvenOdd {
	
	public boolean verifyEvenodd(int a)
	{
	
	System.out.println("Given number is : "+a);
	if(a%2==0)
	{
		System.out.println("It is even number");
		return true;
	}
	else
	{
		System.out.println("It is odd number");
		return false;
	}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MethodAssignEvenOdd m=new MethodAssignEvenOdd();
	boolean s=m.verifyEvenodd(31);
	System.out.println(s);
	
	
	}

}
