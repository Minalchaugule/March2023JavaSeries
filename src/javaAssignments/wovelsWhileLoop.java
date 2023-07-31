package javaAssignments;

public class wovelsWhileLoop {

	public static void main(String[] args) {
		char ch='a';
		while(ch<='z')
		{
			if(ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u') {
				System.out.println("It is vowel "+ch);
			}
			ch++;
		}
		System.out.println("using for loop");
		for(char c='a';c<='z';c++)
		{
			if(c=='a')
			{
				System.out.println("It is vowel " +c);
			}
			else if(c=='e')
			{
				System.out.println("It is vowel " +c);	
			}
			else if(c=='i')
			{
				System.out.println("It is vowel " +c);	
			}
			else if(c=='o')
			{
				System.out.println("It is vowel " +c);	
			}
			else if(c=='u')
			{
				System.out.println("It is vowel " +c);	
			}
		}

	}

}
