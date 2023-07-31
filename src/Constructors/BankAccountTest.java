package Constructors;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount ac=new BankAccount("1323456897", 25000);
System.out.println("available Balance is " +ac.balance);
ac.deposit(5000);
System.out.println("available Balance is " +ac.balance);
ac.withdraw(7000);
System.out.println("available Balance is " +ac.balance);
ac.deposit(15000);
System.out.println("available Balance is " +ac.balance);
ac.withdraw(6000);
System.out.println("available Balance is " +ac.balance);
	}

}
