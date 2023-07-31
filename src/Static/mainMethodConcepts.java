package Static;

//JVM is calling main method - Why JVM should create object to call main method so it is static in nature
//main method is used for calling purpose only and there is no business logic
//as it doesn't return anything ,hence it is void
//part of cma-common  area 
//can we overload main method -yes
//JVM always looks for method which has public static void main(String[] args) -static method can be overloaded
//when there are 2 class with main method only and both class try to call other class main method by using classname.main() and o/p will be
//sort of looping A main executed then B main executed again n again (infinite calling)and then gets exception as "StackOverflowError"

public class mainMethodConcepts {

	public static void main(String[] args) {
		
		System.out.println("Main");
		
		mainMethodConcepts.main(20);
		mainMethodConcepts.main("Minal");
		}
	
	public static void main(int a)
	{
		System.out.println("overload");
	}
	
	public static void main(String b)
	{
		System.out.println("overloaded again");
	}

}
