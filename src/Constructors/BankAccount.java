package Constructors;

public class BankAccount {
	
	String accountNumber;
	double balance;
	
	
	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount)
	{
		
		 this.balance=balance+amount;
		System.out.println(balance);
		
		
	}
	
	public void withdraw(double amt)
	{
		
		double withdraw=this.balance-amt;
		System.out.println(withdraw);
		this.balance=withdraw;
		
		
	}

}
