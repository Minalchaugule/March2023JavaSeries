package javaAssignments;

public class MultiplicationTable {

	public static void main(String[] args) {
		// multiplication of 5
	//Using for loop
		for(int i=5;i<=100;i++)
		{
			if(i%5==0)
			{
			System.out.println(i);	
		}
		}
		System.out.println("===========================");
		//Using while loop
		int j=5;
		while(j<=100)
		{
			if(j%5==0)
			{
				System.out.println(j);
			
			}
			j++;
		}
		System.out.println("===========================");
		//Using Do while loop
		int k=5;
	do {
		if(k%5==0)
		{
			System.out.println(k);	
		}
		k++;
	} while (k<=100);

	}

	}
