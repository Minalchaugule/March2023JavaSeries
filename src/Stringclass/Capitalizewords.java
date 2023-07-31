package Stringclass;

import java.util.Arrays;

public class Capitalizewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="naveen automation labs";
String[] words=str.split(" ");
String result="";
for(String s: words)
{
	String first=s.substring(0,1).toUpperCase();
	String rest=s.substring(1);//aveen
	 result=result +first+rest;	//
	 
}

System.out.println(result);

//String is a collection of characters 

String s="Testing";//String literals
String s1=new String("Testing");//string object using new keyword
String s2="Testing";

if(s==s1)//false - as one string created with literals will save in SCP area and other is created using object will save in heap area 
	//so both addresses will be different
{
	System.out.println("It compares both string address");
}

if(s==s2)//true - both string are used using literals ,both are saved in string constant pool with same addes
{
	System.out.println("It compares both string address");	
}
	

	}

}
