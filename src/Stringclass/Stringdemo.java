package Stringclass;

public class Stringdemo {

	public static void main(String[] args) {
	String s="Automation";
	String s1=new String("Automation");
	System.out.println(s.equalsIgnoreCase(s1));//compares content
	System.out.println(s==s1);//compares address
	
	//remove space
	String a="    Hello Everyone   ";
	System.out.println(a.replace(" ", ""));
	
	//first and last char
	String b="Prisha Chaugule";
	System.out.println(b.charAt(0));
	System.out.println(b.charAt(b.length()-1));
	
	//program to verify a word or a character contained in the sentence.
	String c="Java Selenium";
	System.out.println(c.indexOf('v'));
	System.out.println(c.indexOf("Selenium"));
	
	//Assume that a string consists of 3 words, print out the middle one. 
	String t= "I love Prisha";
	System.out.println(t.split(t));
	

	}

}
