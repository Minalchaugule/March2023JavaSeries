package javaAssignments;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //It is dynamic array -as size is not fixed
		//we can store different data types in single array and it stores value in sorted order
		//default -virtual capacity is 10 and and if user add values in 6 then physical capacity is 6 and remaining is 4.
		//if user add all 10 then 10/2=5 new more space will be added.add 2 values ,so now vc=15 and pc=12
		//pc/2=new virtual capacity=load factor
		//Object Creation -ArrayList is a class
		ArrayList ar=new ArrayList();
		System.out.println(ar.size());
		ar.add("Selenium");
		ar.add(12);
		ar.add('c');
		ar.add(12.345f);

		System.out.println("Size of array:"+" "+ ar.size());
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		System.out.println(ar.get(2));
		System.out.println(ar.get(3));
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		ar.add(500);
		ar.add(600);
		
		System.out.println("Size of array:"+" "+ ar.size());
		
		System.out.println(ar.get(4));
		System.out.println(ar.get(5));
		System.out.println(ar.get(6));
		System.out.println(ar.get(7));
		System.out.println(ar.get(8));
		System.out.println(ar.get(9));
		
		//now restrict the arraylist -using generics
		//int generics -<> for int need to use class "Integer"
		//double generics -<> for int need to use class "Double"
		//float generics -<> for int need to use class "Float"
		
		System.out.println("=============================");
		//int AL
		ArrayList<Integer> markList=new ArrayList<Integer>();
		markList.add(10);
		markList.add(20);
		markList.add(30);
		markList.add(40);
		System.out.println("Size of array:"+" "+ markList.size());
	    System.out.println(markList);
		
		//double Al
		
	    System.out.println("=============================");	
		ArrayList<Double> bmList=new ArrayList<Double>();//vc=10 and pc=0
		System.out.println("Size of array:"+" "+ bmList.size());
		bmList.add(123.45);
		bmList.add(12.00);
		bmList.add(23.09);//vc=10 and pc=3
		
	    System.out.println(bmList);
		System.out.println("Size of array:"+" "+ markList.size());
		System.out.println("=============================");
		
		//String AL
		ArrayList <String> empList=new ArrayList<String>();
		System.out.println("Size of array:"+" "+ empList.size());
		empList.add("Prisha");
		empList.add("Anvi");
		empList.add("Theia");
		empList.add("River");
		empList.add("Hania");
		empList.add("Hanas");
		
		System.out.println(empList);
		System.out.println("Size of array:"+" "+ empList.size());
		
		}
	

}

