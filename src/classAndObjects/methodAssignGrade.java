package classAndObjects;

//ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

public class methodAssignGrade {
	
	public void verifyGrade(int m)
	{
		if(m>=91 && m<=100)
		{
			System.out.println("Your grade is AA");
		}
		else if(m>=81 && m<=90)
		{
			System.out.println("Your grade is AB");
		}
		else if(m>=71 && m<=80)
		{
			System.out.println("Your grade is BB");
		}
		else if(m>=61 && m<=70)
		{
			System.out.println("Your grade is BC");
		}
		else if(m>=51 && m<=60)
		{
			System.out.println("Your grade is CD");
		}
		else if(m>=41 && m<=50)
		{
			System.out.println("Your grade is DD");
		}
		else if(m<=40)
		{
			System.out.println("You are Fail");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodAssignGrade g=new methodAssignGrade();
		g.verifyGrade(23);
		g.verifyGrade(51);
		g.verifyGrade(99);
		g.verifyGrade(67);
		g.verifyGrade(43);
		g.verifyGrade(77);
		g.verifyGrade(87);
	}

}
