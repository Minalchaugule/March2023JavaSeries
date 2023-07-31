package javaAssignments;

public class floatSeries {

	public static void main(String[] args) {
		// print  1.0 2.0 3.0  ...... 10.0 

         //print 0 9 18 27 36 …99
		//using for loop
		for(float i=1.0f;i<=10.0f;i++)
		{
			System.out.println(i);
		}
		System.out.println("++++++++++++++++++++++++++++++");
		for(int j=9;j<=100;j++)
		{
			if(j%9==0)
			{
				System.out.println(j);
			}
		}
			System.out.println("using while loop");
			float f=1.0f;
			while(f<=10.0f)
			{
				System.out.println(f);
				f++;
			}
			System.out.println("++++++++++++++++++++++++++++++");
			int k=9;
			while(k<=100)
			{
				if(k%9==0)
				{
					System.out.println(k);
				}
				k++;
			}
		

	}

}
