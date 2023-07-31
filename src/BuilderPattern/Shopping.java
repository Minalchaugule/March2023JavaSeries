package BuilderPattern;

public class Shopping {

	public Shopping Login()
	{
		System.out.println("User logged in already");
		return this;
		}
	
	public Shopping Login(String username,String password)
	{
		System.out.println("User logged in with username and password");
		return this;
	}
	
	public Shopping Searchproduct(String ProductName)
	{
		System.out.println("Search product by name");
		return this;
	}
	
	public Shopping Searchproduct(String ProductName,int price)
	{
		System.out.println("Search product by name and price");
		return this;
	}
	
	public Shopping addtoCart(String ProductName)
	{
			System.out.println("Add to cart :"+ProductName);	
			return this;
    }
	public Shopping doPayment(String cc,int cvv)
		{
			System.out.println("Payment done using credit card");
			return this;
		}
	
	public Shopping doPayment(String upi)
	{
		System.out.println("Payment done using upi");
		return this;
	}
	
	public Shopping generateOrder()
	{
		System.out.println("Generating order :2345675432");
		return this;
	}
	
	public Shopping logout()
	{
		System.out.println("Logout from the application");
		return this;
	}
	}
	

