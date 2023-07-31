package javaAssignments;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p[] = {1,4,5,2,3,22,31, 2};
		System.out.println(Arrays.toString(p));
		int[] a = new int[p.length-1];

		int j = 0;
		for (int i = 0; i < p.length; i++) {
		    if (p[i] != 22) {
		        a[j] = p[i];
		        j++;
		    }
		}

		System.out.println(Arrays.toString(a));
		System.out.println("===============================");
	
	// --name, age, team name, DOB, gender, Strike Rate-Try to create multiple Object Arrays for different players -try to print all the values of each player 
	Object s[]= {"Prisha",20,"India","5th Feb","F",112.34};
	System.out.println(Arrays.toString(s));
	
	
	System.out.println("===============================");
	Object emp[]=new Object[5];
	emp[0]="Minal";
	emp[1]=35;
	emp[2]="India";
	emp[3]="27th Jan";
	emp[4]=123.45;
	System.out.println(Arrays.toString(emp));
	for(Object e:emp)
	{
		System.out.println(e);
	}
		
		//reverse order with index based loop
		for(int k=emp.length-1;k>=0;k--)
		{
			System.out.println(emp[k]);
		}
		System.out.println("===============================");
		Object emp1[]=new Object[5];
		emp1[0]="Vipul";
		emp1[1]=20;
		emp1[2]="UK";
		emp1[3]="4th Feb";
		emp1[4]=234.45;
		System.out.println(Arrays.toString(emp1));
		for(Object e:emp1)
		{
			System.out.println(e);
		}
	
	
	
	
	}


}
