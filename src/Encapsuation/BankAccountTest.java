package Encapsuation;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount b=new BankAccount();
b.setOwner("Prisha");
b.setAccountNumber("2345678908765");
b.setBalance(20000);
System.out.println("Actual balance is :" +b.getBalance());
b.Deposit(5000);
b.withdraw(1000);
b.printStatement();
	}

}
