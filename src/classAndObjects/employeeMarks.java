package classAndObjects;

// TODO Auto-generated method stub
//create account :write a function
		//function-getEmployeeMarks
		//input parameter=empName(String)
		//return marks(int)

public class employeeMarks {

	public int getEmployeeMarks(String empName)
	{
		System.out.println(" getting Employee marks :" +empName);
		int marks=-1;
		if(empName.equalsIgnoreCase("Prisha"))
		{
			marks=90;
		}
		else if(empName.equalsIgnoreCase("Minal"))
		{
			marks=60;
		}
		else if(empName.equalsIgnoreCase("Sandy"))
		{
			marks=40;
		}
		else if(empName.equalsIgnoreCase("Tanish"))
		{
			marks=10;
		}
		else
		{
			System.out.println("Employee name is not found....");
		}
		return marks;
	}

	public static void main(String[] args) {
	
	employeeMarks marks=new employeeMarks();
	int m1=marks.getEmployeeMarks("Minal");
	if(m1>=0)
	{
		System.out.println("Get Employee Marksheet");
	}
	System.out.println(m1);

}
}