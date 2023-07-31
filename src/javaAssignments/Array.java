package javaAssignments;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		//int array
 int a[]=new int[8];
 a[0]=1;
 a[1]=4;
 a[2]=5;
 a[3]=2;
 a[4]=3;
 a[5]=22;
 a[6]=31;
 a[7]=2;
 System.out.println(a[0]);
 System.out.println(a[2]);
 System.out.println(a[4]);
 //array literal
 int b[]={12,23,45,56,78,89,90};
 System.out.println(b[0]);
 System.out.println(b[3]);
 System.out.println(b[5]);
 System.out.println("++++++++++++++++++++++++++");
 //double array
 double d[]=new double[4];
 d[0]=34.45;
 d[1]=14.66;
 d[2]=29.18;
 d[3]=48.45;
 System.out.println(Arrays.toString(d));
 System.out.println("++++++++++++++++++++++++++");
 //float array
 float f[]={23.347f,56.120f,78.675f,13.231f};
 for(int i=0;i<=f.length-1;i++)
 {
	 System.out.println(f[i]);
 }
 System.out.println("++++++++++++++++++++++++++");
 //short array
 short sh[]=new short[3];
 sh[0]=11;
 sh[1]=33;
 sh[2]=55;
 
 for(short e:sh)
 {
	 System.out.println(e);
 }
 System.out.println("++++++++++++++++++++++++++");
 
 //String array
 String s[]=new String[5];
 s[0]="Chrome";
 s[1]="Firefox";
 s[2]="Edge";
 s[3]="IE";
 s[4]="safari";
 
 for(String e:s)
 {
	 System.out.println(e);
	 if(e.equals("Chrome"))
	 {
		 System.out.println("Launch chrome browser");
	 }
 }
 
 
	}

}
