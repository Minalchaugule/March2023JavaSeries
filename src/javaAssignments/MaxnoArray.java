package javaAssignments;

public class MaxnoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[][]={{23,45,56},{12,67,89},{10,90,34}};

int max=array[0][0];
for(int i=0;i<=2;i++)
{
	for(int j=0;j<=2;j++)
	{
		if(array[i][j]>max)
		{
			max=array[i][j];
		}
		
	}
	
}
System.out.println(max);	}
	

}
