package javaAssignments;

public class LoanSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String loanType="Housing loan";
int sal = 34999;
switch (loanType) {
case "Car loan":
	System.out.println("You can apply for car loan");
	break;
	
case "Housing loan":
	
	System.out.println("You can apply for housing loan");
	if(sal<=35000)
	{
	System.out.println("You are not eligible for housing loan");	
	}
	else
	{
		System.out.println("You are eligible for housing loan");
	}
	break;
	
case "Personal loan":
	System.out.println("You can apply for personal loan");
	break;
	
case "Educational loan":
	System.out.println("You can apply for educational loan");
	break;
	

default:
	System.out.println("pls pass correct loan type");
	break;
}
	}

}
