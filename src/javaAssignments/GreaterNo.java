package javaAssignments;

public class GreaterNo {

	public static void main(String[] args) {
		// Find out the greatest number out of three different given numbers:25,78 and 87
		int a=25;
		int b=78;
		int c=87;
		if(a>b && a>c)
		{
			System.out.println("a is greater no");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater no");	
		}
		else if(c>a && c>b)
		{
			System.out.println("c is greater no");	
		}

	}

}
