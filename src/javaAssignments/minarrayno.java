package javaAssignments;

public class minarrayno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{12,-45,78},{23,-10,67},{26,90,100}};
int min=a[0][0];

for(int i=0;i<=2;i++)
{
	for(int j=0;j<=2;j++)
	{
		if(a[i][j]<min)
		{
			min=a[i][j];
		}
	}
}
System.out.println(min);		
	
	
	
	}
}