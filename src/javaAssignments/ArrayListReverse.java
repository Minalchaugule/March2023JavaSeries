package javaAssignments;

import java.util.ArrayList;

public class ArrayListReverse {

	public static void main(String[] args) {
		// Reverse this array List:
		ArrayList <String> clrList=new ArrayList <String>();
		clrList.add("Red");
		clrList.add("Orange");
		clrList.add("Yellow");
		clrList.add("Green");
		clrList.add("Blue");
		clrList.add("Purple");
		clrList.add("Indigo");
		System.out.println(clrList);
		
		for(int i=clrList.size()-1;i>=0;i--)
		{
			System.out.println(clrList.get(i));	
		}
		// a Java program to empty an array list.
//		clrList.removeAll(clrList);
//		System.out.println(clrList);
		
		//Java program to extract a portion of an array list.
		System.out.println(clrList.subList(0, 3));
		
		//Java program to trim the virtual capacity of an array list the current list size.
		System.out.println(clrList.size());
		clrList.trimToSize();
		
		//Java program to print all the elements of an ArrayList using the position of the elements
		//using index
		System.out.println("List of Elements using index :");
		System.out.println(clrList.get(0));
		System.out.println(clrList.get(1));
		System.out.println(clrList.get(2));
		System.out.println(clrList.get(3));
		System.out.println(clrList.get(4));
		System.out.println(clrList.get(5));
		System.out.println(clrList.get(6));
	}

}
