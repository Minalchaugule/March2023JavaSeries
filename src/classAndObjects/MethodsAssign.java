package classAndObjects;

public class MethodsAssign {
	//program to print the addition/subtraction/division/multiplication of two numbers entered by user by defining your own method
	
	public int performAddition(int a,int b)
	{
	System.out.println("Addition of two number is : " +a+ " and " +b);
	int sum=a+b;
	return sum;
	}
	
	public int performSubstraction(int a,int b)
	{
	System.out.println("Subtraction of two number is : " +a+" and " +b);
	int sub=a-b;
	return sub;
	}
	
	public int performMultiplication(int a,int b)
	{
	System.out.println("multiplication of two number is :" +a+" and " +b);
	int mul=a*b;
	return mul;
	}
	
	public int performDivision(int a,int b)
	{
	System.out.println("Division of two number is :" +a+" and " +b);
	int div=a/b;
	return div;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsAssign m=new MethodsAssign();
		int s=m.performAddition(10,30);
		System.out.println(s);
		int sb= m.performSubstraction(12, 56);
		System.out.println(sb);
		int ml=m.performMultiplication(32, 4);
		System.out.println(ml);
		int d=m.performDivision(26,5);
		System.out.println(d);
	}

}
