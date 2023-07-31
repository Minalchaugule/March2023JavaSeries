package MethodCallingConcept;

public class User {
	
	public void sendEmail()
	{
		System.out.println("User- non static-send email");
	}
	
	public static void getEmail(User u)
	{
		System.out.println("User-  static-get email");	
		u.sendEmail();
		u.test(40);
	}
	
	public static void readEmail(User u)
	{
		System.out.println("User-  static-get email");	
		u.sendEmail();	
		User.getEmail(u);
		//u.test(20);
	}
	
	public void test(int a)
	{
	System.out.println("non static ");
	User u2=new User();
	User.getEmail(u2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   User u1=new User();
   User.getEmail(u1);//call by reference
   u1.test(20);//call by value
	}

}
