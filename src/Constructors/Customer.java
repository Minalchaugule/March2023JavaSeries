package Constructors;

public class Customer {

	String  name;
	int custID;
	String city;
	long phoneNumber;
	public Customer(String name, int custID, String city, long phoneNumber) {
		
		this.name = name;
		this.custID = custID;
		this.city = city;
		this.phoneNumber = phoneNumber;
		
		//business logic return sal/bonus/ctc ???????????????????????
		//NO
	}
	//always write business logic/feature logic /implementation in methods not in constructor
	public int getSalary(int bonus,int ctc)
	{
		return bonus+ctc;
	}
}
