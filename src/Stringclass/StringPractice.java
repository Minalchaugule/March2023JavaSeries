package Stringclass;

import java.util.Arrays;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s1="JavaProgram";//created in string constant pool -Javaprogram
   String s2="Java";//created in string constant pool -java
   String s3=s2+"Program";//will create s3(JavaProgram) in heap area -s2(java) already in scp and wil create "Program" also in scp
   String s4="Java"+"Program";//refer to s1 as already present in scp
   System.out.println(s1==s3);//false
   System.out.println(s1==s4);//true
   System.out.println("==========================");
   
   //upper and lower case
   String ts="This is my java code";
   System.out.println(ts.toUpperCase());
   System.out.println(ts.toLowerCase());
   System.out.println("==========================");
   
   //Substring
   String mg="Your Username is Minal";
   System.out.println(mg.substring(4));
  System.out.println(mg.substring(0,9));
  //how to get only minal
   System.out.println(mg.substring(mg.indexOf("is")+3,mg.length()));
   System.out.println("==========================");
   
   //contains method
   String g="Your Username is Minal";
   System.out.println(g.contains("Minal"));
   if(g.contains("Minal"))
   {
	   System.out.println("Logged in successfully");
   }
   System.out.println("==========================");
   
   //equals and equalsingnorecase
   String p1="Hello selenium";
   String p2="Hello Selenium";
   System.out.println(p1==p2);
   System.out.println(p1.equals(p2));
   System.out.println(p1.equalsIgnoreCase(p2));
   System.out.println("==========================");
   
   //Spilt method -always return string array 
   
   String lang="Java_phyton_Ruby_Javascript";
   String lg[]=lang.split("_");
   System.out.println(lg[0]);
   System.out.println(lg[1]);
   System.out.println(lg[2]);
   System.out.println(lg[3]);
   System.out.println(Arrays.toString(lg));
   
   System.out.println("==========================");
   //interview question
   String top="xXTestingXxXSeleniumXXxXAutomationxXXCypress";
   String tp[]=top.split("xX");
   System.out.println(tp[0]);//nothing as split happens and xX and left side of xX is nothing
   System.out.println(tp[1]);//TestingX
   System.out.println(tp[2]);//SeleniumXX
   System.out.println(tp[3]);//Automation
   System.out.println(tp[4]);//Xcypress
  // System.out.println(tp[5]);//AIOBE exception
   System.out.println("==========================");
   
   
   //split using words/string
   String st="Your Username is Minal";
   String userid=st.split("is")[1].trim();
   System.out.println(userid);
   System.out.println("==========================");
   
   //empdata 
   String emp="Minal;Chaugule;London;HA5 3LZ;SDET ;123.344";
   String e[]=emp.split(";");
   for(String s:e)
   {
	   System.out.println(s);
   }
   System.out.println("==========================");
   
   String user="Prisha|Chaugule|London|HA5 3LZ|SDET|123.344";
   String u[]=user.split("|");
  System.out.println(u[0]);//it gives p as zero index as pipe is used as regular expression
  String ur[]=user.split("\\|");
  System.out.println(ur[0]);
  
  System.out.println("==========================");
  String d1="I love Java and I am so happy";
  //o/p=I love "Java" and I am so happy
  d1="I my \"Java\" and I am so happy";
  		System.out.println(d1);
  	xpath("Tanish")	;
  		
   }
	//generic xpath scenario
	public static void xpath(String empName) {
		String xpath="//a[text()='"+empName+"']";
		System.out.println(xpath);
	}

}
