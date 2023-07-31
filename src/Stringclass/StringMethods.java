package Stringclass;

public class StringMethods {
	
	public static void Stringcompare()
	{
		 String mesg="Welcome to Amazon as Admin";
	      if(mesg.indexOf("Admin")>0)
	      {
	    	  System.out.println("present");
	    	  System.out.println(mesg.indexOf("Admin"));
	    	  
	      }
	      else
	      {
	    	  System.out.println("Fail");
	    	  System.out.println(mesg.indexOf("Admin"));
	      }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//. Write a program that gives you the last half of the string.
		
		String s="Java Automation";
		System.out.println(s.length());
		System.out.println(s.substring(s.length()/2,s.length()));
		System.out.println("================");
		
		//Write a program to get the 3rd  “ e “ of the string -eg: “Welcome to Naveen Automation Labs ! “
		
		String t= "Welcome to Naveen Automation Labs!";
		System.out.println(t.indexOf('e'));//1st occurance
		System.out.println(t.indexOf('e',t.indexOf('e')+1 ));//2nd occurance
		System.out.println(t.indexOf('e',t.indexOf('e',t.indexOf('e')+1 )+1));//3rd occurance
		System.out.println("================");
		
		//Write a method which gives an index of (-1) if string is not available.
		//it should return integer. if String is present, then it should return the specific index.
		  Stringcompare();
		  System.out.println("================");
		
		//Write a program that breaks a whole string into small strings, and prints out its all values . (Hint: split, loop) 
		String p="I love all programing langauges like Java ,Phyton ,Ruby and JavaScript";
		String ar[]=p.split(",");
		//System.out.println(ar[0]);
	
		for(int i=0;i<=ar.length-1;i++)
		{
		System.out.println(ar[i]);
		}
	
		System.out.println("================");
	//Assume that a string consists of 3 words, print out the middle one.
		String b="I will love My India so much";
        String ab[]= b.split(" ");
        System.out.println(ab[ab.length/2]);
        
        System.out.println("================");
        //get only numberic values
        String msg = "your transaction id is: 12345 and reference id is 34567";
     String m1[]=msg.split(":");
     System.out.println(m1[0]);
     System.out.println(m1[1].trim());
     String n1[]=m1[1].split("and");
     System.out.println(n1[0].trim());
     String  p1[]=n1[1].split("is");
     System.out.println(p1[1].trim());
	

		}
       
       
	}	

