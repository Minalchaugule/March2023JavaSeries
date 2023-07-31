package javaAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> ar=new ArrayList<String>(5);
ar.add("Circle");
ar.add("Triangle");
ar.add("Square");
ar.add("Rectangular");
System.out.println(ar);
ar.set(2, "Semi Circle");
System.out.println(ar);
ar.remove(1);

ArrayList <Integer> numList=new ArrayList<Integer>();
numList.add(34);
numList.add(2);
numList.add(15);
numList.add(48);
System.out.println(numList);
numList.remove(2);//it removes index 2 value
System.out.println(numList);
numList.remove((Object)2);//it removes value 2 -need to upcast value to object
System.out.println(numList);

//Array Literals
ArrayList <String> browserList=new ArrayList<String>(Arrays.asList("Chrome","Firefox","Edge","Safari"));
System.out.println(browserList);
//Collections.reverse(browserList);
//System.out.println(browserList);//reversed list

//for(String e:browserList)
//{
//	System.out.println(e);
//}
//reverse string using for loop
for(int i=browserList.size()-1;i>=0;i--)
{
	System.out.println(browserList.get(i));
}
//arrayList for integer using literals

ArrayList<Integer>numberList =new ArrayList<Integer>(Arrays.asList(11,22,33,44,55,66,77,88));
System.out.println(numberList);
//Collections.reverse(numberList);
//System.out.println(numberList);
numberList.add(99);
System.out.println(numberList);

//converting static array into arraylist(int)
Integer[]num={5,10,15,20};//for integer array ,we need to declare array with Integer class 
ArrayList<Integer>noList =new ArrayList<Integer>(Arrays.asList(num));
System.out.println(noList);


//converting static array into arraylist(String)

String [] sList= {"Heart","Diamand","Spade"};
ArrayList <String> shapeList=new ArrayList<String>(Arrays.asList(sList));
System.out.println(shapeList);

//creating arraylist using new keyword and literals
ArrayList <String> courseList=new ArrayList<String>(){
{
	add("Java");
	add("Phyton");
	add("Perl");
	add("JavaScript");
}
};//vc=6 and pc=4
System.out.println(courseList.size());
courseList.trimToSize();//it trim virtual capacity to current physical capacity-no change in o/p ,it happens internally
courseList.add("Typescript");
courseList.add(0,"Ruby");
//courseList.add(9,"Perl");
System.out.println(courseList.size());
System.out.println(courseList);

//swaping
Collections.swap(courseList, 2, 4);
System.out.println(courseList);
//reverse
Collections.reverse(courseList);
System.out.println(courseList);
//empty
List<Object> ls=Collections.emptyList();
System.out.println(ls.size());


//Creating immutable List -it can;t be changed
List <Integer>list=List.of(12,13,14,15);
//list.add(34);
//System.out.println(list);//UnsupportedOperationException-as we cant add any values further
//list.remove(1);//UnsupportedOperationException-s we cant remove any values further
//System.out.println(list);

Collections.swap(courseList, 2, 4);
	}

}
