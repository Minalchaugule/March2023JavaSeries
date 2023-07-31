package classAndObjects;

public class Testing {
	// WAF
			//launch browser-chrome,firefox ,safari
			//return -boolean
			//fun-launchBrowser
	//single return
	public boolean launchBrowser(String browserName)
	{
		System.out.println("Launching the browser :" +browserName);
		boolean flag =true;
		
	switch (browserName.trim().toLowerCase()) {
	case "Chrome":
		System.out.println("Launch chrome browser");
		break;
		
	case "Firefox":
		System.out.println("Launch firefox browser");
		break;
		
	case "Safari":
		System.out.println("Launch safari browser");
		break;
		
	case "Edge":
		System.out.println("Launch edge browser");
		break;
		

	default:
		System.out.println("Pass the correct browser " + browserName);
		flag=false;
		break;
	}	
	return flag;
	}
	
	//multiple returns
	public boolean launchBrowserTest(String browserName)
	{
		System.out.println("Launching the browser with multiple returns:" +browserName);
		
		
	switch (browserName.toLowerCase()) {
	case "Chrome":
		System.out.println("Launch chrome browser");
		return true;
		
	case "Firefox":
		System.out.println("Launch firefox browser");
		return true;
		
	case "Safari":
		System.out.println("Launch safari browser");
		return true;
		
	case "Edge":
		System.out.println("Launch edge browser");
		return true;
		

	default:
		System.out.println("Pass the right browser " + browserName);
		return false;	
	
	}
	
	}
	

	public static void main(String[] args) {
		Testing t=new Testing();
		if(t.launchBrowser("opera"))
			{
			System.out.println("Enter the url");
			};
		
			Testing t1=new Testing();
			boolean f=t1.launchBrowserTest("firefox");
			{
				System.out.println("Launch browser");
				System.out.println(f);
			}
			}
	
}

