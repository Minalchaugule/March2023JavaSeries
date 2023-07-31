package classAndObjects;

public class MethodAssignMinMax {
//Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
	
	public void getMaxnumber(int a,int b,int c)
	{
		System.out.println("Maximum number among three numbers");
		if(a>b && a>c)
		{
			System.out.println("Max number is :"+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Max number is :"+b);	
		}
		else if(c>a && c>b)
		{
			System.out.println("Max number is :"+c);
		}
	}
	
	public void getMinnumber(int a,int b,int c)
	{
		System.out.println("Minimum number among three numbers");
		if(a<b && a<c)
		{
			System.out.println("Min number is :"+a);
		}
		else if(b<a && b<c)
		{
			System.out.println("Min number is :"+b);	
		}
		else if(c<a && c<b)
		{
			System.out.println("Min number is :"+c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodAssignMinMax m=new MethodAssignMinMax();
		m.getMaxnumber(20,30,40);
		m.getMinnumber(45,60,85);
	}	

}
