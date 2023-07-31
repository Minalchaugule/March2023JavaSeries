package Abstractclass;

public  class Login extends Page{

	public Login()
	{
		System.out.println("Login -constructor");
	}
	
	public Login(int i)
	{
		System.out.println("Login - constructor with parameter "+i);
	}
	@Override
	public void title() {
		System.out.println("Login Page titile");
	}

	@Override
	public void url() {
		System.out.println("https://google.com");
		}
	@Override
	public void defaultPageTimeout()
	{
	System.out.println("default time out -5 secs");	
	}
	
	public void doLogin()
	{
		System.out.println("App login");
	}
	

}
