package javaAssignments;

public class Loops {

	public static void main(String[] args) {
		// print 5 times "I am Batman"
		for(int i=1;i<=5;i++)
		{
			System.out.println("I am Batman");
		}
		
		int count =1;
		for(int j=1;j<=10;j++)
		{
			System.out.println("I am Batman " + count);
			count++;
		}
		System.out.println("=============================================");
		//print "Hello World" ten times using while loop, do-while, for loop.
		//for loop
		for(int p=1;p<=10;p++) 
		{
			System.out.println("Hello world");
		}
		System.out.println("=============================================");
		
		//while loop
		int q=1;
		while(q<=10)
		{
			System.out.println("Hello world");
			q++;
		}
		System.out.println("=============================================");
		
		
		//do while loop
		int s=1;
		do {
			System.out.println("Hello world");
			s++;
		} while (s<=10);
		

	}

}
