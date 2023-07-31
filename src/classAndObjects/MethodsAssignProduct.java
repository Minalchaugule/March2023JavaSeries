package classAndObjects;

public class MethodsAssignProduct {
	
	public double multiplication(double a,double b)
	{
		System.out.println("Products of two numbers :" +a+ " "+b);
		double c=a*b;
		return c;
	}
	
	public void circlearea(int r)
	{
	System.out.println("Area of circle : ");
	double a =3.14*r*r;
	System.out.println(a);
	
	System.out.println("Circumference of circle : ");
	double c =2*3.14*r;
	System.out.println(c);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MethodsAssignProduct m=new MethodsAssignProduct();
		 double s=m.multiplication(1234556, 43);
		 System.out.println(s);
		 
		 m.circlearea(5);
	}

}
