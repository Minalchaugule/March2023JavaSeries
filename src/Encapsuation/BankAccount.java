package Encapsuation;

public class BankAccount {

	private String owner;
	private String accountNumber;
	private double balance;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void Deposit(double deposit)
	{
		balance=this.balance+deposit;
		System.out.println("Available balance after deposit :" +balance);
	}
	
	public void withdraw(double withdraw)
	{
		balance=this.balance-withdraw;
		System.out.println("Available balance after withdraw :" +balance);
	}
	
	public void printStatement()
	{
	System.out.println("Account owner is : "+owner);
	System.out.println("Account number is : "+accountNumber);
	System.out.println("Account balance is : "+balance);
	}
}
