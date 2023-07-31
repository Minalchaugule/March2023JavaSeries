package Stringclass;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="Hello this is my java code and i am very happy";//created in SCP
       s.intern();//try to create same string in CPL but it is actually exists ,so no use
       //how to get length of the string
       System.out.println("Lenght of the string is :"+s.length());
       
       //specific character at index
      System.out.println(s.charAt(0));
      System.out.println(s.charAt(37));
      //System.out.println(s.charAt(41));//String index out of bound exception
      
      //specific index of the character
      System.out.println("=========================");
      System.out.println(s.indexOf("m"));
      System.out.println(s.indexOf("i"));//if multiple same character are there ,it will always look for first one-ist occurance of i
      System.out.println(s.indexOf("i",s.indexOf("i")+1)); ///2nd occurance of i
      System.out.println(s.indexOf("i",s.indexOf("i",s.indexOf("i")+1)+1));
      System.out.println(s.charAt(31));
      
      
      System.out.println(s.indexOf("java"));
      System.out.println(s.indexOf("Cypress"));//for incorrect string it always gives -1 as index
      
      //selenium example-after login verify logged in user
      String mesg="Welcome null";
      if(mesg.indexOf("Admin")>0)
      {System.out.println("Admin is present");
      }
      else
      {
    	  System.out.println("Fail");
      }
      
      String s2="    Selenium   ";
      s2.trim();//stored in heap 
      System.out.println(s2);//so it is giving same out
      System.out.println(s2.trim());
      
       
      //replace method
      
      String dob="01-10-1990";
      dob=dob.replaceAll("-","/");
      System.out.println(dob);
      
      
      String a="   Java Automaton    ";
//      a=a.trim();
//      System.out.println(a);
      a=a.replace(" ","");
      System.out.println(a);
      a=a.concat("Cypress");
      System.out.println(a);
	}

}
