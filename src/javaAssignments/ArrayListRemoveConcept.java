package javaAssignments;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveConcept {

	public static void main(String[] args) {
		ArrayList <String> nameList= new ArrayList <String>();
	    nameList.add("Tanish");//0
	    nameList.add("Parshaw");//
	    nameList.add("Dhruv");//2
	    nameList.add("Ronak");//4
	    nameList.add("Aradhya");//5
	    nameList.add("null");//can add null values 
	    nameList.add("null");
	    System.out.println(nameList);
	    nameList.remove(1);
	    System.out.println(nameList);
	    nameList.add(2,"Vedika");//3-if u add in the index whixh has aleady data ,will shift to next index
	    nameList.add(1,"Prisha");//1
	    System.out.println(nameList);
	    //nameList.add(8,"Diya");//IOBE as arraysize is only 6
	   
	    //
	    ArrayList <Object> emp=new ArrayList <Object>();
	    emp.add("Minal");
		emp.add(2);
		emp.add(345.546);
		emp.add("India");
		System.out.println(emp);
		
		emp.remove(2);//it will remove 345.546 as it's index 2 and not 2 which is at index 1
		//always it gives preference to index not value
		System.out.println(emp);
	}

}
