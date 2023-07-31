package javaAssignments;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		// -add some colors (string) and print out the colorslist.
		ArrayList <String> clrList=new ArrayList <String>();
		clrList.add("Red");
		clrList.add("Orange");
		clrList.add("Yellow");
		clrList.add("Green");
		clrList.add("Blue");
		clrList.add("Purple");
		clrList.add("Indigo");
		System.out.println(clrList);
		
		//program to retrieve an element at a specified index from a given array list.
		System.out.println(clrList.get(3));
		System.out.println(clrList.get(6));
		
		//program to update specific array element by given element.
		clrList.add(5,"Violet");
		System.out.println(clrList);
		
		//program to remove the third element from an array list. 
		clrList.remove(2);
		System.out.println(clrList);
		
		//program to search an element in an array list using for loop. Once we find that element, break the loop.
		System.out.println("==========================");
		for(String e: clrList)
		{
			System.out.println(e);
			if(e.equalsIgnoreCase("purple")) 
			{
			System.out.println("color macthes");
			break;
			}
			
		}
		System.out.println("==========================");
		for(int i=0;i<=clrList.size()-1;i++)
		{
			System.out.println(clrList.get(i));
			if(clrList.get(i).equalsIgnoreCase("Green"))
			{
				System.out.println("Matching color");
				//break;
			}
		}
		
		
	}

}
