package javaAssignments;

public class asciiValue {

	public static void main(String[] args) {
		// Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
		//using for loop
		for(char i='A';i<='Z';i++) 
		{
			int ch=(int)i;
			System.out.println(i +" "+ch);	
		}
		System.out.println("==============================");
		for(char i='a';i<='z';i++) 
		{
			int ch=(int)i;
			System.out.println(i +" "+ch);	
		}
		System.out.println("==============================");
		for(int i=0;i<=9;i++) 
		{
		
		System.out.println((char)i+ ""+i);	
		}
		System.out.println("==============================");
		//while loop
		char k='A';
		while(k<='Z') {
			int ch=(int)k;
			System.out.println(k +" "+ch);
			k++;
		}
		System.out.println("==============================");
			char p='a';
			while(p<='z') {
				int ch1=(int)p;
				System.out.println(p +" "+ch1);
				p++;
		}
			System.out.println("==============================");
			int q=0;
			while(q<=9)
			{
				System.out.println(q +" "+ (char)q);
				q++;
			}
	}

}
