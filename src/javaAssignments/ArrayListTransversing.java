package javaAssignments;

import java.util.ArrayList;

public class ArrayListTransversing {
//int arrayList
	public static void main(String[] args) {
	
		ArrayList<Integer> markList=new ArrayList<Integer>();
		markList.add(10);
		markList.add(20);
		markList.add(30);
		markList.add(40);
		System.out.println("Size of array:"+" "+ markList.size());
	    System.out.println(markList);
	    System.out.println(markList.get(3));
	    
	    //transversing using for loop(index based) 
	    for(int i=0;i<=markList.size()-1;i++)
	    {
	    	System.out.println(markList.get(i));
	    }
	    System.out.println("++++++++++++++++++++++++++++++++");
	    //transversing using for each loop
	    for(Integer e:markList)
	    {
	    	System.out.println(e);
	    	if(e.equals(30))
	    	{
	    		System.out.println("Hiiii");
	    		break;
	    	}
	    }
	    System.out.println("++++++++++++++++++++++++++++++++");
	    ArrayList <String> monthList= new ArrayList <String>();
	    monthList.add("Jan");
	    monthList.add("Feb");
	    monthList.add("May");
	    monthList.add("Aug");
	    System.out.println(monthList);
	    
	    for(String e:monthList)
	    {
	    	if(e.equalsIgnoreCase("Jan"))
	    	{
	    		System.out.println("First month of the year");
	    	}
	    	else 
	    	{
	    		System.out.println(" month of the year");
	    	}
	    }
	    
	    
	}

}