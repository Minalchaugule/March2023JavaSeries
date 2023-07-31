
public class IfelseCase {

	public static void main(String[] args) {
		
		// if else
		int x=10;
		int y=20;
		if(x==y)
		{
			System.out.println("x is equal to y");
		}
		else
		{
			System.out.println("x isnot equal to y");	
		}
		if(x>=y)
		{
			System.out.println("x is greater than or equal to y");
		}
		else
		{
			System.out.println("x is less than or equal to y");	
		}
		
		//<,>,==,<=,>=,!=
		if(x!=y)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		if(true)
		{
			System.out.println("Hiiii");
		}
		else
		{
			System.out.println("Bye"); //dead code as it is not executing 
		}
		
		//double 
		double a=23.34;
		double b=23.45;
		if(a==b)
		{
			System.out.println("a and b are equal");
		}
		else
		{
			System.out.println("a and b arenot equal");	
		}
		//char 
		char ch='b';
		char ch1='a';
		if(97==ch1)
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("both arenot equal");
		}
		
		//marks grade
		int marks=72;
		if(marks<=100)
		{
			if(marks>=90)
			{
				System.out.println("Grade A");
				if(marks>=95)
				{
					System.out.println("Eligible for scholarship");
				}
				else
				{
					System.out.println("Not Eligible for scholarship");	
				}
			}
			else {
				System.out.println("Grade B");
				if(marks>=75)
				{
					System.out.println("20% discount for fee");
				}
				else
				{
					System.out.println("No Discount");
				}
				
			}
		}
		else {
			System.out.println("Incorrect marks");
		}
		
		//if -if -if
		//Never use if if if statement as it checks to each if statement even when browser is matched ,
		//so it is time consuming and affects performance
		
		String browserName="Opera";
		if(browserName.equals("Chrome"))
		{
		System.out.println("Launch Chrome browser");	
		}
		if(browserName.equals("Firefox"))
		{
		System.out.println("Launch Firefox browser");	
		}
		if(browserName.equals("IE"))
		{
		System.out.println("Launch IE browser");	
		}
		if(browserName.equals("Safari"))
		{
		System.out.println("Launch Safari browser");	
		}
		if(browserName.equals("Edge"))
		{
		System.out.println("Launch Edge browser");	
		}
		else {
			System.out.println("Pls pass the right browser"+browserName);
		}
		//if -else if
		//slightly better option but again ,it checks all conditions until it matches and 
		//it will be problematic if user writes browser="Minal",it checks all conditions then checks for else
		
		String browser="chrome";
		if(browser.equals("chrome"))
		{
		System.out.println("Launch Chrome browser");	
		}
		else if(browser.equals("Firefox"))
		{
		System.out.println("Launch Firefox browser");	
		}
		else if(browser.equals("IE"))
		{
		System.out.println("Launch IE browser");	
		}
		else if(browser.equals("Safari"))
		{
		System.out.println("Launch Safari browser");	
		}
		else if(browser.equals("Edge"))
		{
		System.out.println("Launch Edge browser");	
		}
		else {
			System.out.println("Pls pass the right browser"+browser);
		}
		
		char ch11='a';
		System.out.println(ch11++);
		System.out.println(ch11);
		
		char t='d';
		int r=t+3;
		System.out.println(r);
		System.out.println((char)t+3);
		
	}

}
