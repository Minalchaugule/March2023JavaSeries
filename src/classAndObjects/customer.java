package classAndObjects;

public class customer {

	// class variables/global variables /instance variables
	  String name;
	  int age;
	  //data members of the class-
	  //1.variables-class
	  //2.methods/functions-are used for buss logic/features and implementations/actions
	  //can't create method inside in any another method
	  //but we can call method from other method
	  //methods are independent or parallel to each other
	  
	  //Types of methods -no return type ,with return type
	  
	  //1.no return and no input
	  public void test()
	  {
		  System.out.println("I am test method");
		  int i=10;
		  System.out.println(i);
	  }
	  //2.return something and no input
	  //return type int
	  public int sum()
	  {
		  System.out.println("Sum Method");
		  int a=20;
		  int b=30;
		  int c=a+b;
		  return c;
		  
	  }
	  //return type String
	  public String getTrainerName()
	  {
		  System.out.println("GetTrainerName method");
		  String name="Minal";
		  return name;  
	  }
	  
	  public int getNumber()
	  {
		  System.out.println("Getnumber method");
		  return 100;
		  }
	  //3.return something and some input
	  public int multiplication(int a,int b)//parameters
	  {
		  System.out.println("Multiplication method");
		  int m=a*b;
		  return m;
	  }
	  
	  public int addition(int a,int b)//parameters
	  {
		  System.out.println("addition method");
		  int n=a+b;
		  return n;
	  }
	  
	  public double getTotalScore(int score,int handwritingScore,int attendanceScore)
	  {
		  System.out.println("I am getTotal Score method");
		  double tscore=score+handwritingScore+attendanceScore;
		  return tscore;
	  }
	  
	  public void getURL()
	  {
		  System.out.println("launch the url");
		  return;//return blank /no return -void
	  }
	  
	public static void main(String[] args) {
		
		customer c=new customer();
		c.test();//calling method
		c.name="Tom";
		c.age=30;
		
		int m1=c.sum();//calling method
		System.out.println(m1);
		System.out.println(m1-5+10);
		
		String trainer=c.getTrainerName();
		System.out.println(trainer + " for Java and Selenium");
		if(trainer.equalsIgnoreCase("Minal"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		int n=c.getNumber();
		System.out.println(n+50);
		
	int mul=c.multiplication(2, 4);//arguments
	System.out.println(mul);
	
	int add=c.addition(15,40);
	System.out.println(add);
	
	double sc=c.getTotalScore(90,-40,70);
	System.out.println("Total score of the student :"+ sc);
	
	}

}
