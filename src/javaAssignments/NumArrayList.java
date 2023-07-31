package javaAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NumArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> numList=new ArrayList<Integer>(Arrays.asList(1,5,4,3,9,6,7,0,2,8));
System.out.println(numList);
Collections.sort(numList);
System.out.println(numList);
//reverse 
Collections.reverse(numList);
System.out.println(numList);
numList.add(numList.size()/2,14);
System.out.println(numList);
	}

}
