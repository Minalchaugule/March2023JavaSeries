package classAndObjects;
//A person is eligible to vote if his/her age is greater than or equal to 18.
//Define a method to find out if he/she is eligible to﻿ vote. - return true/false

public class MethodAssignVote {
	
	public boolean getVote(int a)
	{
		int age=0;
		boolean flag=true;
		System.out.println("Elibigity for Voting :");
		if(age>=18)
		{
		System.out.println("You are eligible for voting");
		System.out.println(flag);
		return flag;
		}
		else
		{
		System.out.println("You are not eligible for voting");
		flag=false;
		System.out.println(flag);
		return flag;
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodAssignVote m=new MethodAssignVote();
		m.getVote(25);
	
	}

}
