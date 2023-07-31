package Constructors;

public class Login {
	
	String username;
	String password;
	
	public Login(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
	
	public void Dologin()
	{
		System.out.println("Do login");
		System.out.println("Entering username"+username);
		System.out.println("Entering password"+password);
		System.out.println("User logged in");
	}
	
	public void resetPassword()
	{
		System.out.println("Reset my password");
	}

}
